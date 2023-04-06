//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.webrtc;

import androidx.annotation.Nullable;
import org.webrtc.PeerConnection.Observer;

public final class PeerConnectionDependencies {
    private final Observer observer;
    private final SSLCertificateVerifier sslCertificateVerifier;

    public static Builder builder(Observer observer) {
        return new Builder(observer);
    }

    Observer getObserver() {
        return this.observer;
    }

    @Nullable
    SSLCertificateVerifier getSSLCertificateVerifier() {
        return this.sslCertificateVerifier;
    }

    private PeerConnectionDependencies(Observer observer, SSLCertificateVerifier sslCertificateVerifier) {
        this.observer = observer;
        this.sslCertificateVerifier = sslCertificateVerifier;
    }

    public static class Builder {
        private Observer observer;
        private SSLCertificateVerifier sslCertificateVerifier;

        private Builder(Observer observer) {
            this.observer = observer;
        }

        public Builder setSSLCertificateVerifier(SSLCertificateVerifier sslCertificateVerifier) {
            this.sslCertificateVerifier = sslCertificateVerifier;
            return this;
        }

        public PeerConnectionDependencies createPeerConnectionDependencies() {
            return new PeerConnectionDependencies(this.observer, this.sslCertificateVerifier);
        }
    }
}
