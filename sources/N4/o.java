package n4;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.inject.Inject;
import kotlin.io.u;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nThemeColor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemeColor.kt\ncom/cookiegames/smartcookie/js/ThemeColor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 1)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f221230a = 0;

    @Inject
    public o() {
    }

    @NotNull
    public final String a(@NotNull Context context) throws IOException {
        G.p(context, "context");
        InputStream inputStreamOpen = context.getAssets().open("ThemeColor.js");
        G.o(inputStreamOpen, "open(...)");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
        try {
            String strM = u.m(bufferedReader);
            bufferedReader.close();
            return strM;
        } finally {
        }
    }
}
