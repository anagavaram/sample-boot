
node {
  def branchVersion = ""

  stage ('Checkout') {
    // checkout input branch 
   checkout scm

   sh "git checkout ${params.BRANCH_NAME}"
  }


  stage ('Build') {
    // build .war package
   sh 'mvn clean package -U'
  }
  
  stage ('Build Docker Image'){
    def dockerfile = 'Dockerfile'
    def customImage = docker.build("my-image:sample-boot", "-f ${dockerfile} ./docker/build/")
  }
  
}