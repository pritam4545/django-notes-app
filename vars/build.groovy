def call(String tag) {
       sh "docker build -t pritam44/notes-app:${tag} ."
    }
}
