package k4;

import android.content.Context;
import androidx.compose.runtime.internal.r;
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
@V({"SMAP\nIncognitoPageReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IncognitoPageReader.kt\ncom/cookiegames/smartcookie/html/incognito/IncognitoPageReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,19:1\n1#2:20\n*E\n"})
@r(parameters = 1)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f214484a = 0;

    @Inject
    public l() {
    }

    @NotNull
    public final String a(@NotNull Context context) throws IOException {
        G.p(context, "context");
        InputStream inputStreamOpen = context.getAssets().open(j4.j.f212544k);
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
