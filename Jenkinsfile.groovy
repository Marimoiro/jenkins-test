pipeline {


    agent {
        node {
            label 'master'
            customWorkspace "C:\\Workspace\\${env:JOB_BASE_NAME}"
        }
    }
    
    stages {
        stage('checkout') {
            steps {
                echo "hello";
            }
        }
    }
}
