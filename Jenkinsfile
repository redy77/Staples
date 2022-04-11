
    node {
        checkout scm
        scmInfo = checkout scm
        commitMessage = bat(returnStdout:true, script:'@git log -1 --oneline').trim()
        branchName = "${scmInfo.GIT_BRANCH}"
        SSD_ROLE_MANAGER_DEMO = "ping yandex.ru"
        CORE_DATA_DEMO = "ping google.com"
        SERVICE_ADAPTER_GITLAB_DEMO = "ping yahoo.com"
        PACKAGE_DEMO = "ping facebook.com"


        stage("Build Demo") {
            echo "Commit message ${commitMessage}"
            commitMessage.toLowerCase()
            echo "branch name ${branchName}"
            if (commitMessage.contains("demo") && branchName.equals("origin/demo")) {
                if(commitMessage.endsWith("demo all")){
                    bat("${PACKAGE_DEMO}")
                    temp = bat ("${CORE_DATA_DEMO}")
                    echo "{temp}"
                    bat("${SERVICE_ADAPTER_GITLAB_DEMO}")
                    bat("${SSD_ROLE_MANAGER_DEMO}")
                }
                else if(commitMessage.endsWith("core-data")){
                    bat("${PACKAGE_DEMO}")
                    bat("${CORE_DATA_DEMO}")
                }
            } else {
                echo "Keywords not found"
            }
        }
    }
