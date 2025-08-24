pipeline {
    agent any

    tools {
        maven 'MAVEN_HOME'   // yeh name Jenkins me Tools configuration me set karna padega
        jdk 'JAVA_HOME'      // yeh bhi Jenkins me configure hona chahiye
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/username/repo-name.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                // yahan deployment steps aayenge (e.g. Docker, Tomcat, AWS, etc.)
            }
        }
    }

    post {
        success {
            echo '✅ Build and Deploy Successful!'
        }
        failure {
            echo '❌ Build Failed!'
        }
    }
}
