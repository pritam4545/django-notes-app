def call(String tag) {
  withCredeantials([usernamePassword(
    credentialsId: "docker-cred",
    passwordVariable: "docker_pass",
    usernameVariable: "docker_user"
    )]) {
       sh "docker login -u "${docker_user}" -p "${docker_pass}""
       sh "docker push "${docker_user}"/notes-app:"${tag}""
    }
}
