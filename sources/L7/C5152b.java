package l7;

import android.annotation.TargetApi;
import android.os.IInterface;
import c7.AbstractC2950b;
import c7.I;

/* JADX INFO: renamed from: l7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@TargetApi(21)
public class C5152b extends AbstractC2950b<IInterface> {
    public C5152b(IInterface iInterface) {
        super(iInterface);
    }

    @Override // c7.AbstractC2950b
    public void r() {
        f(new I("startListening", new int[0]));
        f(new I("stopListening", 0));
        f(new I("allocateAppWidgetId", 0));
        f(new I("deleteAppWidgetId", 0));
        f(new I("deleteHost", 0));
        f(new I("deleteAllHosts", 0));
        f(new I("getAppWidgetViews", null));
        f(new I("getAppWidgetIdsForHost", null));
        f(new I("createAppWidgetConfigIntentSender", null));
        f(new I("updateAppWidgetIds", 0));
        f(new I("updateAppWidgetOptions", 0));
        f(new I("getAppWidgetOptions", null));
        f(new I("partiallyUpdateAppWidgetIds", 0));
        f(new I("updateAppWidgetProvider", 0));
        f(new I("notifyAppWidgetViewDataChanged", 0));
        f(new I("getInstalledProvidersForProfile", null));
        f(new I("getAppWidgetInfo", null));
        Boolean bool = Boolean.FALSE;
        f(new I("hasBindAppWidgetPermission", bool));
        f(new I("setBindAppWidgetPermission", 0));
        f(new I("bindAppWidgetId", bool));
        f(new I("bindRemoteViewsService", 0));
        f(new I("unbindRemoteViewsService", 0));
        f(new I("getAppWidgetIds", new int[0]));
        f(new I("isBoundWidgetPackage", bool));
        f(new I("isRequestPinAppWidgetSupported", bool));
        f(new I("requestPinAppWidget", bool));
    }
}
