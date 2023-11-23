def call(Map config = [:]) {
    node {
        stage('Static Analysis') {
            echo 'Run the static analysis to the code'
        }
    }
}
