def call(string image, string user-image){
   withCredentials([usernamePassword(
                    credentialsId:"Dockerhubcred",
                    usernameVariable: "User",
                    passwordVariable: "Pass")]){
                sh "docker login -u ${env.User} -p ${env.Pass} "
                sh "docker image tag ${image} ${user-image}"
                sh "docker push ${user-image}"
                    }
}
