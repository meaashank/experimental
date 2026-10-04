package dagger.internal;

import C4.s;

/* JADX INFO: loaded from: classes7.dex */
public final class j {
    public static <T> T a(T reference) {
        reference.getClass();
        return reference;
    }

    public static <T> T b(T reference, String errorMessage) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(errorMessage);
    }

    public static <T> T c(T reference, String errorMessageTemplate, Object errorMessageArg) {
        if (reference != null) {
            return reference;
        }
        if (!errorMessageTemplate.contains(s.f17585b)) {
            throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
        }
        if (errorMessageTemplate.indexOf(s.f17585b) == errorMessageTemplate.lastIndexOf(s.f17585b)) {
            throw new NullPointerException(errorMessageTemplate.replace(s.f17585b, errorMessageArg instanceof Class ? ((Class) errorMessageArg).getCanonicalName() : String.valueOf(errorMessageArg)));
        }
        throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
    }
}
