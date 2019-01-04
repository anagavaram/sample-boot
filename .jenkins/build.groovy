
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
    sh "cp target/careers-0.0.1-SNAPSHOT.jar .docker/build/"
    def testImage = docker.build("test-image", ".docker/build/")
  }
  
}