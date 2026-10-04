package androidx.appcompat.view.menu;

import B0.C0920d;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.view.AbstractC2440b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class h implements L0.a {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    private a mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private k mExpandedItem;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mOverrideVisibleItems;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private int mDefaultShowAsAction = 0;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private boolean mOptionalIconsVisible = false;
    private boolean mIsClosing = false;
    private ArrayList<k> mTempShortcutItemList = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<o>> mPresenters = new CopyOnWriteArrayList<>();
    private boolean mGroupDividerEnabled = false;
    private ArrayList<k> mItems = new ArrayList<>();
    private ArrayList<k> mVisibleItems = new ArrayList<>();
    private boolean mIsVisibleItemsStale = true;
    private ArrayList<k> mActionItems = new ArrayList<>();
    private ArrayList<k> mNonActionItems = new ArrayList<>();
    private boolean mIsActionItemsStale = true;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface a {
        boolean onMenuItemSelected(@NonNull h hVar, @NonNull MenuItem menuItem);

        void onMenuModeChange(@NonNull h hVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public interface b {
        boolean a(k kVar);
    }

    public h(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        j(true);
    }

    public static int f(ArrayList<k> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f85653o <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    public static int g(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final k a(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new k(this, i10, i11, i12, i13, charSequence, i14);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    public MenuItem addInternal(int i10, int i11, int i12, CharSequence charSequence) {
        int iG = g(i12);
        k kVar = new k(this, i10, i11, i12, iG, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            kVar.f85649P = contextMenuInfo;
        }
        ArrayList<k> arrayList = this.mItems;
        arrayList.add(f(arrayList, iG), kVar);
        onItemsChanged(true);
        return kVar;
    }

    public void addMenuPresenter(o oVar) {
        addMenuPresenter(oVar, this.mContext);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(boolean z10) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        for (WeakReference<o> weakReference : this.mPresenters) {
            o oVar = weakReference.get();
            if (oVar == null) {
                this.mPresenters.remove(weakReference);
            } else {
                oVar.updateMenuView(z10);
            }
        }
        startDispatchingItemsChanged();
    }

    public final void c(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray == null || this.mPresenters.isEmpty()) {
            return;
        }
        for (WeakReference<o> weakReference : this.mPresenters) {
            o oVar = weakReference.get();
            if (oVar == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id2 = oVar.getId();
                if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                    oVar.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    public void changeMenuMode() {
        a aVar = this.mCallback;
        if (aVar != null) {
            aVar.onMenuModeChange(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        k kVar = this.mExpandedItem;
        if (kVar != null) {
            collapseItemActionView(kVar);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    public final void close(boolean z10) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        for (WeakReference<o> weakReference : this.mPresenters) {
            o oVar = weakReference.get();
            if (oVar == null) {
                this.mPresenters.remove(weakReference);
            } else {
                oVar.onCloseMenu(this, z10);
            }
        }
        this.mIsClosing = false;
    }

    public boolean collapseItemActionView(k kVar) {
        boolean zCollapseItemActionView = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == kVar) {
            stopDispatchingItemsChanged();
            for (WeakReference<o> weakReference : this.mPresenters) {
                o oVar = weakReference.get();
                if (oVar != null) {
                    zCollapseItemActionView = oVar.collapseItemActionView(this, kVar);
                    if (zCollapseItemActionView) {
                        break;
                    }
                } else {
                    this.mPresenters.remove(weakReference);
                }
            }
            startDispatchingItemsChanged();
            if (zCollapseItemActionView) {
                this.mExpandedItem = null;
            }
        }
        return zCollapseItemActionView;
    }

    public final void d(Bundle bundle) {
        Parcelable parcelableOnSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<o> weakReference : this.mPresenters) {
            o oVar = weakReference.get();
            if (oVar == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id2 = oVar.getId();
                if (id2 > 0 && (parcelableOnSaveInstanceState = oVar.onSaveInstanceState()) != null) {
                    sparseArray.put(id2, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
    }

    public boolean dispatchMenuItemSelected(@NonNull h hVar, @NonNull MenuItem menuItem) {
        a aVar = this.mCallback;
        return aVar != null && aVar.onMenuItemSelected(hVar, menuItem);
    }

    public final boolean e(t tVar, o oVar) {
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        boolean zOnSubMenuSelected = oVar != null ? oVar.onSubMenuSelected(tVar) : false;
        for (WeakReference<o> weakReference : this.mPresenters) {
            o oVar2 = weakReference.get();
            if (oVar2 == null) {
                this.mPresenters.remove(weakReference);
            } else if (!zOnSubMenuSelected) {
                zOnSubMenuSelected = oVar2.onSubMenuSelected(tVar);
            }
        }
        return zOnSubMenuSelected;
    }

    public boolean expandItemActionView(k kVar) {
        boolean zExpandItemActionView = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        for (WeakReference<o> weakReference : this.mPresenters) {
            o oVar = weakReference.get();
            if (oVar != null) {
                zExpandItemActionView = oVar.expandItemActionView(this, kVar);
                if (zExpandItemActionView) {
                    break;
                }
            } else {
                this.mPresenters.remove(weakReference);
            }
        }
        startDispatchingItemsChanged();
        if (zExpandItemActionView) {
            this.mExpandedItem = kVar;
        }
        return zExpandItemActionView;
    }

    public int findGroupIndex(int i10) {
        return findGroupIndex(i10, 0);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            k kVar = this.mItems.get(i11);
            if (kVar.f85650l == i10) {
                return kVar;
            }
            if (kVar.hasSubMenu() && (menuItemFindItem = kVar.f85664z.findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.mItems.get(i11).f85650l == i10) {
                return i11;
            }
        }
        return -1;
    }

    public k findItemWithShortcutForKey(int i10, KeyEvent keyEvent) {
        ArrayList<k> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zIsQwertyMode = isQwertyMode();
        for (int i11 = 0; i11 < size; i11++) {
            k kVar = arrayList.get(i11);
            char c10 = zIsQwertyMode ? kVar.f85659u : kVar.f85657s;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (zIsQwertyMode && c10 == '\b' && i10 == 67))) {
                return kVar;
            }
        }
        return null;
    }

    public void findItemsWithShortcutForKey(List<k> list, int i10, KeyEvent keyEvent) {
        boolean zIsQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.mItems.size();
            for (int i11 = 0; i11 < size; i11++) {
                k kVar = this.mItems.get(i11);
                if (kVar.hasSubMenu()) {
                    kVar.f85664z.findItemsWithShortcutForKey(list, i10, keyEvent);
                }
                char c10 = zIsQwertyMode ? kVar.f85659u : kVar.f85657s;
                if ((modifiers & L0.a.f58626e) == ((zIsQwertyMode ? kVar.f85660v : kVar.f85658t) & L0.a.f58626e) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (zIsQwertyMode && c10 == '\b' && i10 == 67)) && kVar.isEnabled()) {
                        list.add(kVar);
                    }
                }
            }
        }
    }

    public void flagActionItems() {
        ArrayList<k> visibleItems = getVisibleItems();
        if (this.mIsActionItemsStale) {
            boolean zFlagActionItems = false;
            for (WeakReference<o> weakReference : this.mPresenters) {
                o oVar = weakReference.get();
                if (oVar == null) {
                    this.mPresenters.remove(weakReference);
                } else {
                    zFlagActionItems |= oVar.flagActionItems();
                }
            }
            if (zFlagActionItems) {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                int size = visibleItems.size();
                for (int i10 = 0; i10 < size; i10++) {
                    k kVar = visibleItems.get(i10);
                    if (kVar.o()) {
                        this.mActionItems.add(kVar);
                    } else {
                        this.mNonActionItems.add(kVar);
                    }
                }
            } else {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                this.mNonActionItems.addAll(getVisibleItems());
            }
            this.mIsActionItemsStale = false;
        }
    }

    public ArrayList<k> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public Context getContext() {
        return this.mContext;
    }

    public k getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.mItems.get(i10);
    }

    public ArrayList<k> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    public Resources getResources() {
        return this.mResources;
    }

    public h getRootMenu() {
        return this;
    }

    @NonNull
    public ArrayList<k> getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        int size = this.mItems.size();
        for (int i10 = 0; i10 < size; i10++) {
            k kVar = this.mItems.get(i10);
            if (kVar.isVisible()) {
                this.mVisibleItems.add(kVar);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    public final void h(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(i10);
        if (z10) {
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.mItems.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i10 > 0) {
                this.mHeaderTitle = resources.getText(i10);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i11 > 0) {
                this.mHeaderIcon = C0920d.getDrawable(getContext(), i11);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return findItemWithShortcutForKey(i10, keyEvent) != null;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.mResources
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.mContext
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.mContext
            boolean r3 = androidx.core.view.D0.n(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.mShortcutsVisible = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.h.j(boolean):void");
    }

    public void onItemActionRequestChanged(k kVar) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemVisibleChanged(k kVar) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemsChanged(boolean z10) {
        if (this.mPreventDispatchingItemsChanged) {
            this.mItemsChangedWhileDispatchPrevented = true;
            if (z10) {
                this.mStructureChangedWhileDispatchPrevented = true;
                return;
            }
            return;
        }
        if (z10) {
            this.mIsVisibleItemsStale = true;
            this.mIsActionItemsStale = true;
        }
        b(z10);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return performItemAction(findItem(i10), i11);
    }

    public boolean performItemAction(MenuItem menuItem, int i10) {
        return performItemAction(menuItem, null, i10);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        k kVarFindItemWithShortcutForKey = findItemWithShortcutForKey(i10, keyEvent);
        boolean zPerformItemAction = kVarFindItemWithShortcutForKey != null ? performItemAction(kVarFindItemWithShortcutForKey, i11) : false;
        if ((i11 & 2) != 0) {
            close(true);
        }
        return zPerformItemAction;
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iFindGroupIndex = findGroupIndex(i10);
        if (iFindGroupIndex >= 0) {
            int size = this.mItems.size() - iFindGroupIndex;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.mItems.get(iFindGroupIndex).f85651m != i10) {
                    break;
                }
                h(iFindGroupIndex, false);
                i11 = i12;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        h(findItemIndex(i10), true);
    }

    public void removeItemAt(int i10) {
        h(i10, true);
    }

    public void removeMenuPresenter(o oVar) {
        for (WeakReference<o> weakReference : this.mPresenters) {
            o oVar2 = weakReference.get();
            if (oVar2 == null || oVar2 == oVar) {
                this.mPresenters.remove(weakReference);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((t) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i11 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void restorePresenterStates(Bundle bundle) {
        c(bundle);
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((t) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        d(bundle);
    }

    public void setCallback(a aVar) {
        this.mCallback = aVar;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public h setDefaultShowAsAction(int i10) {
        this.mDefaultShowAsAction = i10;
        return this;
    }

    public void setExclusiveItemChecked(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i10 = 0; i10 < size; i10++) {
            k kVar = this.mItems.get(i10);
            if (kVar.f85651m == groupId && kVar.p() && kVar.isCheckable()) {
                kVar.v(kVar == menuItem);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.mItems.size();
        for (int i11 = 0; i11 < size; i11++) {
            k kVar = this.mItems.get(i11);
            if (kVar.f85651m == i10) {
                kVar.w(z11);
                kVar.setCheckable(z10);
            }
        }
    }

    @Override // L0.a, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.mGroupDividerEnabled = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.mItems.size();
        for (int i11 = 0; i11 < size; i11++) {
            k kVar = this.mItems.get(i11);
            if (kVar.f85651m == i10) {
                kVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.mItems.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            k kVar = this.mItems.get(i11);
            if (kVar.f85651m == i10 && kVar.B(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            onItemsChanged(true);
        }
    }

    public h setHeaderIconInt(Drawable drawable) {
        i(0, null, 0, drawable, null);
        return this;
    }

    public h setHeaderTitleInt(CharSequence charSequence) {
        i(0, charSequence, 0, null, null);
        return this;
    }

    public h setHeaderViewInt(View view) {
        i(0, null, 0, null, view);
        return this;
    }

    public void setOptionalIconsVisible(boolean z10) {
        this.mOptionalIconsVisible = z10;
    }

    public void setOverrideVisibleItems(boolean z10) {
        this.mOverrideVisibleItems = z10;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.mQwertyMode = z10;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z10) {
        if (this.mShortcutsVisible == z10) {
            return;
        }
        j(z10);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged) {
            return;
        }
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return addInternal(0, 0, 0, this.mResources.getString(i10));
    }

    public void addMenuPresenter(o oVar, Context context) {
        this.mPresenters.add(new WeakReference<>(oVar));
        oVar.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i10));
    }

    public int findGroupIndex(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.mItems.get(i11).f85651m == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public boolean performItemAction(MenuItem menuItem, o oVar, int i10) {
        k kVar = (k) menuItem;
        if (kVar == null || !kVar.isEnabled()) {
            return false;
        }
        boolean zN = kVar.n();
        AbstractC2440b abstractC2440b = kVar.f85646M;
        boolean z10 = abstractC2440b != null && abstractC2440b.b();
        if (kVar.m()) {
            boolean zExpandActionView = kVar.expandActionView() | zN;
            if (zExpandActionView) {
                close(true);
            }
            return zExpandActionView;
        }
        if (!kVar.hasSubMenu() && !z10) {
            if ((i10 & 1) == 0) {
                close(true);
            }
            return zN;
        }
        if ((i10 & 4) == 0) {
            close(false);
        }
        if (!kVar.hasSubMenu()) {
            kVar.A(new t(getContext(), this, kVar));
        }
        t tVar = kVar.f85664z;
        if (z10) {
            abstractC2440b.g(tVar);
        }
        boolean zE = e(tVar, oVar) | zN;
        if (!zE) {
            close(true);
        }
        return zE;
    }

    public h setHeaderIconInt(int i10) {
        i(0, null, i10, null, null);
        return this;
    }

    public h setHeaderTitleInt(int i10) {
        i(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return addInternal(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        k kVar = (k) addInternal(i10, i11, i12, charSequence);
        t tVar = new t(this.mContext, this, kVar);
        kVar.A(tVar);
        return tVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return addInternal(i10, i11, i12, this.mResources.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.mResources.getString(i13));
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }
}
