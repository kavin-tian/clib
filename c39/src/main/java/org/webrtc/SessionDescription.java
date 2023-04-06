//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.webrtc;

import java.util.Locale;

public class SessionDescription {
    public final Type type;
    public final String description;

    @CalledByNative
    public SessionDescription(Type type, String description) {
        this.type = type;
        this.description = description;
    }

    @CalledByNative
    String getDescription() {
        return this.description;
    }

    @CalledByNative
    String getTypeInCanonicalForm() {
        return this.type.canonicalForm();
    }

    public static enum Type {
        OFFER,
        PRANSWER,
        ANSWER;

        private Type() {
        }

        public String canonicalForm() {
            return this.name().toLowerCase(Locale.US);
        }

        @CalledByNative("Type")
        public static Type fromCanonicalForm(String canonical) {
            return (Type)valueOf(Type.class, canonical.toUpperCase(Locale.US));
        }
    }
}
