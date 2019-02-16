pipelineJob('Pipeline1234') {
    definition {
        cpsScm {
            scm {
                git('https://github.com/venkatr87/in.biomni.app.git')
               
            }
        }
    }
}
