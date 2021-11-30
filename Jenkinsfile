pipeline {
  agent any
  stages {
    stage('test1') {
      steps {
        echo 'test1....'
      }
    }

    stage('Build') {
      steps {
        sh 'mvn clean package'
      }
    }

    stage('Deploy') {
      steps {
        echo 'pipeline success!'
        archive 'target/*.jar'
      }
    }

  }
}
