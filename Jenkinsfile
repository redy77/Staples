
    node {
        checkout scm
        scmInfo = checkout scm
        commitMessage = bat(script:"@git log --format=format:%%s -1", returnStdout:true).trim()
                branchName = "${scmInfo.GIT_BRANCH}"

                stage("Condition") {
            echo "______________________"
            echo "${commitMessage}"
            echo "______________________"
            echo "${branchName}"
            echo "______________________"
            commitMessage1 = commitMessage.toLowerCase().replaceAll("\\s","")
            echo "${commitMessage1}"
            if (commitMessage.toLowerCase().endsWith("dev") && branchName.endsWith("master")) {
                echo "PUFFFF"
            } else {
                echo "fuckoff"
            }
        }
    }
