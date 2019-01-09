def send_notification(subject, mail_body, version){
  mail subject: subject, \
    to: "pbalogh", \
    body: """
    Hi,

    ${mail_body}

    Your RHV-QE ${version} testing pipeline.
    """
}


def send_notification_infra(subject, mail_body, version){
  mail subject: subject, \
    to: "pbalogh", \
    body: """
    Hi infra-team,

    ${mail_body}

    Your RHV-QE ${version} testing pipeline.
    """
}
