def call(String tag) {
  sh "docker build -t "${docker_user}"/notes-app:"${tag}""
}
