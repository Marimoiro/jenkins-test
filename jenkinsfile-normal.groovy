pipeline {


    agent {
        node {
            label 'master'
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
