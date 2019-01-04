
node {
  def branchVersion = ""

  stage ('Checkout') {
    // checkout input branch 
    git credentialsId: 'anagavaram', url: 'https://github.com/anagavaram/sample-boot'

     sh "git checkout ${params.BRANCH_NAME}"
  }


  stage ('Build') {
    // build .war package
   sh 'mvn clean package -U'
  }
  
  
}