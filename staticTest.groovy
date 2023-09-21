def call(credentials) {
    withSonarQubeEnv(credentialsId: credentials) {
     sh 'mvn clean package sonar:sonar'
}
   
}