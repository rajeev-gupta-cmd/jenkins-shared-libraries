def call(String url, String branch ){
  git url: ${url} , branch: ${branch}
  sh 'git checkout b72f8ab'
}
