package org.jacoco.core.internal.analysis.filter;

import android.support.v4.media.c;
import androidx.compose.runtime.changelist.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.JumpInsnNode;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.TryCatchBlockNode;

/* JADX INFO: loaded from: classes6.dex */
public final class TryWithResourcesEcjFilter implements IFilter {

    public static class Matcher extends AbstractMatcher {
        private final IFilterOutput output;
        private AbstractInsnNode start;
        private final Map<String, String> owners = new HashMap();
        private final Map<String, LabelNode> labels = new HashMap();

        public Matcher(IFilterOutput iFilterOutput) {
            this.output = iFilterOutput;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean matchEcj() {
            nextIsVar(58, "primaryExc");
            nextIsEcjCloseAndThrow("r0");
            AbstractInsnNode abstractInsnNode = this.cursor;
            String strA = "r1";
            int i10 = 1;
            while (nextIsEcjClose(strA)) {
                nextIsJump(Opcodes.GOTO, j.a(strA, ".end"));
                nextIsEcjSuppress(strA);
                nextIsEcjCloseAndThrow(strA);
                i10++;
                strA = c.a(CampaignEx.JSON_KEY_AD_R, i10);
                abstractInsnNode = this.cursor;
            }
            this.cursor = abstractInsnNode;
            nextIsEcjSuppress("last");
            nextIsVar(25, "primaryExc");
            nextIs(Opcodes.ATHROW);
            AbstractInsnNode abstractInsnNode2 = this.cursor;
            if (abstractInsnNode2 == null) {
                return false;
            }
            AbstractInsnNode previous = this.start.getPrevious();
            this.cursor = previous;
            while (!nextIsEcjClose("r0")) {
                previous = previous.getPrevious();
                this.cursor = previous;
                if (previous == null) {
                    return false;
                }
            }
            AbstractInsnNode next = previous.getNext();
            next();
            AbstractInsnNode abstractInsnNode3 = this.cursor;
            if (abstractInsnNode3 == null || abstractInsnNode3.getOpcode() != 167) {
                return false;
            }
            this.output.ignore(next, this.cursor);
            this.output.ignore(this.start, abstractInsnNode2);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean matchEcjNoFlowOut() {
            nextIsVar(58, "primaryExc");
            AbstractInsnNode abstractInsnNode = this.cursor;
            int i10 = 0;
            String strA = "r0";
            while (nextIsEcjCloseAndThrow(strA) && nextIsEcjSuppress(strA)) {
                i10++;
                strA = c.a(CampaignEx.JSON_KEY_AD_R, i10);
                abstractInsnNode = this.cursor;
            }
            this.cursor = abstractInsnNode;
            nextIsVar(25, "primaryExc");
            nextIs(Opcodes.ATHROW);
            AbstractInsnNode abstractInsnNode2 = this.cursor;
            if (abstractInsnNode2 == null) {
                return false;
            }
            AbstractInsnNode previous = this.start.getPrevious();
            this.cursor = previous;
            while (!nextIsEcjClose("r0")) {
                previous = previous.getPrevious();
                this.cursor = previous;
                if (previous == null) {
                    return false;
                }
            }
            AbstractInsnNode next = previous.getNext();
            for (int i11 = 1; i11 < i10; i11++) {
                if (!nextIsEcjClose(c.a(CampaignEx.JSON_KEY_AD_R, i11))) {
                    return false;
                }
            }
            this.output.ignore(next, this.cursor);
            this.output.ignore(this.start, abstractInsnNode2);
            return true;
        }

        private void nextIsClose(String str) {
            nextIsVar(25, str);
            next();
            AbstractInsnNode abstractInsnNode = this.cursor;
            if (abstractInsnNode == null) {
                return;
            }
            if (abstractInsnNode.getOpcode() != 185 && this.cursor.getOpcode() != 182) {
                this.cursor = null;
                return;
            }
            MethodInsnNode methodInsnNode = (MethodInsnNode) this.cursor;
            if (!CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equals(methodInsnNode.name) || !"()V".equals(methodInsnNode.desc)) {
                this.cursor = null;
                return;
            }
            String str2 = methodInsnNode.owner;
            String str3 = this.owners.get(str);
            if (str3 == null) {
                this.owners.put(str, str2);
            } else {
                if (str3.equals(str2)) {
                    return;
                }
                this.cursor = null;
            }
        }

        private boolean nextIsEcjClose(String str) {
            nextIsVar(25, str);
            nextIsJump(198, j.a(str, ".end"));
            nextIsClose(str);
            return this.cursor != null;
        }

        private boolean nextIsEcjCloseAndThrow(String str) {
            nextIsVar(25, str);
            nextIsJump(198, str);
            nextIsClose(str);
            nextIsLabel(str);
            nextIsVar(25, "primaryExc");
            nextIs(Opcodes.ATHROW);
            return this.cursor != null;
        }

        private boolean nextIsEcjSuppress(String str) {
            String strA = j.a(str, ".t");
            String strA2 = j.a(str, ".suppressStart");
            String strA3 = j.a(str, ".suppressEnd");
            nextIsVar(58, strA);
            nextIsVar(25, "primaryExc");
            nextIsJump(199, strA2);
            nextIsVar(25, strA);
            nextIsVar(58, "primaryExc");
            nextIsJump(Opcodes.GOTO, strA3);
            nextIsLabel(strA2);
            nextIsVar(25, "primaryExc");
            nextIsVar(25, strA);
            nextIsJump(165, strA3);
            nextIsVar(25, "primaryExc");
            nextIsVar(25, strA);
            nextIsInvoke(Opcodes.INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V");
            nextIsLabel(strA3);
            return this.cursor != null;
        }

        private void nextIsJump(int i10, String str) {
            nextIs(i10);
            AbstractInsnNode abstractInsnNode = this.cursor;
            if (abstractInsnNode == null) {
                return;
            }
            LabelNode labelNode = ((JumpInsnNode) abstractInsnNode).label;
            LabelNode labelNode2 = this.labels.get(str);
            if (labelNode2 == null) {
                this.labels.put(str, labelNode);
            } else if (labelNode2 != labelNode) {
                this.cursor = null;
            }
        }

        private void nextIsLabel(String str) {
            AbstractInsnNode abstractInsnNode = this.cursor;
            if (abstractInsnNode == null) {
                return;
            }
            AbstractInsnNode next = abstractInsnNode.getNext();
            this.cursor = next;
            if (next.getType() != 8) {
                this.cursor = null;
                return;
            }
            if (this.labels.get(str) != ((LabelNode) this.cursor)) {
                this.cursor = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void start(AbstractInsnNode abstractInsnNode) {
            this.start = abstractInsnNode;
            this.cursor = abstractInsnNode.getPrevious();
            this.vars.clear();
            this.labels.clear();
            this.owners.clear();
        }
    }

    @Override // org.jacoco.core.internal.analysis.filter.IFilter
    public void filter(MethodNode methodNode, IFilterContext iFilterContext, IFilterOutput iFilterOutput) {
        if (methodNode.tryCatchBlocks.isEmpty()) {
            return;
        }
        Matcher matcher = new Matcher(iFilterOutput);
        for (TryCatchBlockNode tryCatchBlockNode : methodNode.tryCatchBlocks) {
            if (tryCatchBlockNode.type == null) {
                matcher.start(tryCatchBlockNode.handler);
                if (!matcher.matchEcj()) {
                    matcher.start(tryCatchBlockNode.handler);
                    matcher.matchEcjNoFlowOut();
                }
            }
        }
    }
}
