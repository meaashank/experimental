package F4;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import androidx.compose.runtime.internal.r;
import com.cookiegames.smartcookie.MainActivity;
import com.cookiegames.smartcookie.p;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nSearchWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchWidget.kt\ncom/cookiegames/smartcookie/widget/SearchWidget\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,42:1\n13330#2,2:43\n*S KotlinDebug\n*F\n+ 1 SearchWidget.kt\ncom/cookiegames/smartcookie/widget/SearchWidget\n*L\n20#1:43,2\n*E\n"})
@r(parameters = 0)
public final class a extends AppWidgetProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f34263a = 8;

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, @NotNull int[] appWidgetIds) {
        G.p(context, "context");
        G.p(appWidgetManager, "appWidgetManager");
        G.p(appWidgetIds, "appWidgetIds");
        for (int i10 : appWidgetIds) {
            G.o(PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) MainActivity.class), 0), "let(...)");
            appWidgetManager.updateAppWidget(i10, new RemoteViews(context.getPackageName(), p.m.f145228g3));
        }
    }
}
