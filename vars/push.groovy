def call(String image,String imagetag, String user){
   withCredentials([usernamePassword(
                    credentialsId:"Dockerhubcred",
                    usernameVariable: "User",
                    passwordVariable: "Pass")]){
                sh "docker login -u ${env.User} -p ${env.Pass} "
                sh "docker image tag ${image}:${imagetag} ${user}/${image}:${imagetag}"
                sh "docker push ${user}/${image}:${imagetag}"
                    }
}
