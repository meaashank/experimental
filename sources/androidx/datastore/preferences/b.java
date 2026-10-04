package androidx.datastore.preferences;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.PreferencesProto;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import java.io.InputStream;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f112478a = new a();

    public static final class a {
        public a() {
        }

        @NotNull
        public final PreferencesProto.PreferenceMap a(@NotNull InputStream input) throws CorruptionException {
            G.p(input, "input");
            try {
                return PreferencesProto.PreferenceMap.L0(input);
            } catch (InvalidProtocolBufferException e10) {
                throw new CorruptionException("Unable to parse preferences proto.", e10);
            }
        }

        public a(C4969v c4969v) {
        }
    }
}
