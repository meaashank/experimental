package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f112712a;

    public UninitializedMessageException(MessageLite messageLite) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f112712a = null;
    }

    public static String e(List<String> list) {
        StringBuilder sb2 = new StringBuilder("Message missing required fields: ");
        boolean z10 = true;
        for (String str : list) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(U6.j.f68738d);
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public InvalidProtocolBufferException d() {
        return new InvalidProtocolBufferException(getMessage());
    }

    public List<String> g() {
        return Collections.unmodifiableList(this.f112712a);
    }

    public UninitializedMessageException(List<String> list) {
        super(e(list));
        this.f112712a = list;
    }
}
