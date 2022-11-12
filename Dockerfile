FROM amazonlinux:2022.0.20221101.0

RUN dnf install -y \
      which \
      make \
      gzip \
      ncurses \
      java-17-amazon-corretto \
      && \
    dnf clean all && \
    rm -rf /var/cache/dnf

RUN curl -fL https://github.com/coursier/launchers/raw/master/cs-x86_64-pc-linux.gz | gzip -d > /tmp/cs && \
    chmod +x /tmp/cs && \
    /tmp/cs setup --install-dir=/usr/local/bin && \
    rm -rf /tmp/cs
