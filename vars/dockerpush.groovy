def call(String tag) {
  withCredentials([usernamePassword(
    credentialsId: "docker-cred",
    passwordVariable: "docker_pass",
    usernameVariable: "docker_user"
    )]) {
       echo "Logging into dockerhub with the username ${docker_user}"
       sh "docker login -u ${docker_user} -p ${docker_pass}"
       echo "Login Successfull in ${docker_user}"
       echo "Pushing the image into ${docker_user} account"
       sh "docker push ${docker_user}/notes-app:${tag}"
       echo "Push Successfull into ${docker_user}"
    }
}
