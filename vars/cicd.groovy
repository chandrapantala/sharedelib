def newgit(repo)
{
  git "https://github.com/intelliqittrainings/${repo}.git"
}
def newMaven()
{
  sh 'mvn package'
}
def newDeploy(job,ip,con)
{
  sh "scp /var/lib/jenkins/workspace/${job}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${con}.war"
}

