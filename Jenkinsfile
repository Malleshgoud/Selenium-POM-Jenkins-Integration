
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

            // Publish TestNG results in Jenkins
            junit testResults: 'target/surefire-reports/TEST-*.xml',
                  allowEmptyResults: true

            // Archive TestNG reports
            archiveArtifacts artifacts: 'target/surefire-reports/**',
                             allowEmptyArchive: true

            // Archive ExtentReports
            archiveArtifacts artifacts: 'reports/**',
                             allowEmptyArchive: true

            // Publish TestNG HTML report
            publishHTML(target: [
                allowMissing: true,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'target/surefire-reports',
                reportFiles: 'emailable-report.html',
                reportName: 'TestNG Report'
            ])

            // Publish ExtentReports
            publishHTML(target: [
                allowMissing: true,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'reports',
                reportFiles: 'TestAutomationExtentReport.html',
                reportName: 'Enterprise Selenium Automation Extent Report'
            ])

            echo 'TestNG and ExtentReports published successfully'
        }
    }
}
