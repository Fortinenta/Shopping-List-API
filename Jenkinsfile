pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Fortinenta/Shopping-List-API.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t lindya/shoppinglist:latest .'
                sh 'docker push lindya/shoppinglist:latest'
            }
        }
        stage('Deploy to Kubernetes') {
            steps {
                sh 'kubectl apply -f deployment.yaml'
                sh 'kubectl apply -f service.yaml'
                sh 'kubectl apply -f ingress.yaml'
            }
        }
    }
}