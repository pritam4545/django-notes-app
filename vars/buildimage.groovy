def call(String tag) {
       echo "Bulding docker image with tag:${tag}"
       sh "docker build -t pritam44/notes-app:${tag} ."
       echo "The docker image building is completed with tag:${tag}"
}
