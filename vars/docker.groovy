def call() {
  sh '''
     sudo apt update -y
     sudo apt-get install docker.io -y
     sudo systemctl enable docker 
     sudo usermod -aG docker $(whoami)
  '''
}
