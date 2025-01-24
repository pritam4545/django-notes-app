def call(String tag) {
  withCredentials([usernamePassword(
    credentialsId: "docker-cred",
    passwordVariable: "docker_pass",
    usernameVariable: "docker_user"
    )]) {
        sh '''
           #!/bin/bash
           echo "Logging into dockerhub with the username ${docker_user}"
           docker login -u ${docker_user} -p ${docker_pass}
           echo "Login Successfull in ${docker_user}"
           echo "Pushing the image into ${docker_user} account"
           docker push ${docker_user}/notes-app:${tag}
           Push Successfull into ${docker_user}
        '''
    }
}
