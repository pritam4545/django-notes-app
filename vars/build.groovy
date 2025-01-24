def call(String tag) {
  withcredentialsId([usernamePassword(
    credentialsId: "docker-cred",
    passwordVariable: "docker_pass",
    usernameVariable: "docker_user"
    )]) {
       sh "docker build -t ${docker_user}/notes-app:${tag} ."
    }
}
