
node {
  def branchVersion = ""

  stage ('Checkout') {
    // checkout repository
    checkout scm

    // checkout input branch 
    git url: 'https://github.com/anagavaram/sample-boot', branch: '${caller.env.BRANCH_NAME}'
 //"git checkout ${caller.env.BRANCH_NAME}"
  }


  stage ('Java Build') {
    // build .war package
    //sh 'mvn clean package -U'

    String mvnHome = tool("M3");
    "${mvnHome}/bin/mvn -B verify"
  }
}
