def call(String docker_user, String tag) {
  sh "docker build -t "${docker_user}"/notes-app:"${tag}""
}
