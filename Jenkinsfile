node {
    stage('git clone') {
        git branch: 'master',
            url: 'https://github.com/Evgeny11111/jenkinsFinal'
            
    }
    stage('build') {
        sh 'mvn -f java/pom.xml clean verify'
    }
    stage('test') {
        sh 'mvn -f java/pom.xml test'
    }
    stage('sonar_qube') {
        def scannerHome = tool 'MySonar';
        withSonarQubeEnv('MySonar') {
            sh "${scannerHome}/bin/sonar-scanner \
            -Dsonar.projectKey=pipeline \
            -Dsonar.sources=java/src/main \
            -Dsonar.tests=java/src/test \
            -Dsonar.java.binaries=target/classes \
            -Dsonar.junit.reportPaths=target/surefire-reports \
            -Dsonar.coverage.jacoco.xmlReportPaths=target/site/jacoco/jacoco.xml"
        }
    }
    stage('allure') {
    stage('allure') {
        allure([results: [[path: 'allure']]])

    }
}
