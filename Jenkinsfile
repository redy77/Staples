
    node {
        checkout scm
        scmInfo = checkout scm
        commitMessage = bat(returnStdout:true, script:'@git log -1 --oneline').trim()
        branchName = "${scmInfo.GIT_BRANCH}"
        def ssdRoleManegerDemo(){
        bat ("ping yandex.ru")
        }
        def coreDataDemo(){
        bat ("ping google.com")
        }

        def serviceAdapter(){
        bat ("ping yahoo.com")
        }

        def packageDemo(){
        bat ("ping facebook.com")
        }

        stage("Build Demo") {
            echo "Commit message ${commitMessage}"
            commitMessage.toLowerCase()
            echo "branch name ${branchName}"
            if (commitMessage.contains("demo") && branchName.equals("origin/demo")) {
                if(commitMessage.endsWith("demo all")){
                serviceAdapter()
                }
                else if(commitMessage.endsWith("core-data")){
                coreDataDemo()
                }
            } else {
                echo "Keywords not found"
            }
        }
    }
