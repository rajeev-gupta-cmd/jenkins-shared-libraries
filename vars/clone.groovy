def call(String url, String branch ){
  sh "git url: ${url} , branch: ${branch}"
  sh 'git checkout b72f8ab'
}
