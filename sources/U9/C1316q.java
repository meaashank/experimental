package U9;

import android.content.Context;
import android.view.View;
import com.android.launcher3.DragSource;
import com.android.launcher3.DropTarget;
import com.android.launcher3.ItemInfo;
import com.android.launcher3.userevent.nano.LauncherLogProto;

/* JADX INFO: renamed from: U9.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C1316q implements DragSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DragSource f74134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f74135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DropTarget.DragObject f74136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f74137d;

    public C1316q(DragSource dragSource, View view, Context context) {
        this.f74134a = dragSource;
        this.f74135b = context;
        this.f74137d = view;
    }

    public void a() {
        DropTarget.DragObject dragObject = this.f74136c;
        DragSource dragSource = this.f74134a;
        dragObject.dragSource = dragSource;
        dragObject.cancelled = true;
        dragSource.onDropCompleted(this.f74137d, dragObject, false);
    }

    public void b() {
        DropTarget.DragObject dragObject = this.f74136c;
        DragSource dragSource = this.f74134a;
        dragObject.dragSource = dragSource;
        dragSource.onDropCompleted(this.f74137d, dragObject, true);
    }

    @Override // com.android.launcher3.logging.UserEventDispatcher.LogContainerProvider
    public void fillInLogContainerData(View view, ItemInfo itemInfo, LauncherLogProto.Target target, LauncherLogProto.Target target2) {
        this.f74134a.fillInLogContainerData(view, itemInfo, target, target2);
    }

    @Override // com.android.launcher3.DragSource
    public void onDropCompleted(View view, DropTarget.DragObject dragObject, boolean z10) {
        this.f74136c = dragObject;
    }
}
