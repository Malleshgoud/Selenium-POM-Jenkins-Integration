
pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Malleshgoud/Selenium-POM-Jenkins-Integration.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            // Archive ExtentReports and screenshots
            archiveArtifacts artifacts: 'reports/**',
                             allowEmptyArchive: true

            // Publish Extent HTML Report
            publishHTML(target: [
                allowMissing: true,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'reports',
                reportFiles: 'ExtentReport.html',
                reportName: 'Extent Report'
            ])

            echo 'Reports archived and published successfully'
        }
    }
}
