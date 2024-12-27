import java.io.File;
import java.security.SecureRandom;
import java.text.DecimalFormat;


import java.util.*;

class EqConstantFunction implements IConstraintVR {

    private IFunctionVR f;
    private double c;
    private int violations;

    public EqConstantFunction(double c, IFunctionVR f){
        this.f = f;
        this.c = c;
        f.getVRManager().post(this);
    }


    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return f.getVRManager();
    }


    public void initPropagation() {
        // TODO Auto-generated method stub
        violations = c == f.getValue() ? 0 : (int)Math.abs(c-f.getValue());
    }


    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();

    }


    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public int violations() {
        // TODO Auto-generated method stub
        return this.violations;
    }


    public int evaluateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateOnePointMove(x, y) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoPointsMove(x, y) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove1(x, y) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove2(x, y) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove3(x, y) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove4(x, y) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove5(x, y) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove6(x, y) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove7(x, y) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove8(x, y) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateOrOptMove1(x1, x2, y) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateOrOptMove2(x1, x2, y) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove1(x, y, z) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove2(x, y, z) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove3(x, y, z) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove4(x, y, z) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove5(x, y, z) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove6(x, y, z) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove7(x, y, z) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove8(x, y, z) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        double v = f.evaluateCrossExchangeMove(x1, y1, x2, y2) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public String name(){
        return "EqConstantFunction";
    }

    public static void main(String[] args){

    }


    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreePointsMove(Point x1, Point x2, Point x3, Point y1,
                                         Point y2, Point y3) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4, Point y1,
                                        Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public int evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoPointsMove(x1, x2, y1, y2) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateThreePointsMove(Point x1, Point x2, Point x3, Point y1, Point y2,
                                       Point y3) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreePointsMove(x1, x2, x3, y1, y2, y3) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateFourPointsMove(Point x1, Point x2, Point x3, Point x4, Point y1,
                                      Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        double v = f.evaluateFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateAddOnePoint(x, y) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public int evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        double v = f.evaluateRemoveOnePoint(x) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }

    public int evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        double v = f.evaluateAddTwoPoints(x1, y1, x2, y2) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }

    public int evaluateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        double v = f.evaluateRemoveTwoPoints(x1, x2) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }

    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public int evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateAddRemovePoints(x, y, z) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public int evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        double v = f.evaluateKPointsMove(x, y) + f.getValue();
        int nv = c == v ? 0 : (int)Math.abs(c-v);
        return nv - violations;
    }


    @Override
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        // TODO Auto-generated method stub

    }
}
class EqFunctionFunction implements IConstraintVR {

    private IFunctionVR f1;
    private IFunctionVR f2;
    private int violations;

    public EqFunctionFunction(IFunctionVR f1, IFunctionVR f2){
        // f1 <= f2
        this.f1 = f1; this.f2 = f2;
        f1.getVRManager().post(this);
    }


    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return f1.getVRManager();
    }


    public void initPropagation() {
        // TODO Auto-generated method stub
        violations = f1.getValue() == f2.getValue() ? 0 : (int)Math.abs(f1.getValue() - f2.getValue());
    }


    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2,
                                           Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreePointsMove(Point x1, Point x2, Point x3,
                                         Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                        Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public String name() {
        // TODO Auto-generated method stub
        return "EqFunctionFunction";
    }


    public int violations() {
        // TODO Auto-generated method stub
        return violations;
    }


    public int evaluateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateOnePointMove(x, y) + f1.getValue();
        double nf2 = f2.evaluateOnePointMove(x, y) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }


    public int evaluateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoPointsMove(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoPointsMove(x, y) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }


    public int evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove1(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove1(x, y) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }


    public int evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove2(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove2(x, y) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }


    public int evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove3(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove3(x, y) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }


    public int evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove4(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove4(x, y) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }


    public int evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove5(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove5(x, y) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }


    public int evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove6(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove6(x, y) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }


    public int evaluateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove7(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove7(x, y) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }


    public int evaluateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove8(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove8(x, y) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }


    public int evaluateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateOrOptMove1(x1, x2, y) + f1.getValue();
        double nf2 = f2.evaluateOrOptMove1(x1, x2, y) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }


    public int evaluateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateOrOptMove2(x1, x2, y) + f1.getValue();
        double nf2 = f2.evaluateOrOptMove2(x1, x2, y) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }


    public int evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove1(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove1(x, y, z) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;

    }


    public int evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove2(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove2(x, y, z) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;

    }


    public int evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove3(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove3(x, y, z) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;

    }


    public int evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove4(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove4(x, y, z) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;

    }


    public int evaluateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove5(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove5(x, y, z) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;

    }


    public int evaluateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove6(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove6(x, y, z) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;

    }


    public int evaluateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove7(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove7(x, y, z) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;

    }


    public int evaluateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove8(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove8(x, y, z) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;

    }


    public int evaluateCrossExchangeMove(Point x1, Point y1, Point x2,
                                         Point y2) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateCrossExchangeMove(x1, y1, x2, y2) + f1.getValue();
        double nf2 = f2.evaluateCrossExchangeMove(x1, y1, x2, y2) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;

    }


    public int evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoPointsMove(x1, x2, y1, y2) + f1.getValue();
        double nf2 = f2.evaluateTwoPointsMove(x1, x2, y1, y2) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;

    }


    public int evaluateThreePointsMove(Point x1, Point x2, Point x3,
                                       Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreePointsMove(x1, x2, x3, y1, y2, y3) + f1.getValue();
        double nf2 = f2.evaluateThreePointsMove(x1, x2, x3, y1, y2, y3) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;

    }


    public int evaluateFourPointsMove(Point x1, Point x2, Point x3,
                                      Point x4, Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4) + f1.getValue();
        double nf2 = f2.evaluateFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }


    public int evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateKPointsMove(x, y) + f1.getValue();
        double nf2 = f2.evaluateKPointsMove(x, y) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }


    public int evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateAddOnePoint(x, y) + f1.getValue();
        double nf2 = f2.evaluateAddOnePoint(x, y) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }


    public int evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateRemoveOnePoint(x) + f1.getValue();
        double nf2 = f2.evaluateRemoveOnePoint(x) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }

    public int evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateAddTwoPoints(x1, y1, x2, y2) + f1.getValue();
        double nf2 = f2.evaluateAddTwoPoints(x1, y1, x2, y2) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }

    public int evaluateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateRemoveTwoPoints(x1, x2) + f1.getValue();
        double nf2 = f2.evaluateRemoveTwoPoints(x1, x2) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }

    public int evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateAddRemovePoints(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateAddRemovePoints(x, y, z) + f2.getValue();
        int nv = nf1 == nf2 ? 0 : (int)Math.abs(nf1-nf2);
        return nv - violations;
    }


    @Override
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        // TODO Auto-generated method stub

    }

}
class LeqFunctionFunction implements IConstraintVR {

    private IFunctionVR f1;
    private IFunctionVR f2;
    private int violations;

    public LeqFunctionFunction(IFunctionVR f1, IFunctionVR f2){
        // f1 <= f2
        this.f1 = f1; this.f2 = f2;
        f1.getVRManager().post(this);
    }


    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return f1.getVRManager();
    }


    public void initPropagation() {
        // TODO Auto-generated method stub
        violations = f1.getValue() <= f2.getValue() ? 0 : (int)Math.ceil(f1.getValue() - f2.getValue());
    }


    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2,
                                           Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreePointsMove(Point x1, Point x2, Point x3,
                                         Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                        Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public String name() {
        // TODO Auto-generated method stub
        return "LeqFunctionFunction";
    }


    public int violations() {
        // TODO Auto-generated method stub
        return violations;
    }


    public int evaluateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateOnePointMove(x, y) + f1.getValue();
        double nf2 = f2.evaluateOnePointMove(x, y) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }


    public int evaluateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoPointsMove(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoPointsMove(x, y) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }


    public int evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove1(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove1(x, y) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }


    public int evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove2(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove2(x, y) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }


    public int evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove3(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove3(x, y) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }


    public int evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove4(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove4(x, y) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }


    public int evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove5(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove5(x, y) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }


    public int evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove6(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove6(x, y) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }


    public int evaluateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove7(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove7(x, y) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }


    public int evaluateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove8(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove8(x, y) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }


    public int evaluateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateOrOptMove1(x1, x2, y) + f1.getValue();
        double nf2 = f2.evaluateOrOptMove1(x1, x2, y) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }


    public int evaluateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateOrOptMove2(x1, x2, y) + f1.getValue();
        double nf2 = f2.evaluateOrOptMove2(x1, x2, y) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }


    public int evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove1(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove1(x, y, z) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;

    }


    public int evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove2(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove2(x, y, z) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;

    }


    public int evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove3(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove3(x, y, z) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;

    }


    public int evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove4(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove4(x, y, z) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;

    }


    public int evaluateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove5(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove5(x, y, z) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;

    }


    public int evaluateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove6(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove6(x, y, z) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;

    }


    public int evaluateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove7(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove7(x, y, z) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;

    }


    public int evaluateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove8(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove8(x, y, z) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;

    }


    public int evaluateCrossExchangeMove(Point x1, Point y1, Point x2,
                                         Point y2) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateCrossExchangeMove(x1, y1, x2, y2) + f1.getValue();
        double nf2 = f2.evaluateCrossExchangeMove(x1, y1, x2, y2) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;

    }


    public int evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoPointsMove(x1, x2, y1, y2) + f1.getValue();
        double nf2 = f2.evaluateTwoPointsMove(x1, x2, y1, y2) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;

    }


    public int evaluateThreePointsMove(Point x1, Point x2, Point x3,
                                       Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreePointsMove(x1, x2, x3, y1, y2, y3) + f1.getValue();
        double nf2 = f2.evaluateThreePointsMove(x1, x2, x3, y1, y2, y3) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;

    }


    public int evaluateFourPointsMove(Point x1, Point x2, Point x3,
                                      Point x4, Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4) + f1.getValue();
        double nf2 = f2.evaluateFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }


    public int evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateKPointsMove(x, y) + f1.getValue();
        double nf2 = f2.evaluateKPointsMove(x, y) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }


    public int evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateAddOnePoint(x, y) + f1.getValue();
        double nf2 = f2.evaluateAddOnePoint(x, y) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }


    public int evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateRemoveOnePoint(x) + f1.getValue();
        double nf2 = f2.evaluateRemoveOnePoint(x) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }

    public int evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateAddTwoPoints(x1, y1, x2, y2) + f1.getValue();
        double nf2 = f2.evaluateAddTwoPoints(x1, y1, x2, y2) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }

    public int evaluateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateRemoveTwoPoints(x1, x2) + f1.getValue();
        double nf2 = f2.evaluateRemoveTwoPoints(x1, x2) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }

    public int evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateAddRemovePoints(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateAddRemovePoints(x, y, z) + f2.getValue();
        int nv = nf1 <= nf2 ? 0 : (int)Math.ceil(nf1-nf2);
        return nv - violations;
    }


    @Override
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        // TODO Auto-generated method stub

    }

}
class Leq implements IConstraintVR {
    private IConstraintVR cstr;

    public Leq(IFunctionVR f, double c){
        cstr = new LeqFunctionConstant(f,c);
    }
    public Leq(double c, IFunctionVR f){
        cstr = new LeqConstantFunction(c,f);
    }
    public Leq(IFunctionVR f1, IFunctionVR f2){
        cstr = new LeqFunctionFunction(f1,f2);
    }

    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return cstr.getVRManager();
    }


    public void initPropagation() {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public int violations() {
        // TODO Auto-generated method stub
        return cstr.violations();
    }


    public int evaluateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateOnePointMove(x, y);
    }


    public int evaluateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoPointsMove(x, y);
    }


    public int evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove1(x, y);
    }


    public int evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove2(x, y);
    }


    public int evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove3(x, y);
    }


    public int evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove4(x, y);
    }


    public int evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove5(x, y);
    }


    public int evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove6(x, y);
    }


    public int evaluateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove7(x, y);
    }


    public int evaluateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove8(x, y);
    }


    public int evaluateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateOrOptMove1(x1, x2, y);
    }


    public int evaluateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateOrOptMove2(x1, x2, y);
    }


    public int evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove1(x, y, z);
    }


    public int evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove2(x, y, z);
    }


    public int evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove3(x, y, z);
    }


    public int evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove4(x, y, z);
    }


    public int evaluateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove5(x, y, z);
    }


    public int evaluateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove6(x, y, z);
    }


    public int evaluateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove7(x, y, z);
    }


    public int evaluateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove8(x, y, z);
    }


    public int evaluateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        return cstr.evaluateCrossExchangeMove(x1, y1, x2, y2);
    }


    public String name(){
        return "Leq";
    }


    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub

    }

    public void propagateThreePointsMove(Point x1, Point x2, Point x3, Point y1,
                                         Point y2, Point y3) {
        // TODO Auto-generated method stub

    }

    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4, Point y1,
                                        Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub

    }

    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub

    }

    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub

    }

    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        System.out.println("Leq::propagateAddTwoPoints HAS NOT BEEN IMPLEMENTED YET");
        System.exit(-1);
    }

    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        System.out.println("Leq::propagateRemoveTwoPoints HAS NOT BEEN IMPLEMENTED YET");
        System.exit(-1);
    }

    public int evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoPointsMove(x1, x2, y1, y2);
    }


    public int evaluateThreePointsMove(Point x1, Point x2, Point x3, Point y1,
                                       Point y2, Point y3) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreePointsMove(x1, x2, x3, y1, y2, y3);
    }


    public int evaluateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                      Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        return cstr.evaluateFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4);
    }

    public int evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateAddOnePoint(x, y);
    }

    public int evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        return cstr.evaluateRemoveOnePoint(x);
    }

    public int evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        return cstr.evaluateAddTwoPoints(x1, y1, x2, y2);
    }

    public int evaluateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        return cstr.evaluateRemoveTwoPoints(x1, x2);
    }

    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }

    public int evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateAddRemovePoints(x, y, z);
    }

    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub

    }

    public int evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        return cstr.evaluateKPointsMove(x, y);
    }
    @Override
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        // TODO Auto-generated method stub

    }
}
class LeqConstantFunction implements IConstraintVR {

    private IFunctionVR f;
    private double c;
    private int violations;

    public LeqConstantFunction(double c, IFunctionVR f){
        this.f = f;
        this.c = c;
        f.getVRManager().post(this);
    }


    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return f.getVRManager();
    }


    public void initPropagation() {
        // TODO Auto-generated method stub
        violations = c <= f.getValue() ? 0 : (int)Math.ceil(c-f.getValue());
    }


    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();

    }


    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public int violations() {
        // TODO Auto-generated method stub
        return this.violations;
    }


    public int evaluateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateOnePointMove(x, y) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoPointsMove(x, y) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove1(x, y) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove2(x, y) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove3(x, y) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove4(x, y) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove5(x, y) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove6(x, y) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove7(x, y) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove8(x, y) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateOrOptMove1(x1, x2, y) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateOrOptMove2(x1, x2, y) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove1(x, y, z) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove2(x, y, z) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove3(x, y, z) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove4(x, y, z) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove5(x, y, z) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove6(x, y, z) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove7(x, y, z) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove8(x, y, z) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        double v = f.evaluateCrossExchangeMove(x1, y1, x2, y2) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public String name(){
        return "LeqConstantFunction";
    }

    public static void main(String[] args){

    }


    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreePointsMove(Point x1, Point x2, Point x3, Point y1,
                                         Point y2, Point y3) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4, Point y1,
                                        Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public int evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoPointsMove(x1, x2, y1, y2) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateThreePointsMove(Point x1, Point x2, Point x3, Point y1, Point y2,
                                       Point y3) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreePointsMove(x1, x2, x3, y1, y2, y3) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateFourPointsMove(Point x1, Point x2, Point x3, Point x4, Point y1,
                                      Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        double v = f.evaluateFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateAddOnePoint(x, y) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public int evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        double v = f.evaluateRemoveOnePoint(x) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }

    public int evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        double v = f.evaluateAddTwoPoints(x1, y1, x2, y2) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }

    public int evaluateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        double v = f.evaluateRemoveTwoPoints(x1, x2) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }

    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public int evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateAddRemovePoints(x, y, z) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public int evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        double v = f.evaluateKPointsMove(x, y) + f.getValue();
        int nv = c <= v ? 0 : (int)Math.ceil(c-v);
        return nv - violations;
    }


    @Override
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        // TODO Auto-generated method stub

    }
}
class LeqFunctionConstant implements IConstraintVR {

    private IFunctionVR f;
    private double c;
    private int violations;

    public LeqFunctionConstant(IFunctionVR f, double c){
        this.f = f;
        this.c = c;
        f.getVRManager().post(this);
    }


    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return f.getVRManager();
    }


    public void initPropagation() {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        violations = f.getValue() <= c ? 0 : (int)Math.ceil(f.getValue() - c);
    }


    public int violations() {
        // TODO Auto-generated method stub
        return this.violations;
    }


    public int evaluateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateOnePointMove(x, y) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoPointsMove(x, y) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove1(x, y) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove2(x, y) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove3(x, y) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove4(x, y) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove5(x, y) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove6(x, y) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove7(x, y) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove8(x, y) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateOrOptMove1(x1, x2, y) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateOrOptMove2(x1, x2, y) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove1(x, y, z) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove2(x, y, z) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove3(x, y, z) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove4(x, y, z) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove5(x, y, z) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove6(x, y, z) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove7(x, y, z) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove8(x, y, z) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        double v = f.evaluateCrossExchangeMove(x1, y1, x2, y2) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public String name(){
        return "LeqFunctionConstant";
    }

    public static void main(String[] args){

    }


    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateThreePointsMove(Point x1, Point x2, Point x3, Point y1,
                                         Point y2, Point y3) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4, Point y1,
                                        Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public int evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoPointsMove(x1, x2, y1, y2) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateThreePointsMove(Point x1, Point x2, Point x3, Point y1, Point y2,
                                       Point y3) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreePointsMove(x1, x2, x3, y1, y2, y3) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateFourPointsMove(Point x1, Point x2, Point x3, Point x4, Point y1,
                                      Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        double v = f.evaluateFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateAddOnePoint(x, y) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public int evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        double v = f.evaluateRemoveOnePoint(x) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }

    public int evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        double v = f.evaluateAddTwoPoints(x1, y1, x2, y2) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }

    public int evaluateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        double v = f.evaluateRemoveTwoPoints(x1, x2) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }

    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public int evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateAddRemovePoints(x, y, z) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        initPropagation();
    }


    public int evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        double v = f.evaluateKPointsMove(x, y) + f.getValue();
        int nv = v <= c ? 0 : (int)Math.ceil(v-c);
        return nv - violations;
    }


    @Override
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        // TODO Auto-generated method stub

    }

}
class Neq implements IConstraintVR {
    private IConstraintVR cstr;

    public Neq(double c, IFunctionVR f) {
        cstr = new NeqConstantFunction(c, f);
    }

    public Neq(IFunctionVR f, double c) {
        cstr = new NeqConstantFunction(c, f);
    }

    public Neq(IFunctionVR f1, IFunctionVR f2) {
        cstr = new NeqFunctionFunction(f1, f2);
    }

    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return cstr.getVRManager();
    }

    public void initPropagation() {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2,
                                           Point y2) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }

    public int violations() {
        // TODO Auto-generated method stub
        return cstr.violations();
    }

    public int evaluateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateOnePointMove(x, y);
    }

    public int evaluateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoPointsMove(x, y);
    }

    public int evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove1(x, y);
    }

    public int evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove2(x, y);
    }

    public int evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove3(x, y);
    }

    public int evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove4(x, y);
    }

    public int evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove5(x, y);
    }

    public int evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove6(x, y);
    }

    public int evaluateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove7(x, y);
    }

    public int evaluateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove8(x, y);
    }

    public int evaluateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateOrOptMove1(x1, x2, y);
    }

    public int evaluateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateOrOptMove2(x1, x2, y);
    }

    public int evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove1(x, y, z);
    }

    public int evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove2(x, y, z);
    }

    public int evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove3(x, y, z);
    }

    public int evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove4(x, y, z);
    }

    public int evaluateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove5(x, y, z);
    }

    public int evaluateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove6(x, y, z);
    }

    public int evaluateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove7(x, y, z);
    }

    public int evaluateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove8(x, y, z);
    }

    public int evaluateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        return cstr.evaluateCrossExchangeMove(x1, y1, x2, y2);
    }

    public String name() {
        return "Neq";
    }

    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub

    }

    public void propagateThreePointsMove(Point x1, Point x2, Point x3,
                                         Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub

    }

    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                        Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub

    }

    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub

    }

    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub

    }

    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        System.out.println("Neq::propagateAddTwoPoints HAS NOT BEEN IMPLEMENTED YET");
        System.exit(-1);
    }

    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        System.out.println("Neq::propagateRemoveTwoPoints HAS NOT BEEN IMPLEMENTED YET");
        System.exit(-1);
    }

    public int evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoPointsMove(x1, x2, y1, y2);
    }

    public int evaluateThreePointsMove(Point x1, Point x2, Point x3, Point y1,
                                       Point y2, Point y3) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreePointsMove(x1, x2, x3, y1, y2, y3);
    }

    public int evaluateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                      Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        return cstr.evaluateFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4);
    }

    public int evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateAddOnePoint(x, y);
    }

    public int evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        return cstr.evaluateRemoveOnePoint(x);
    }

    public int evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        return cstr.evaluateAddTwoPoints(x1, y1, x2, y2);
    }

    public int evaluateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        return cstr.evaluateRemoveTwoPoints(x1, x2);
    }

    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }

    public int evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateAddRemovePoints(x, y, z);
    }

    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub

    }

    public int evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        return cstr.evaluateKPointsMove(x, y);
    }

    @Override
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        // TODO Auto-generated method stub

    }
}
class NeqConstantFunction implements IConstraintVR {

    private IFunctionVR f;
    private double c;
    private int violations;

    public NeqConstantFunction(double c, IFunctionVR f) {
        this.f = f;
        this.c = c;
        f.getVRManager().post(this);
    }

    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return f.getVRManager();
    }

    public void initPropagation() {
        // TODO Auto-generated method stub
        violations = CBLSVR.equal(c, f.getValue()) ? 1 : 0;
    }

    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();

    }

    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2,
                                           Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public int violations() {
        // TODO Auto-generated method stub
        return this.violations;
    }

    public int evaluateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateOnePointMove(x, y) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoPointsMove(x, y) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove1(x, y) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove2(x, y) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove3(x, y) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove4(x, y) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove5(x, y) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove6(x, y) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove7(x, y) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoOptMove8(x, y) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateOrOptMove1(x1, x2, y) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateOrOptMove2(x1, x2, y) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove1(x, y, z) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove2(x, y, z) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove3(x, y, z) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove4(x, y, z) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove5(x, y, z) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove6(x, y, z) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove7(x, y, z) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreeOptMove8(x, y, z) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        double v = f.evaluateCrossExchangeMove(x1, y1, x2, y2) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public String name() {
        return "NeqConstantFunction";
    }

    public static void main(String[] args) {

    }

    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateThreePointsMove(Point x1, Point x2, Point x3,
                                         Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                        Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public int evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        double v = f.evaluateTwoPointsMove(x1, x2, y1, y2) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateThreePointsMove(Point x1, Point x2, Point x3, Point y1,
                                       Point y2, Point y3) {
        // TODO Auto-generated method stub
        double v = f.evaluateThreePointsMove(x1, x2, x3, y1, y2, y3)
                + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                      Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        double v = f.evaluateFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4)
                + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        double v = f.evaluateAddOnePoint(x, y) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        double v = f.evaluateRemoveOnePoint(x) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        double v = f.evaluateAddTwoPoints(x1, y1, x2, y2) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        double v = f.evaluateRemoveTwoPoints(x1, x2) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public int evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double v = f.evaluateAddRemovePoints(x, y, z) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public int evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        double v = f.evaluateKPointsMove(x, y) + f.getValue();
        int nv = CBLSVR.equal(c, v) ? 1 : 0;
        return nv - violations;
    }

    @Override
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        // TODO Auto-generated method stub

    }
}
class NeqFunctionFunction implements IConstraintVR {

    private IFunctionVR f1;
    private IFunctionVR f2;
    private int violations;

    public NeqFunctionFunction(IFunctionVR f1, IFunctionVR f2) {
        // f1 <= f2
        this.f1 = f1;
        this.f2 = f2;
        f1.getVRManager().post(this);
    }

    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return f1.getVRManager();
    }

    public void initPropagation() {
        // TODO Auto-generated method stub
        violations = CBLSVR.equal(f1.getValue(), f2.getValue()) ? 1 : 0;
    }

    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2,
                                           Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateThreePointsMove(Point x1, Point x2, Point x3,
                                         Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                        Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    public String name() {
        // TODO Auto-generated method stub
        return "NeqFunctionFunction";
    }

    public int violations() {
        // TODO Auto-generated method stub
        return violations;
    }

    public int evaluateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateOnePointMove(x, y) + f1.getValue();
        double nf2 = f2.evaluateOnePointMove(x, y) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoPointsMove(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoPointsMove(x, y) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove1(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove1(x, y) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove2(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove2(x, y) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove3(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove3(x, y) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove4(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove4(x, y) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove5(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove5(x, y) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove6(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove6(x, y) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove7(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove7(x, y) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoOptMove8(x, y) + f1.getValue();
        double nf2 = f2.evaluateTwoOptMove8(x, y) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateOrOptMove1(x1, x2, y) + f1.getValue();
        double nf2 = f2.evaluateOrOptMove1(x1, x2, y) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateOrOptMove2(x1, x2, y) + f1.getValue();
        double nf2 = f2.evaluateOrOptMove2(x1, x2, y) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove1(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove1(x, y, z) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;

    }

    public int evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove2(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove2(x, y, z) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;

    }

    public int evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove3(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove3(x, y, z) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;

    }

    public int evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove4(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove4(x, y, z) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;

    }

    public int evaluateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove5(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove5(x, y, z) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;

    }

    public int evaluateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove6(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove6(x, y, z) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;

    }

    public int evaluateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove7(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove7(x, y, z) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;

    }

    public int evaluateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreeOptMove8(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateThreeOptMove8(x, y, z) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;

    }

    public int evaluateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateCrossExchangeMove(x1, y1, x2, y2)
                + f1.getValue();
        double nf2 = f2.evaluateCrossExchangeMove(x1, y1, x2, y2)
                + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;

    }

    public int evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateTwoPointsMove(x1, x2, y1, y2) + f1.getValue();
        double nf2 = f2.evaluateTwoPointsMove(x1, x2, y1, y2) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;

    }

    public int evaluateThreePointsMove(Point x1, Point x2, Point x3, Point y1,
                                       Point y2, Point y3) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateThreePointsMove(x1, x2, x3, y1, y2, y3)
                + f1.getValue();
        double nf2 = f2.evaluateThreePointsMove(x1, x2, x3, y1, y2, y3)
                + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;

    }

    public int evaluateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                      Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4)
                + f1.getValue();
        double nf2 = f2.evaluateFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4)
                + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateKPointsMove(x, y) + f1.getValue();
        double nf2 = f2.evaluateKPointsMove(x, y) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateAddOnePoint(x, y) + f1.getValue();
        double nf2 = f2.evaluateAddOnePoint(x, y) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateRemoveOnePoint(x) + f1.getValue();
        double nf2 = f2.evaluateRemoveOnePoint(x) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateAddTwoPoints(x1, y1, x2, y2) + f1.getValue();
        double nf2 = f2.evaluateAddTwoPoints(x1, y1, x2, y2) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateRemoveTwoPoints(x1, x2) + f1.getValue();
        double nf2 = f2.evaluateRemoveTwoPoints(x1, x2) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    public int evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double nf1 = f1.evaluateAddRemovePoints(x, y, z) + f1.getValue();
        double nf2 = f2.evaluateAddRemovePoints(x, y, z) + f2.getValue();
        int nv = CBLSVR.equal(nf1, nf2) ? 1 : 0;
        return nv - violations;
    }

    @Override
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        // TODO Auto-generated method stub

    }

}
class CEarliestArrivalTimeVR implements IConstraintVR {

    private HashMap<Point, Integer> latestAllowedArrivalTime;
    private VarRoutesVR XR;
    private EarliestArrivalTimeVR eat;
    private int violations;
    private HashMap<Point, Double> earliestArrivalTime;
    private HashMap<Point, Integer> vio;

    // temporary data structure
    private HashMap<Point, Point> t_next;
    public CEarliestArrivalTimeVR(EarliestArrivalTimeVR eat, HashMap<Point, Integer> latestAllowedArrivalTime){
        this.eat = eat;
        this.latestAllowedArrivalTime = latestAllowedArrivalTime;

        earliestArrivalTime = eat.getEarliestArrivalTime();
        XR = eat.getVarRouteVR();
        t_next = new HashMap<Point,Point>();
        vio = new HashMap<Point,Integer>();
        getVRManager().post(this);
    }

    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return XR.getVRManager();
    }

    private int computeViolations(Point i) {
        double v = earliestArrivalTime.get(i) <= latestAllowedArrivalTime.get(i) ? 0
                : earliestArrivalTime.get(i) - latestAllowedArrivalTime.get(i);
        return (int) Math.ceil(v);
    }

    private int computeViolations(Point i, double arrivalTime) {
        double v = arrivalTime <= latestAllowedArrivalTime.get(i) ? 0 : arrivalTime
                - latestAllowedArrivalTime.get(i);
        return (int) Math.ceil(v);
    }


    public void initPropagation() {
        // TODO Auto-generated method stub
        violations = 0;
        vio = new HashMap<Point, Integer>();
        t_next = new HashMap<Point, Point>();
        int nr = XR.getNbRoutes();
        for(int k = 1; k <= nr; ++k)
        {
            Point s = XR.getStartingPointOfRoute(k);
            do{
                int svio  = computeViolations(s);
                violations += svio;
                vio.put(s, svio);
                //System.out.println(s+"("+svio+","+eat.getEarliestArrivalTime(s)+") ");
                if(XR.isTerminatingPoint(s))
                    break;
                s  = XR.next(s);
            }while(true);
            //System.out.println();
        }
    }

    private void propagate(int k)
    {
        for(Point v = XR.getStartingPointOfRoute(k); v!= XR.getTerminatingPointOfRoute(k); v = XR.oldNext(v))
        {
            violations -= vio.get(v);
            vio.put(v,computeViolations(v));
            violations += vio.get(v);
        }
    }

    private void propagateAddPoint(int k)
    {
        for(Point v = XR.getStartingPointOfRoute(k); v!= XR.getTerminatingPointOfRoute(k); v = XR.next(v)){
            violations -= vio.get(v);
            vio.put(v,computeViolations(v));
            violations += vio.get(v);
        }
    }

    private void propagateRemovePoint(int k)
    {
        for(Point v = XR.getStartingPointOfRoute(k); v!= XR.getTerminatingPointOfRoute(k); v = XR.oldNext(v)){
            if(XR.route(v) == Constants.NULL_POINT)
                violations -= vio.get(v);
            else{
                violations -= vio.get(v);
                vio.put(v,computeViolations(v));
                violations += vio.get(v);
            }
        }
    }

    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.oldRoute(x);
        int ky = XR.oldRoute(y);
        if (kx == ky) {
            propagate(kx);
        } else {
            propagate(kx);
            propagate(ky);
        }
    }


    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.oldRoute(x);
        propagate(kx);
    }


    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.oldRoute(x);
        int ky = XR.oldRoute(y);

        propagate(kx);
        propagate(ky);
    }


    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.oldRoute(x);
        int ky = XR.oldRoute(y);

        propagate(kx);
        propagate(ky);
    }


    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.oldRoute(x);
        int ky = XR.oldRoute(y);

        propagate(kx);
        propagate(ky);
    }


    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.oldRoute(x);
        int ky = XR.oldRoute(y);

        propagate(kx);
        propagate(ky);
    }


    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.oldRoute(x);
        int ky = XR.oldRoute(y);

        propagate(kx);
        propagate(ky);
    }


    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.oldRoute(x);
        int ky = XR.oldRoute(y);

        propagate(kx);
        propagate(ky);
    }


    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.oldRoute(x);
        int ky = XR.oldRoute(y);

        propagate(kx);
        propagate(ky);
    }


    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.oldRoute(x);
        int ky = XR.oldRoute(y);

        propagate(kx);
        propagate(ky);
    }


    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        TreeSet<Integer>st = new TreeSet<Integer>();
        st.add(XR.oldRoute(x1));
        st.add(XR.oldRoute(y));
        for(Integer k : st)
            propagate(k);
    }


    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        TreeSet<Integer>st = new TreeSet<Integer>();
        st.add(XR.oldRoute(x1));
        st.add(XR.oldRoute(y));
        for(Integer k : st)
            propagate(k);
    }


    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        TreeSet<Integer>st = new TreeSet<Integer>();
        st.add(XR.oldRoute(x));
        st.add(XR.oldRoute(y));
        st.add(XR.oldRoute(y));
        for(Integer k : st)
            propagate(k);
    }


    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        TreeSet<Integer>st = new TreeSet<Integer>();
        st.add(XR.oldRoute(x));
        st.add(XR.oldRoute(y));
        st.add(XR.oldRoute(y));
        for(Integer k : st)
            propagate(k);
    }


    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        TreeSet<Integer>st = new TreeSet<Integer>();
        st.add(XR.oldRoute(x));
        st.add(XR.oldRoute(y));
        st.add(XR.oldRoute(y));
        for(Integer k : st)
            propagate(k);
    }


    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        TreeSet<Integer>st = new TreeSet<Integer>();
        st.add(XR.oldRoute(x));
        st.add(XR.oldRoute(y));
        st.add(XR.oldRoute(y));
        for(Integer k : st)
            propagate(k);
    }


    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        TreeSet<Integer>st = new TreeSet<Integer>();
        st.add(XR.oldRoute(x));
        st.add(XR.oldRoute(y));
        st.add(XR.oldRoute(y));
        for(Integer k : st)
            propagate(k);
    }


    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        TreeSet<Integer>st = new TreeSet<Integer>();
        st.add(XR.oldRoute(x));
        st.add(XR.oldRoute(y));
        st.add(XR.oldRoute(y));
        for(Integer k : st)
            propagate(k);
    }


    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        TreeSet<Integer>st = new TreeSet<Integer>();
        st.add(XR.oldRoute(x));
        st.add(XR.oldRoute(y));
        st.add(XR.oldRoute(y));
        for(Integer k : st)
            propagate(k);
    }


    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        TreeSet<Integer>st = new TreeSet<Integer>();
        st.add(XR.oldRoute(x));
        st.add(XR.oldRoute(y));
        st.add(XR.oldRoute(y));
        for(Integer k : st)
            propagate(k);
    }


    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2,
                                           Point y2) {
        // TODO Auto-generated method stub
        TreeSet<Integer>st = new TreeSet<Integer>();
        st.add(XR.oldRoute(x1));
        st.add(XR.oldRoute(x2));
        for(Integer k : st)
            propagate(k);
    }


    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        TreeSet<Integer>st = new TreeSet<Integer>();
        st.add(XR.oldRoute(x1));
        st.add(XR.oldRoute(x2));
        st.add(XR.oldRoute(y1));
        st.add(XR.oldRoute(y2));
        for(Integer k : st)
            propagate(k);
    }


    public void propagateThreePointsMove(Point x1, Point x2, Point x3,
                                         Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub
        TreeSet<Integer>st = new TreeSet<Integer>();
        st.add(XR.oldRoute(x1));
        st.add(XR.oldRoute(x2));
        st.add(XR.oldRoute(x3));
        st.add(XR.oldRoute(y1));
        st.add(XR.oldRoute(y2));
        st.add(XR.oldRoute(y3));
        for(Integer k : st)
            propagate(k);
    }


    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                        Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        TreeSet<Integer>st = new TreeSet<Integer>();
        st.add(XR.oldRoute(x1));
        st.add(XR.oldRoute(x2));
        st.add(XR.oldRoute(y1));
        st.add(XR.oldRoute(y2));
        st.add(XR.oldRoute(x3));
        st.add(XR.oldRoute(y3));
        st.add(XR.oldRoute(x4));
        st.add(XR.oldRoute(y4));
        for(Integer k : st)
            propagate(k);
    }


    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        int k = XR.oldRoute(y);
        vio.put(x, 0);
        propagateAddPoint(k);
    }


    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        int k = XR.oldRoute(x);
        propagateRemovePoint(k);
    }

    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2){
        int k = XR.oldRoute(y1);
        vio.put(x1, 0);
        vio.put(x2, 0);
        propagateAddPoint(k);
    }

    public void propagateRemoveTwoPoints(Point x1, Point x2){
        int k = XR.oldRoute(x1);
        propagateRemovePoint(k);
    }

    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }


    public String name() {
        // TODO Auto-generated method stub
        return "CEarliestArrivalTimeVR";
    }


    public int violations() {
        // TODO Auto-generated method stub
        return violations;
    }

    void getSegment(Point begin,Point end)
    {
        Point v = begin;
        while(v!=end)
        {
            t_next.put(v , XR.next(v));
            v = XR.next(v);
        }
    }
    void getRevSegment(Point begin,Point end)
    {
        Point v = begin;
        while(v!=end)
        {
            //System.out.println(v);
            t_next.put(v , XR.prev(v));
            v = XR.prev(v);
        }
    }

    int calDeltaSegment(Point begin,Point end)
    {
        //System.out.println("start cal delta");
        Point v = begin;
        int delta = 0;
        double dt = eat.getEarliestArrivalTime(v)
                + eat.getServiceDuration(v);

        while (v != end) {
            //System.out.println(v);
            Point nv = t_next.get(v);
            double at = dt + eat.getTravelTime(v,nv);
            delta = delta - vio.get(nv);
            delta = delta + computeViolations(nv, at);
            //System.out.println(vio.get(nv)+"  -   "+computeViolations(nv,at));
            dt = (at < eat.getEarliestAllowedArrivalTime(nv) ? eat
                    .getEarliestAllowedArrivalTime(nv) : at )
                    + eat.getServiceDuration(nv);

            v = nv;
        }
        return delta;
    }

    public int evaluateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        //System.out.println(x+"  "+y);
        //System.out.println(XR.index(x)+"  "+XR.index(y));
        int kx = XR.route(x);
        int ky = XR.route(y);
        int delta = 0;
        if (kx == ky) {
            Point v,nv;
            if (XR.index(x) < XR.index(y)) {
                v = XR.prev(x);
                nv = XR.next(x);
                t_next.put(v,nv);
                v = nv;
                while (v != y) {
                    t_next.put(v,XR.next(v));
                    v = XR.next(v);
                }
                t_next.put(y,x);
                t_next.put(x,XR.next(y));
                v = XR.next(y);
                while (v != XR.getTerminatingPointOfRoute(kx)) {
                    t_next.put(v,XR.next(v));
                    v = XR.next(v);
                }
                v = XR.prev(x);

            } else {
                v = y;
                if(XR.next(v)!=x)
                {
                    t_next.put(v, x);
                    t_next.put(x, XR.next(v));
                    v = XR.next(y);
                    while(v != XR.prev(x)){
                        t_next.put(v, XR.next(v));
                        v = XR.next(v);
                    }
                    t_next.put(XR.prev(x),XR.next(x));
                    getSegment(XR.next(x), XR.endPoint(kx));
                    v = y;
                }
                else{
                    return 0;
                }
            }
            double dt = eat.getEarliestArrivalTime(v)
                    + eat.getServiceDuration(v);
            while (v != XR.getTerminatingPointOfRoute(kx)) {
                nv = t_next.get(v);
                double at = dt + eat.getTravelTime(v,nv);
                delta = delta - vio.get(nv);
                delta = delta + computeViolations(nv, at);
                dt = (at < eat.getEarliestAllowedArrivalTime(nv) ? eat
                        .getEarliestAllowedArrivalTime(nv) : at )
                        + eat.getServiceDuration(nv);

                v = nv;
            }

        } else {
            Point v,nv;
            // process route kx
            v = XR.prev(x);
            double dt = eat.getEarliestArrivalTime(v)
                    + eat.getServiceDuration(v);
            nv = XR.next(x);
            double at = dt + eat.getTravelTime(v,nv);
            delta = delta - vio.get(nv);
            delta = delta + computeViolations(nv,at);
            v = nv;
            dt = (at < eat.getEarliestAllowedArrivalTime(nv) ? eat
                    .getEarliestAllowedArrivalTime(nv) : at )
                    + eat.getServiceDuration(nv);

            while (v != XR.getTerminatingPointOfRoute(kx)) {
                nv = XR.next(v);
                at = dt + eat.getTravelTime(v,nv);
                delta = delta - vio.get(nv);
                delta = delta + computeViolations(nv, at);
                dt = (at < eat.getEarliestAllowedArrivalTime(nv) ? eat
                        .getEarliestAllowedArrivalTime(nv) : at )
                        + eat.getServiceDuration(nv);

                v = nv;
            }

            // process route ky
            v = y;
            dt = eat.getEarliestArrivalTime(v)
                    + eat.getServiceDuration(v);
            nv = x;
            at = dt + eat.getTravelTime(v,nv);
            delta = delta - vio.get(nv);
            delta = delta + computeViolations(nv,at);

            v = x;
            dt = ( at < eat.getEarliestAllowedArrivalTime(nv) ? eat
                    .getEarliestAllowedArrivalTime(nv) : at )
                    + eat.getServiceDuration(nv);
            nv = XR.next(y);
            at = dt + eat.getTravelTime(v,nv);
            delta = delta - vio.get(nv);
            delta = delta + computeViolations(nv,at);

            v = nv;
            dt = (at < eat.getEarliestAllowedArrivalTime(nv) ? eat
                    .getEarliestAllowedArrivalTime(nv) : at )
                    + eat.getServiceDuration(nv);
            while (v != XR.getTerminatingPointOfRoute(ky)) {
                nv = XR.next(v);
                at = dt + eat.getTravelTime(v,nv);
                delta = delta - vio.get(nv);
                delta = delta + computeViolations(nv, at);
                dt = ( at < eat.getEarliestAllowedArrivalTime(nv) ? eat
                        .getEarliestAllowedArrivalTime(nv) : at )
                        + eat.getServiceDuration(nv);

                v = nv;
            }

        }
        return delta;
    }

    // move of type b [Groer et al., 2010]
    // x and y are on the same route and are not the depots, y locates before x on the route
    // remove (prev[x],x) and (x,next[x]) and (prev[y], y) and (y, next(y)
    // insert (x,prev[y]) and (next[y],x) and (next[x],y) and (y, prev[x])

    public int evaluateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.oldRoute(x);
        int delta = 0;
        Point v,nv;
        if (XR.index(x) < XR.index(y)) {
            v = XR.prev(x);
            nv = XR.next(x);
            t_next.put(v,nv);
            v = nv;
            while (v != y) {
                t_next.put(v,XR.next(v));
                v = XR.next(v);
            }
            t_next.put(y,x);
            t_next.put(x,XR.next(y));
            v = XR.next(y);
            while (v != XR.getTerminatingPointOfRoute(kx)) {
                t_next.put(v,XR.next(v));
                v = XR.next(v);
            }
            v = XR.prev(x);

        } else {
            v = y;
            if(XR.next(v)!=x)
            {
                t_next.put(v, x);
                t_next.put(x, XR.next(v));
                v = XR.next(y);
                while(v != XR.prev(x)){
                    t_next.put(v, XR.next(v));
                    v = XR.next(v);
                }
                t_next.put(XR.prev(x),XR.next(x));
                getSegment(XR.next(x), XR.endPoint(kx));
                v = y;
            }
            else{
                return 0;
            }
        }
        double dt = eat.getEarliestArrivalTime(v)
                + eat.getServiceDuration(v);
        while (v != XR.getTerminatingPointOfRoute(kx)) {
            nv = t_next.get(v);
            double at = dt + eat.getTravelTime(v,nv);
            delta = delta - vio.get(nv);
            delta = delta + computeViolations(nv, at);
            dt = (at < eat.getEarliestAllowedArrivalTime(nv) ? eat
                    .getEarliestAllowedArrivalTime(nv) : at )
                    + eat.getServiceDuration(nv);

            v = nv;
        }
        return delta;
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,y) and (next[x],next(y))

    public int evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub

        int kx = XR.route(x);
        int ky = XR.route(y);
        Point nx = XR.next(x);
        Point ny = XR.next(y);

        t_next.put(x,y);

        getRevSegment(y,XR.getStartingPointOfRoute(ky));


        t_next.put(nx,ny);
        getRevSegment(XR.getTerminatingPointOfRoute(kx),nx);
        getSegment(ny,XR.getTerminatingPointOfRoute(ky));

        int delta  = 0;

        delta += calDeltaSegment(x, XR.getStartingPointOfRoute(ky));
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(kx), XR.getTerminatingPointOfRoute(ky));

        return delta;
    }


    public int evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x);
        int ky = XR.route(y);
        Point nx = XR.next(x);
        Point ny = XR.next(y);

        t_next.put(y, x);

        getRevSegment(x,XR.getStartingPointOfRoute(kx));


        t_next.put(nx,ny);
        getRevSegment(XR.getTerminatingPointOfRoute(kx),nx);
        getSegment(ny,XR.getTerminatingPointOfRoute(ky));

        int delta  = 0;

        delta += calDeltaSegment(y, XR.getStartingPointOfRoute(kx));
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(kx), XR.getTerminatingPointOfRoute(ky));

        return delta;
    }


    public int evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x);
        int ky = XR.route(y);
        Point nx = XR.next(x);
        Point ny = XR.next(y);

        t_next.put(x,y);

        getRevSegment(y,XR.getStartingPointOfRoute(ky));


        t_next.put(ny, nx);
        getRevSegment(XR.getTerminatingPointOfRoute(ky),ny);
        getSegment(nx,XR.getTerminatingPointOfRoute(kx));

        int delta  = 0;

        delta += calDeltaSegment(x, XR.getStartingPointOfRoute(ky));
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(ky), XR.getTerminatingPointOfRoute(kx));

        return delta;
    }


    public int evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x);
        int ky = XR.route(y);
        Point nx = XR.next(x);
        Point ny = XR.next(y);

        t_next.put(y, x);

        getRevSegment(x,XR.getStartingPointOfRoute(kx));


        t_next.put(ny,nx);
        getRevSegment(XR.getTerminatingPointOfRoute(ky),ny);

        getSegment(nx,XR.getTerminatingPointOfRoute(kx));

        int delta  = 0;
        delta += calDeltaSegment(y, XR.getStartingPointOfRoute(kx));
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(ky), XR.getTerminatingPointOfRoute(kx));

        return delta;
    }


    public int evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x);
        int ky = XR.route(y);
        Point nx = XR.next(x);
        Point ny = XR.next(y);

        t_next.put(x, ny);

        getSegment(ny,XR.getTerminatingPointOfRoute(ky));


        t_next.put(y, nx);
        //getRevSegment(XR.getTerminatingPointOfRoute(ky),ny);
        getSegment(nx,XR.getTerminatingPointOfRoute(kx));

        int delta  = 0;
        delta += calDeltaSegment(y, XR.getTerminatingPointOfRoute(kx));
        delta += calDeltaSegment(x, XR.getTerminatingPointOfRoute(ky));

        return delta;
    }


    public int evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x);
        int ky = XR.route(y);
        Point nx = XR.next(x);
        Point ny = XR.next(y);

        t_next.put(ny, x);

        getRevSegment(x,XR.getStartingPointOfRoute(kx));
        getRevSegment(XR.getTerminatingPointOfRoute(ky),ny);

        t_next.put(y, nx);
        getSegment(nx,XR.getTerminatingPointOfRoute(kx));


        int delta  = 0;
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(ky), XR.getStartingPointOfRoute(kx));
        delta += calDeltaSegment(nx,XR.getTerminatingPointOfRoute(kx));

        return delta;
    }


    public int evaluateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x);
        int ky = XR.route(y);
        Point nx = XR.next(x);
        Point ny = XR.next(y);

        t_next.put(x, ny);

        getSegment(ny,XR.getTerminatingPointOfRoute(ky));

        t_next.put(nx, y);
        getRevSegment(XR.getTerminatingPointOfRoute(kx),nx);
        getRevSegment(y,XR.getStartingPointOfRoute(ky));

        int delta  = 0;
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(kx), XR.getStartingPointOfRoute(ky));
        delta += calDeltaSegment(x, XR.getTerminatingPointOfRoute(ky));

        return delta;
    }


    public int evaluateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x);
        int ky = XR.route(y);
        Point nx = XR.next(x);
        Point ny = XR.next(y);

        t_next.put(ny, x);

        getRevSegment(x,XR.getStartingPointOfRoute(kx));
        getRevSegment(XR.getTerminatingPointOfRoute(ky),ny);

        t_next.put(nx, y);
        getRevSegment(XR.getTerminatingPointOfRoute(kx),nx);
        getRevSegment(y,XR.getStartingPointOfRoute(ky));


        int delta  = 0;
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(kx),XR.getStartingPointOfRoute(ky));
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(ky),XR.getStartingPointOfRoute(kx));

        return delta;
    }


    public int evaluateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x1);
        int ky = XR.route(y);
        Point px1 = XR.prev(x1);
        Point nx2 = XR.next(x2);
        Point ny = XR.next(y);

        t_next.put(px1,nx2);
        getSegment(nx2, XR.getTerminatingPointOfRoute(kx));

        t_next.put(y, x1);
        getSegment(x1,x2);
        t_next.put(x2,ny);
        getSegment(ny,XR.getTerminatingPointOfRoute(ky));

        int delta  = 0;
        delta += calDeltaSegment(px1, XR.getTerminatingPointOfRoute(kx));
        delta += calDeltaSegment(y, XR.getTerminatingPointOfRoute(ky));

        return delta;
    }


    public int evaluateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x1);
        int ky = XR.route(y);
        Point px1 = XR.prev(x1);
        Point nx2 = XR.next(x2);
        Point ny = XR.next(y);

        t_next.put(px1, nx2);
        getSegment(nx2, XR.getTerminatingPointOfRoute(kx));

        t_next.put(y, x2);
        getRevSegment(x2,x1);
        t_next.put(x1, ny);
        getSegment(ny,XR.getTerminatingPointOfRoute(ky));

        int delta  = 0;
        delta += calDeltaSegment(px1, XR.getTerminatingPointOfRoute(kx));
        delta += calDeltaSegment(y, XR.getTerminatingPointOfRoute(ky));

        return delta;
    }


    public int evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int k = XR.route(x);
        Point nx = XR.next(x);
        Point ny = XR.next(y);
        Point nz = XR.next(z);


        t_next.put(x,z);
        getRevSegment(z,ny);
        t_next.put(ny,nx);
        getSegment(nx,y);
        t_next.put(y,nz);
        getSegment(nz,XR.getTerminatingPointOfRoute(k));

        int delta  = 0;
        delta += calDeltaSegment(x, XR.getTerminatingPointOfRoute(k));
        return delta;
    }


    public int evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int k = XR.route(x);
        Point nx = XR.next(x);
        Point ny = XR.next(y);
        Point nz = XR.next(z);


        getRevSegment(XR.getTerminatingPointOfRoute(k),nz);
        t_next.put(nz, y);
        getRevSegment(y,nx);
        t_next.put(nx,ny);
        getSegment(ny,z);
        t_next.put(z, x);
        getRevSegment(x,XR.getStartingPointOfRoute(k));

        int delta  = 0;
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(k), XR.getStartingPointOfRoute(k));
        return delta;
    }


    public int evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int k = XR.route(x);
        Point nx = XR.next(x);
        Point ny = XR.next(y);
        Point nz = XR.next(z);


        t_next.put(x,y);
        getRevSegment(y,nx);
        t_next.put(nx, z);
        getRevSegment(z,ny);
        t_next.put(ny,nz);
        getSegment(nz,XR.getTerminatingPointOfRoute(k));

        int delta  = 0;
        delta += calDeltaSegment(x, XR.getTerminatingPointOfRoute(k));

        return delta;
    }


    public int evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int k = XR.route(x);
        Point nx = XR.next(x);
        Point ny = XR.next(y);
        Point nz = XR.next(z);


        getRevSegment(XR.getTerminatingPointOfRoute(k),nz);
        t_next.put(nz,ny);
        getSegment(ny,z);
        t_next.put(z, nx);
        getSegment(nx,y);
        t_next.put(y,x);
        getRevSegment(x,XR.getStartingPointOfRoute(k));

        int delta  = 0;
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(k), XR.getStartingPointOfRoute(k));

        return delta;
    }


    public int evaluateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int k = XR.route(x);
        Point nx = XR.next(x);
        Point ny = XR.next(y);
        Point nz = XR.next(z);

        t_next.put(x, ny);
        getSegment(ny,z);
        t_next.put(z,nx);
        getSegment(nx,y);
        t_next.put(y,nz);
        getSegment(nz,XR.getTerminatingPointOfRoute(k));

        int delta  = 0;
        delta += calDeltaSegment(x, XR.getTerminatingPointOfRoute(k));

        return delta;
    }


    public int evaluateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int k = XR.route(x);
        Point nx = XR.next(x);
        Point ny = XR.next(y);
        Point nz = XR.next(z);

        getRevSegment(XR.getTerminatingPointOfRoute(k),nz);
        t_next.put(nz, y);
        getRevSegment(y,nx);
        t_next.put(nx, z);
        getRevSegment(z,ny);
        t_next.put(ny, x);
        getRevSegment(x,XR.getStartingPointOfRoute(k));

        int delta  = 0;
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(k), XR.getStartingPointOfRoute(k));

        return delta;
    }


    public int evaluateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int k = XR.route(x);
        Point nx = XR.next(x);
        Point ny = XR.next(y);
        Point nz = XR.next(z);

        t_next.put(x, ny);
        getSegment(ny,z);
        t_next.put(z,y);
        getRevSegment(y,nx);
        t_next.put(nx, nz);
        getSegment(nz,XR.getTerminatingPointOfRoute(k));

        int delta  = 0;
        delta += calDeltaSegment(x, XR.getTerminatingPointOfRoute(k));

        return delta;
    }


    public int evaluateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int k = XR.route(x);
        Point nx = XR.next(x);
        Point ny = XR.next(y);
        Point nz = XR.next(z);

        getRevSegment(XR.getTerminatingPointOfRoute(k),nz);
        t_next.put(nz, nx);
        getSegment(nx,y);
        t_next.put(y, z);
        getRevSegment(z,ny);
        t_next.put(ny, x);
        getRevSegment(x,XR.getStartingPointOfRoute(k));

        int delta  = 0;
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(k), XR.getStartingPointOfRoute(k));

        return delta;
    }


    public int evaluateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        Point nx1 = XR.next(x1);
        Point ny1 = XR.next(y1);
        Point nx2 = XR.next(x2);
        Point ny2 = XR.next(y2);
        int k1 = XR.route(x1);
        int k2 = XR.route(x2);

        t_next.put(x1, nx2);
        getSegment(nx2, y2);
        t_next.put(y2,ny1);
        getSegment(ny1, XR.getTerminatingPointOfRoute(k1));

        t_next.put(x2, nx1);
        getSegment(nx1, y1);
        t_next.put(y1, ny2);
        getSegment(ny2, XR.getTerminatingPointOfRoute(k2));

        int delta  = 0;
        delta += calDeltaSegment(x1, XR.getTerminatingPointOfRoute(k1));
        delta += calDeltaSegment(x2, XR.getTerminatingPointOfRoute(k2));

        return delta;
    }

    // remove x1, x2 from their current routes
    // x1 , x2 in same route , index x1 < index x2
    // y1, y2 in same route , index y1 < index y2
    // route of x1 != route of y1
    // re-insert x1 between y1 and next[y1]
    // re-insert x2 between y2 and next[y2]

    public int evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        ArrayList<Point> x = new ArrayList<Point>();
        ArrayList<Point> y = new ArrayList<Point>();
        x.add(x1);
        x.add(x2);
        y.add(y1);
        y.add(y2);
        return evaluateKPointsMove(x, y);
    }


    public int evaluateThreePointsMove(Point x1, Point x2, Point x3, Point y1,
                                       Point y2, Point y3) {
        // TODO Auto-generated method stub
        ArrayList<Point> x = new ArrayList<Point>();
        ArrayList<Point> y = new ArrayList<Point>();
        x.add(x1);
        x.add(x2);
        x.add(x3);
        y.add(y1);
        y.add(y2);
        y.add(y3);
        return evaluateKPointsMove(x, y);
    }


    public int evaluateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                      Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        ArrayList<Point> x = new ArrayList<Point>();
        ArrayList<Point> y = new ArrayList<Point>();
        x.add(x1);
        x.add(x2);
        x.add(x3);
        y.add(y1);
        y.add(y2);
        y.add(y3);
        return evaluateKPointsMove(x, y);
    }


    public int evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        int k = XR.route(y);
        Point ny = XR.next(y);
        t_next.put(y, x);
        t_next.put(x, ny);
        vio.put(x, 0);
        getSegment(ny, XR.getTerminatingPointOfRoute(k));
        int delta = 0;
        //System.out.println("tnexxt");
        //for(int i  =0; i < t_next.size(); i++)
        //System.out.println(t_next.get(i));
        delta += calDeltaSegment(y, XR.getTerminatingPointOfRoute(k));
        return delta;
    }


    public int evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        int k = XR.route(x);
        Point px = XR.prev(x);
        Point nx = XR.next(x);
        t_next.put(px,nx);
        getSegment(nx, XR.getTerminatingPointOfRoute(k));

        return calDeltaSegment(px, XR.getTerminatingPointOfRoute(k));
    }

    public int evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2){
        int k = XR.route(y1);
        Point ny1 = XR.next(y1);
        t_next.put(y1, x1);
        vio.put(x1, 0);
        vio.put(x2, 0);
        if(y1 != y2){
            t_next.put(x1, ny1);
            getSegment(ny1, y2);
            Point ny2 = XR.next(y2);
            t_next.put(y2, x2);
            t_next.put(x2, ny2);
            getSegment(ny2, XR.getTerminatingPointOfRoute(k));
        }
        else{
            t_next.put(x1, x2);
            t_next.put(x2, ny1);
            getSegment(ny1, XR.getTerminatingPointOfRoute(k));
        }
        return calDeltaSegment(y1, XR.getTerminatingPointOfRoute(k));
    }

    public int evaluateRemoveTwoPoints(Point x1, Point x2){
        int k = XR.route(x1);
        Point px1 = XR.prev(x1);
        Point nx1 = XR.next(x1);
        Point px2 = XR.prev(x2);
        Point nx2 = XR.next(x2);
        if(x2 == nx1){
            t_next.put(px1, nx2);
            getSegment(nx2, XR.getTerminatingPointOfRoute(k));
        }
        else{
            t_next.put(px1, nx1);
            getSegment(nx1, px2);
            t_next.put(px2, nx2);
            getSegment(nx2, XR.getTerminatingPointOfRoute(k));
        }

        return calDeltaSegment(px1, XR.getTerminatingPointOfRoute(k));
    }

    public int evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return 0;
    }

    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        HashSet<Integer> st = new HashSet<Integer>();
        for(Point p : x)
            st.add(XR.oldRoute(p));
        for(Point p : y)
            if( p != CBLSVR.NULL_POINT)
                st.add(XR.oldRoute(p));
        for(int k : st)
        {
            propagate(k);
        }
    }
    private int evaluateVioRoute(int k,Set<Point>out,ArrayList<Point>in,ArrayList<Point>preIn)
    {
        //System.out.println(k+","+KPointsMove.array2String(in)+","+KPointsMove.array2String(preIn));
        //System.out.print("Out : ");
        //for(Point p : out)
        //System.out.print(p.getID()+" ");
        //System.out.println();
        int delta = 0;
        Point s = XR.getStartingPointOfRoute(k);
        Point pre = s;
        delta -= vio.get(s);
        while(!XR.isTerminatingPoint(s))
        {
            Point ns = XR.next(s);
            delta -= vio.get(ns);
            if(!out.contains(ns))
            {
                t_next.put(pre, ns);
                pre = ns;
            }
            s = ns;
        }
        for(int i = in.size()-1; i >= 0; --i)
        {
            Point inp = in.get(i);
            Point preP = preIn.get(i);
            Point nex = t_next.get(preP);
            t_next.put(preP, inp);
            t_next.put(inp, nex);
        }
        Point v = XR.getStartingPointOfRoute(k);
        double dt = eat.getEarliestArrivalTime(v)
                + eat.getServiceDuration(v);

        while (v != XR.endPoint(k)) {
            //System.out.println(v);
            Point nv = t_next.get(v);
            double at = dt + eat.getTravelTime(v,nv);
            //delta = delta - vio.get(nv);
            delta = delta + computeViolations(nv, at);
            dt = (at < eat.getEarliestAllowedArrivalTime(nv) ? eat
                    .getEarliestAllowedArrivalTime(nv) : at )
                    + eat.getServiceDuration(nv);
            v = nv;
        }
        return delta;
    }

    public int evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        HashMap<Integer,Set<Point>> mout= new HashMap<Integer,Set<Point>>();
        HashMap<Integer,ArrayList<Point>> min = new HashMap<Integer,ArrayList<Point>>();
        HashMap<Integer,ArrayList<Point>> mPrein = new HashMap<Integer,ArrayList<Point>>();
        Set<Integer> sk = new HashSet<Integer>();
        for(int i=0;i<x.size();++i)
        {
            Point px = x.get(i);
            Point py = y.get(i);
            int kx = 0;
            if(XR.contains(px))
            {
                kx = XR.route(px);
                sk.add(kx);
                if(mout.containsKey(kx))
                {
                    mout.get(kx).add(px);
                }
                else{
                    Set<Point> o = new HashSet<Point>();
                    o.add(px);
                    mout.put(kx, o);
                }
            }
            if(XR.contains(py))
            {
                int ky = XR.route(py);
                sk.add(ky);
                if(min.containsKey(ky))
                {
                    min.get(ky).add(px);
                    mPrein.get(ky).add(py);
                }
                else{
                    ArrayList<Point>tin = new ArrayList<Point>();
                    tin.add(px);
                    ArrayList<Point>tprein = new ArrayList<Point>();
                    tprein.add(py);
                    min.put(ky, tin);
                    mPrein.put(ky, tprein);
                }
            }
        }
        int delta = 0;
        for(int k : sk)
        {
            Set<Point>out = new HashSet<Point>();
            ArrayList<Point> in = new ArrayList<Point>();
            ArrayList<Point> prein = new ArrayList<Point>();
            if(mout.containsKey(k))
                out = mout.get(k);
            if(min.containsKey(k))
            {
                in = min.get(k);
                prein = mPrein.get(k);
            }
            delta += evaluateVioRoute(k, out, in, prein);
        }
        //System.out.println(delta);
        return delta;
    }

    @Override
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        // TODO Auto-generated method stub

    }

}
interface IDistanceManager {
    public double getDistance(Point x, Point y);
}

class AccumulatedWeightEdgesVR implements InvariantVR {

    protected HashMap<Point, Integer> map;

    protected double[] costRight;
    protected double[] costLeft;

    protected VarRoutesVR XR;
    protected VRManager mgr;
    //protected ArcWeightsManager awm;
    protected IDistanceManager awm;
    //public AccumulatedWeightEdgesVR(VarRoutesVR XR, ArcWeightsManager awm){
    public AccumulatedWeightEdgesVR(VarRoutesVR XR, IDistanceManager awm){
        this.awm = awm;
        this.XR = XR;
        this.mgr = XR.getVRManager();
        post();
    }

    public VarRoutesVR getVarRoutesVR(){
        return this.XR;
    }

    protected int getIndex(Point p) {
        //System.out.println(name() + "::getIndex(" + p.ID + ")");
        return map.get(p);
    }

    public double getCostRight(Point p){
        return costRight[getIndex(p)];
    }

    public double getCostLeft(Point p){
        return costLeft[getIndex(p)];
    }

    public double getCost(Point x, Point y){
        return awm.getDistance(x, y);
    }


    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return mgr;
    }

    private void post() {
        map = new HashMap<Point, Integer>();
        ArrayList<Point> points = XR.getAllPoints();
        for (int i = 0; i < points.size(); i++) {
            map.put(points.get(i), i);
        }
        costLeft = new double[points.size()];
        costRight = new double[points.size()];
        for(int i = 0; i < costRight.length; i++)
            costRight[i] = 0;
        for(int i = 0; i < costLeft.length; i++)
            costLeft[i] = 0;
        mgr.post(this);
    }


    public String name(){
        return "AccumulatedWeightEdgesVR";
    }

    protected void update(int k) {
        Point sp = XR.getStartingPointOfRoute(k);
        Point tp = XR.getTerminatingPointOfRoute(k);
        //costRight[getIndex(sp)] = 0;
        for (Point u = sp; u != tp; u = XR.next(u)) {
            costRight[getIndex(XR.next(u))] = costRight[getIndex(u)] + awm.getDistance(u, XR.next(u));
        }
        //costLeft[getIndex(tp)] = 0;
        for (Point u = tp; u != sp; u = XR.prev(u)) {
            costLeft[getIndex(XR.prev(u))] = costLeft[getIndex(u)] + awm.getDistance(u, XR.prev(u));
        }
    }

    public void setAccumulatedWeightStartPoint(int k, double w){
        costRight[getIndex(XR.startPoint(k))] = w;
    }
    public void initPropagation() {
        // TODO Auto-generated method stub
        for (int i = 1; i <= XR.getNbRoutes(); i++) {
            update(i);
        }
    }

    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        System.out.println(name() + "::propagateTwoOptMoveOneRoute NOT IMPLEMENTED YET");
        System.exit(-1);
    }

    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x));
        oldR.add(XR.oldRoute(y));
        for (int r : oldR) {
            update(r);
        }

    }


    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        if (XR.next(x) == y) {
            propagateTwoPointsMove(y, x, XR.prev(x), XR.prev(x));
        } else if (XR.next(y) == x) {
            propagateTwoPointsMove(x, y, XR.prev(y), XR.prev(y));
        } else {
            propagateTwoPointsMove(x, y, XR.prev(y), XR.prev(x));
        }
    }


    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
    }


    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
    }


    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
    }


    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
    }


    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
    }


    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
    }


    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
    }


    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
    }


    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x1));
        update(XR.oldRoute(y));
    }


    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        //System.out.println(name() + " " + v + "\n" + toString() + getValue());
        update(XR.oldRoute(x1));
        update(XR.oldRoute(y));
        //System.out.println(getValue());
    }


    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x1));
        update(XR.oldRoute(x2));
    }


    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        //System.out.println(name() + "::propagateTwoPointsMove(" + x1 + "," + x2 + "," + y1 + "," + y2 + ")");
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x1));
        oldR.add(XR.oldRoute(y1));
        oldR.add(XR.oldRoute(x2));
        oldR.add(XR.oldRoute(y2));
        for (int r : oldR) {
            update(r);
        }
    }

    public void propagateThreePointsMove(Point x1, Point x2, Point x3, Point y1,
                                         Point y2, Point y3) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x1));
        oldR.add(XR.oldRoute(y1));
        oldR.add(XR.oldRoute(x2));
        oldR.add(XR.oldRoute(y2));
        oldR.add(XR.oldRoute(x3));
        oldR.add(XR.oldRoute(y3));
        for (int r : oldR) {
            update(r);
        }
    }

    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4, Point y1,
                                        Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x1));
        oldR.add(XR.oldRoute(y1));
        oldR.add(XR.oldRoute(x2));
        oldR.add(XR.oldRoute(y2));
        oldR.add(XR.oldRoute(x3));
        oldR.add(XR.oldRoute(y3));
        oldR.add(XR.oldRoute(x4));
        oldR.add(XR.oldRoute(y4));
        for (int r : oldR) {
            update(r);
        }
    }

    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        //System.out.println(name() + "::propagateAddOnePoint(" + x + "," + y + ")"); System.exit(-1);
        update(XR.route(y));
    }


    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        costRight[getIndex(x)] = costLeft[getIndex(x)] = 0;
    }

    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        update(XR.route(y1));
    }


    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x1));
        costRight[getIndex(x1)] = costLeft[getIndex(x1)] = costRight[getIndex(x2)] = costLeft[getIndex(x2)] = 0;
    }

    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        costRight[getIndex(x)] = costLeft[getIndex(x)] = 0;
        if (XR.oldRoute(x) != XR.oldRoute(z)) {
            update(XR.oldRoute(z));
        }
    }


    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        for (int i = 0; i < x.size(); i++) {
            Point p = x.get(i);
            Point q = y.get(i);
            if (q != CBLSVR.NULL_POINT) {
                oldR.add(XR.oldRoute(p));
                oldR.add(XR.oldRoute(q));
            } else {
                oldR.add(XR.oldRoute(p));
                costRight[getIndex(p)] = costLeft[getIndex(p)] = 0;
            }
        }
        for (int r : oldR) {
            if (r != Constants.NULL_POINT) {
                update(r);
            }
        }
    }

    public String toString() {
        String s = "";
        for (int k = 1; k <= XR.getNbRoutes(); k++) {
            s += "route[" + k + "] : ";
            for (Point x = XR.getStartingPointOfRoute(k); x != XR.getTerminatingPointOfRoute(k); x = XR.next(x)) {
                s += x.getID() + " " + getCostRight(x) + " " + getCostLeft(x) + " | " ;
            }
            s += "\n";
        }
        return s;
    }



}
class AccumulatedWeightNodesVR implements InvariantVR {

    protected VarRoutesVR XR;
    protected VRManager mgr;
    protected NodeWeightsManager nwm;

    protected double[] sumWeights;
    protected HashMap<Point, Integer> map;

    public AccumulatedWeightNodesVR(VarRoutesVR XR, NodeWeightsManager nwm){
        this.nwm = nwm;
        this.XR = XR;
        this.mgr = XR.getVRManager();
        post();
    }

    private void post(){
        sumWeights = new double[XR.getTotalNbPoints()];
        map = new HashMap<Point, Integer>();
        ArrayList<Point> points = XR.getAllPoints();
        for (int i = 0; i < points.size(); i++) {
            map.put(points.get(i), i);
        }
        for(int k= 1; k <= XR.getNbRoutes(); k++){
            Point p = XR.startPoint(k);
            sumWeights[getIndex(p)] = nwm.getWeight(p);
        }

        mgr.post(this);
    }

    protected int getIndex(Point p) {
        return map.get(p);
    }

    public double getWeights(Point p){
        return nwm.getWeight(p);
    }
    public double getSumWeights(Point p){
        return sumWeights[getIndex(p)];
    }
    public VarRoutesVR getVarRoutesVR(){
        return this.XR;
    }

    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return mgr;
    }

    public String name() {
        return "AccumulatedWeightNodesVR";
    }
    public void setAccumulatedWeightStartPoint(int k, double w){
        Point sp = XR.startPoint(k);
        nwm.setWeight(sp, w);
        sumWeights[getIndex(sp)] = w;
    }
    // update sumWeight of points of route k
    protected void update(int k) {
        //System.out.println(name() + "::update(" + k + ")");
        Point sp = XR.getStartingPointOfRoute(k);
        Point tp = XR.getTerminatingPointOfRoute(k);
        //sumWeights[getIndex(sp)] = nwm.getWeight(sp);
        for (Point u = sp; u != tp; u = XR.next(u)){
            sumWeights[getIndex(XR.next(u))] = sumWeights[getIndex(u)] + nwm.getWeight(XR.next(u));
        }
    }


    public void initPropagation() {
        // TODO Auto-generated method stub
        for (int i = 1; i <= XR.getNbRoutes(); i++) {
            update(i);
        }
    }

    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        System.out.println(name() + "::propagateTwoOptMoveOneRoute NOT IMPLEMENTED YET");
        System.exit(-1);
    }

    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x));
        oldR.add(XR.oldRoute(y));
        for (int r : oldR) {
            update(r);
        }

    }


    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        if (XR.next(x) == y) {
            propagateTwoPointsMove(y, x, XR.prev(x), XR.prev(x));
        } else if (XR.next(y) == x) {
            propagateTwoPointsMove(x, y, XR.prev(y), XR.prev(y));
        } else {
            propagateTwoPointsMove(x, y, XR.prev(y), XR.prev(x));
        }
    }


    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
    }


    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
    }


    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
    }


    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
    }


    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
    }


    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
    }


    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
    }


    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
    }


    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x1));
        update(XR.oldRoute(y));
    }


    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x1));
        update(XR.oldRoute(y));
    }


    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x1));
        update(XR.oldRoute(x2));
    }

    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x1));
        oldR.add(XR.oldRoute(y1));
        oldR.add(XR.oldRoute(x2));
        oldR.add(XR.oldRoute(y2));
        for (int r : oldR) {
            update(r);
        }
    }

    public void propagateThreePointsMove(Point x1, Point x2, Point x3, Point y1,
                                         Point y2, Point y3) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x1));
        oldR.add(XR.oldRoute(y1));
        oldR.add(XR.oldRoute(x2));
        oldR.add(XR.oldRoute(y2));
        oldR.add(XR.oldRoute(x3));
        oldR.add(XR.oldRoute(y3));
        for (int r : oldR) {
            update(r);
        }
    }

    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4, Point y1,
                                        Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x1));
        oldR.add(XR.oldRoute(y1));
        oldR.add(XR.oldRoute(x2));
        oldR.add(XR.oldRoute(y2));
        oldR.add(XR.oldRoute(x3));
        oldR.add(XR.oldRoute(y3));
        oldR.add(XR.oldRoute(x4));
        oldR.add(XR.oldRoute(y4));
        for (int r : oldR) {
            update(r);
        }
    }

    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        update(XR.route(y));
    }


    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        sumWeights[getIndex(x)] = 0;
    }

    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        update(XR.route(y1));
    }


    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x1));
        sumWeights[getIndex(x1)] = sumWeights[getIndex(x2)] = 0;
    }

    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x));
        sumWeights[getIndex(x)] = 0;
        if (XR.oldRoute(x) != XR.oldRoute(z)) {
            update(XR.oldRoute(z));
        }
    }


    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        for (int i = 0; i < x.size(); i++) {
            Point p = x.get(i);
            Point q = y.get(i);
            if (q != CBLSVR.NULL_POINT) {
                oldR.add(XR.oldRoute(p));
                oldR.add(XR.oldRoute(q));
            } else {
                oldR.add(XR.oldRoute(p));
                sumWeights[getIndex(p)] = 0;
            }
        }
        for (int r : oldR) {
            if (r != Constants.NULL_POINT) {
                update(r);
            }
        }
    }

    public String toString() {
        String s = "";
        for (int k = 1; k <= XR.getNbRoutes(); k++) {
            s += "route[" + k + "] : ";
            Point x = XR.getStartingPointOfRoute(k);
            while (x != XR.getTerminatingPointOfRoute(k)) {
                s += x.getID() + " (" + sumWeights[getIndex(x)] + ") ";
                x = XR.next(x);
            }
            s += x.getID() + " (" + sumWeights[getIndex(x)] + ") ";
            s += "\n";
        }
        return s;
    }
}
class ArcWeightsManager implements IDistanceManager{
    private ArrayList<Point> points;
    private HashMap<Point, Integer> map;
    private double[][] weights;

    public ArcWeightsManager(ArrayList<Point> points){
        this.points = points;
        map = new HashMap<Point, Integer>();
        for(int i = 0; i < points.size(); i++){
            map.put(points.get(i), i);
            //System.out.println(name() + "::constructor, map.put(" + points.get(i).ID + "," + i + ")");
        }
        weights = new double[points.size()][points.size()];
    }
    public String name(){
        return "ArcWeightsManager";
    }
    public void setWeight(Point p1, Point p2, double w){
        //System.out.println(name() + "::setWeight p1 = " + p1.ID + ", p2 = " + p2.ID +
        //		", map p1 = " + map.get(p1) + ", map p2 = " + map.get(p2) + ", w = " + w);
        weights[map.get(p1)][map.get(p2)] = w;
    }
    public double getWeight(Point p1, Point p2){
        return weights[map.get(p1)][map.get(p2)];
    }

    public double getDistance(Point x, Point y){
        return getWeight(x,y);
    }
    public double[][] getWeight() {
        return weights;
    }
    public ArrayList<Point> getPoints(){
        return this.points;
    }

}

class EarliestArrivalTimeVR implements InvariantVR {
    VarRoutesVR XR;
    ArcWeightsManager awm;
    HashMap<Point, Integer> earliestAllowedArrivalTime;
    HashMap<Point, Integer> serviceDuration;
    private HashMap<Point, Double> earliestArrivalTime;
    public EarliestArrivalTimeVR(VarRoutesVR XR, ArcWeightsManager awm,
                                 HashMap<Point, Integer> earliestAllowedArrivalTime, HashMap<Point, Integer> serviceDuration){
        this.XR = XR;
        this.awm = awm;
        this.earliestAllowedArrivalTime = earliestAllowedArrivalTime;
        this.serviceDuration = serviceDuration;
        earliestArrivalTime = new HashMap<Point,Double>();
        getVRManager().post(this);
    }

    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return XR.getVRManager();
    }



    public void initPropagation() {
        // TODO Auto-generated method stub
        int nr = XR.getNbRoutes();
        for(int i=1;i<=nr;++i)
            update(i);
    }

    private void update(int k){
        Point s = XR.getStartingPointOfRoute(k);
        earliestArrivalTime.put( s ,1.0*earliestAllowedArrivalTime.get(s));

        for(Point x = s; x != XR.getTerminatingPointOfRoute(k); x = XR.next(x)){
            Point nx = XR.next(x);
            //System.out.println(earliestArrivalTime.get(x) + "  "+serviceDuration.get(x) + "   "+ awm.getDistance(x, nx));
            double tnx = earliestArrivalTime.get(x) + serviceDuration.get(x) + awm.getDistance(x, nx);
            double tmp = tnx > earliestAllowedArrivalTime.get(nx) ?
                    tnx : earliestAllowedArrivalTime.get(nx);
            earliestArrivalTime.put(nx, tmp);
            //System.out.println(x+"  "+nx+"  "+awm.getDistance(x, nx)+"   "+tmp);
        }
    }
    public HashMap<Point,Double> getEarliestArrivalTime(){
        return earliestArrivalTime;
    }
    public double getEarliestArrivalTime(Point v){
        return earliestArrivalTime.get(v);
    }

    public HashMap<Point,Integer> getEarliestAllowedArrivalTime(){
        return earliestAllowedArrivalTime;
    }
    public VarRoutesVR getVarRouteVR()
    {
        return XR;
    }
    public double getServiceDuration(Point v)
    {
        return serviceDuration.get(v);
    }
    public HashMap<Point,Integer> getServiceDuration()
    {
        return serviceDuration;
    }
    public double getTravelTime(Point x,Point y)
    {
        return awm.getDistance(x, y);
    }
    public double getEarliestAllowedArrivalTime(Point v)
    {
        return earliestAllowedArrivalTime.get(v);
    }
    void updateFromPoint(Point x)
    {
        //System.out.println(name() + "::updateFromPoint(" + x.ID + "), earliestArrivalTime = " + earliestArrivalTime.get(x));
        Point pX = XR.prev(x);
        Point p = pX;
        Point nP = x;
        if(XR.isStartingPoint(x))
        {
            p = x;
            nP = XR.next(x);
        }
        //System.out.println(name() + "::updateFromPoint(" + x.ID + "), earliestArrivalTime = " + earliestArrivalTime.get(x) + ", p = " + p.ID + ", nP = " + nP.ID);
        do{
            double curTime = earliestArrivalTime.get(p) + serviceDuration.get(p);
            if(earliestAllowedArrivalTime.get(nP) > curTime + awm.getDistance(p, nP))
            {
                earliestArrivalTime.put(nP, 1.0*earliestAllowedArrivalTime.get(nP));
            }
            else{
                earliestArrivalTime.put(nP,curTime + awm.getDistance(p, nP)) ;
            }
            //System.out.println(name() + "::updateFromPoint(" + x.ID + "), set earliestArrivalTime(" + nP.ID + ") = " + earliestArrivalTime.get(nP));
            p = nP;
            nP = XR.next(p);
        }while(!XR.isTerminatingPoint(p));
		/*
		System.out.println(name() + "::updateFromPoint(" + x.ID + "), after propagate: ");
		for(int k = 1; k <= XR.getNbRoutes(); k++){
			for(Point z = XR.startPoint(k); z != XR.endPoint(k); z = XR.next(z)){
				System.out.println("earliestArrivalTime(" + z.ID + ") = " + earliestArrivalTime.get(z));
			}
			Point z = XR.endPoint(k);
			System.out.println("earliestArrivalTime(" + z.ID + ") = " + earliestArrivalTime.get(z));
		}
		*/
    }
    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        System.out.println(name() + "::propagateTwoOptMoveOneRoute NOT IMPLEMENTED YET");
        System.exit(-1);
    }


    // move of type a [Groer et al., 2010]
    // move customer x to from route of x to route of y; insert x into the position between y and next[y]
    // x and y are not the depot

    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        Point oldNexX = XR.oldNext(x);
        updateFromPoint(oldNexX);
        updateFromPoint(x);
    }

    // move of type b [Groer et al., 2010]
    // x and y are on the same route and are not the depots, y locates before x on the route
    // remove (prev[x],x) and (x,next[x]) and (prev[y], y) and (y, next(y)
    // insert (x,prev[y]) and (next[y],x) and (next[x],y) and (y, prev[x])

    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,y) and (next[x],next(y))

    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        updateFromPoint(x);
        updateFromPoint(XR.oldNext(x));
    }


    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        updateFromPoint(y);
        updateFromPoint(XR.oldNext(x));
    }


    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        updateFromPoint(x);
        updateFromPoint(XR.oldNext(y));
    }


    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        updateFromPoint(y);
        updateFromPoint(XR.oldNext(y));
    }


    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        updateFromPoint(x);
        updateFromPoint(y);
    }


    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        updateFromPoint(XR.oldNext(y));
        updateFromPoint(y);
    }


    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        updateFromPoint(x);
        updateFromPoint(XR.oldNext(x));
    }


    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        updateFromPoint(XR.oldNext(y));
        updateFromPoint(XR.oldNext(x));
    }


    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        updateFromPoint(XR.oldPrev(x1));
        updateFromPoint(y);
        updateFromPoint(x2);
    }


    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        update(XR.oldRoute(x1));
        update(XR.oldRoute(y));
    }


    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        updateFromPoint(x);
        updateFromPoint(XR.oldNext(y));
        updateFromPoint(y);
    }


    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        updateFromPoint(XR.oldNext(z));
        updateFromPoint(XR.oldNext(x));
        updateFromPoint(z);
    }


    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        updateFromPoint(x);
        updateFromPoint(XR.oldNext(x));
        updateFromPoint(XR.oldNext(y));
    }


    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        updateFromPoint(XR.oldNext(z));
        updateFromPoint(z);
        updateFromPoint(y);
    }


    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        updateFromPoint(x);
        updateFromPoint(z);
        updateFromPoint(y);
    }


    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        updateFromPoint(XR.oldNext(z));
        updateFromPoint(XR.oldNext(x));
        updateFromPoint(XR.oldNext(y));
    }


    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        updateFromPoint(x);
        updateFromPoint(z);
        updateFromPoint(XR.oldNext(x));
    }


    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        updateFromPoint(XR.oldNext(z));
        updateFromPoint(y);
        updateFromPoint(XR.oldNext(y));
    }


    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2,
                                           Point y2) {
        // TODO Auto-generated method stub
        updateFromPoint(x1);
        updateFromPoint(x2);
        updateFromPoint(y1);
        updateFromPoint(y2);
    }


    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x1));
        oldR.add(XR.oldRoute(y1));
        oldR.add(XR.oldRoute(x2));
        oldR.add(XR.oldRoute(y2));
        for (int r : oldR) {
            update(r);
        }
    }


    public void propagateThreePointsMove(Point x1, Point x2, Point x3,
                                         Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x1));
        oldR.add(XR.oldRoute(y1));
        oldR.add(XR.oldRoute(x2));
        oldR.add(XR.oldRoute(y2));
        oldR.add(XR.oldRoute(x3));
        oldR.add(XR.oldRoute(y3));
        for (int r : oldR) {
            update(r);
        }
    }


    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                        Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x1));
        oldR.add(XR.oldRoute(y1));
        oldR.add(XR.oldRoute(x2));
        oldR.add(XR.oldRoute(y2));
        oldR.add(XR.oldRoute(x3));
        oldR.add(XR.oldRoute(y3));
        oldR.add(XR.oldRoute(x4));
        oldR.add(XR.oldRoute(y4));
        for (int r : oldR) {
            update(r);
        }
    }


    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        updateFromPoint(x);
    }


    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        updateFromPoint(XR.oldNext(x));
    }

    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        updateFromPoint(x1);
    }


    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        if(x2 != XR.oldNext(x1))
            updateFromPoint(XR.oldNext(x1));
        else
            updateFromPoint(XR.oldNext(x2));
    }

    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }


    public String name() {
        // TODO Auto-generated method stub
        return "EarliestArrivalTimeVR";
    }

    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
		/*
		HashMap<Integer,Point> mp = new HashMap<Integer,Point>();
		int i;
		for(i=0;i<x.size();++i)
		{
			Point p = x.get(i);
			if(y.get(i) == CBLSVR.NULL_POINT)
				continue;
			int k = XR.route(p);
			int ind = XR.index(p);
			if(mp.containsKey(k))
			{
				if(XR.index(mp.get(k)) > ind)
					mp.put(k, p);
			}
			else{
				mp.put(k, p);
			}
		}
		Set<Integer> keyset = mp.keySet();
		for(int k : keyset)
		{
			updateFromPoint(mp.get(k));
		}
		*/
        //System.out.print(name() + "::propagateKPointsMove, XR = " + XR.toString() + ", x = ");
        //for(Point p: x) System.out.print(p.ID + ", ");
        //System.out.print(", y = "); for(Point p: y) System.out.print(p.ID + ", ");
        //System.out.println();

        Set<Integer> st = new HashSet<Integer>();
        for(Point p : x)
            st.add(XR.oldRoute(p));
        for(Point p : y){
            st.add(XR.oldRoute(p));
        }
        for(int k : st){
            if(k != Constants.NULL_POINT)
                update(k);
        }
    }

}

class AccumulatedEdgeWeightsOnPathVR implements IFunctionVR {
    private VarRoutesVR XR;
    private Point v;
    private AccumulatedWeightEdgesVR accWE;
    private VRManager mgr;

    public AccumulatedEdgeWeightsOnPathVR(AccumulatedWeightEdgesVR accWE,
                                          Point v) {
        this.accWE = accWE;
        this.v = v;
        post();
    }

    private void post() {
        mgr = accWE.getVRManager();
        this.XR = accWE.getVarRoutesVR();
        mgr.post(this);
    }

    //
    public void initPropagation() {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2,
                                           Point y2) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWE before
    }

    //
    public String name() {
        // TODO Auto-generated method stub
        return "AccumulatedEdgeWeightsOnPathVR";
    }

    private double calc(Point s, Point t) {
        if (XR.route(s) != XR.route(t)) {
            System.out.println(name() + "::calc(" + s + "," + t
                    + ") EXCEPTION, " + s + " and " + t
                    + " are not the the same route");
            mgr.exit(-1);
        }
        // accWE.getCostRight(t] > accWE.getCostRight(s])
        return (XR.isBefore(s, t)) ? accWE.getCostRight(t)
                - accWE.getCostRight(s) : accWE.getCostLeft(t)
                - accWE.getCostLeft(s);
    }

    //
    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return mgr;
    }

    //
    public double getValue() {
        // TODO Auto-generated method stub
        return accWE.getCostRight(v);
    }

    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    public double evaluateTwoOptMoveOneRoute(Point x, Point y) {
        System.out.println(name()
                + "::evaluateTwoOptMoveOneRoute NOT IMPEMENTED YET");
        System.exit(-1);
        return 0;
    }

    //
    public double evaluateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformOnePointMove(x, y)) {
            System.out.println(name() + ":: Error evaluateOnePointMove: " + x
                    + " " + y + "\n" + toString());
            System.exit(-1);
        }
        int n = 1;
        Point[] XX = { x };
        Point[] YY = { y };
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            route.add(XR.route(XX[i]));
            route.add(XR.route(YY[i]));
        }
        double eval = 0;
        for (int r : route) {
            boolean ok = false;
            ArrayList<Point> xx = new ArrayList<Point>();
            ArrayList<Point> yy = new ArrayList<Point>();
            ArrayList<Point> zz = new ArrayList<Point>();
            for (int i = 0; i < n; i++) {
                if (XR.route(YY[i]) == r) {
                    xx.add(XX[i]);
                    yy.add(YY[i]);
                    ok |= XX[i] == v;
                }
                if (XR.route(XX[i]) == r) {
                    zz.add(XX[i]);
                }
            }
            if (ok || XR.route(v) == r) {
                Point[] X = new Point[xx.size()];
                Point[] Y = new Point[yy.size()];
                Point[] Z = new Point[zz.size()];
                for (int i = 0; i < X.length; i++) {
                    X[i] = xx.get(i);
                    Y[i] = yy.get(i);
                }
                for (int i = 0; i < Z.length; i++) {
                    Z[i] = zz.get(i);
                }
                eval += evaluateMove(X, Y, Z);
            }
        }
        return eval;
    }

    //
    public double evaluateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoPointsMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoPointsMove: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.next(x) == y) {
            return evaluateTwoPointsMove(y, x, XR.prev(x), XR.prev(x));
        } else if (XR.next(y) == x) {
            return evaluateTwoPointsMove(x, y, XR.prev(y), XR.prev(y));
        } else {
            return evaluateTwoPointsMove(x, y, XR.prev(y), XR.prev(x));
        }
    }

    //
    public double evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove1: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return accWE.getCostRight(x)
                    + accWE.getCost(x, y)
                    + calc(y, XR.next(XR.getStartingPointOfRoute(XR.route(y))))
                    + accWE.getCost(
                    XR.next(XR.getStartingPointOfRoute(XR.route(y))),
                    XR.getTerminatingPointOfRoute(XR.route(x)))
                    - accWE.getCostRight(v);
        }

        if (XR.route(x) == XR.route(v) && XR.isBefore(x, v)) {
            return calc(XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))), v)
                    + accWE.getCost(XR.getStartingPointOfRoute(XR.route(y)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    - accWE.getCostRight(v);
        }
        if (XR.route(y) == XR.route(v)) {
            if (XR.isBefore(y, v)) {
                if (XR.next(x) == XR.getTerminatingPointOfRoute(XR.route(x))) {
                    return accWE
                            .getCost(XR.getStartingPointOfRoute(XR.route(y)),
                                    XR.next(y))
                            + calc(XR.next(y), v) - accWE.getCostRight(v);
                }
                return calc(
                        XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))),
                        XR.next(x))
                        + accWE.getCost(
                        XR.getStartingPointOfRoute(XR.route(y)), XR
                                .prev(XR.getTerminatingPointOfRoute(XR
                                        .route(x))))
                        + accWE.getCost(XR.next(x), XR.next(y))
                        + calc(XR.next(y), v) - accWE.getCostRight(v);
            }
            return accWE.getCostRight(x) + accWE.getCost(x, y) + calc(y, v)
                    - accWE.getCostRight(v);
        }
        return 0;
    }

    //
    public double evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove2: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }

        if (XR.route(x) == XR.route(v)) {
            if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
                return calc(XR.next(XR.getStartingPointOfRoute(XR.route(y))), y)
                        + accWE.getCost(
                        XR.getStartingPointOfRoute(XR.route(x)), XR
                                .next(XR.getStartingPointOfRoute(XR
                                        .route(y))))
                        + accWE.getCost(y, x)
                        + calc(x, XR.next(XR.getStartingPointOfRoute(XR
                        .route(x))))
                        + accWE.getCost(XR.next(XR.getStartingPointOfRoute(XR
                        .route(x))), XR.getTerminatingPointOfRoute(XR
                        .route(x))) - accWE.getCostRight(v);
            }
            if (XR.isBefore(x, v)) {
                return calc(
                        XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))), v)
                        + accWE.getCost(
                        XR.getStartingPointOfRoute(XR.route(y)), XR
                                .prev(XR.getTerminatingPointOfRoute(XR
                                        .route(x))))
                        - accWE.getCostRight(v);
            }
            return calc(XR.next(XR.getStartingPointOfRoute(XR.route(y))), y)
                    + accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.next(XR.getStartingPointOfRoute(XR.route(y))))
                    + accWE.getCost(y, x) + calc(x, v) - accWE.getCostRight(v);
        }
        if (XR.route(y) == XR.route(v)) {
            if (XR.isBefore(y, v)) {
                if (XR.next(x) == XR.getTerminatingPointOfRoute(XR.route(x))) {
                    return accWE
                            .getCost(XR.getStartingPointOfRoute(XR.route(y)),
                                    XR.next(y))
                            + calc(XR.next(y), v) - accWE.getCostRight(v);
                }
                return calc(
                        XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))),
                        XR.next(x))
                        + accWE.getCost(
                        XR.getStartingPointOfRoute(XR.route(y)), XR
                                .prev(XR.getTerminatingPointOfRoute(XR
                                        .route(x))))
                        + accWE.getCost(XR.next(x), XR.next(y))
                        + calc(XR.next(y), v) - accWE.getCostRight(v);
            }
            return accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.next(XR.getStartingPointOfRoute(XR.route(y))))
                    - accWE.getCostRight(XR.next(XR.getStartingPointOfRoute(XR
                    .route(y))));
        }
        return 0;
    }

    //
    public double evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove3: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }

        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return accWE.getCostRight(x)
                    + accWE.getCost(x, y)
                    + calc(y, XR.next(XR.getStartingPointOfRoute(XR.route(y))))
                    + accWE.getCost(
                    XR.next(XR.getStartingPointOfRoute(XR.route(y))),
                    XR.getTerminatingPointOfRoute(XR.route(x)))
                    - accWE.getCostRight(v);
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(y))) {
            if (XR.next(y) != XR.getTerminatingPointOfRoute(XR.route(y))) {
                if (XR.next(x) != XR.getTerminatingPointOfRoute(XR.route(x))) {
                    return accWE
                            .getCost(XR.getStartingPointOfRoute(XR.route(y)),
                                    XR.prev(XR.getTerminatingPointOfRoute(XR
                                            .route(y))))
                            + calc(XR.prev(XR.getTerminatingPointOfRoute(XR
                            .route(y))), XR.next(y))
                            + accWE.getCost(XR.next(y), XR.next(x))
                            + calc(XR.next(x), XR.prev(XR
                            .getTerminatingPointOfRoute(XR.route(x))))
                            + accWE.getCost(XR.prev(XR
                                    .getTerminatingPointOfRoute(XR.route(x))),
                            XR.getTerminatingPointOfRoute(XR.route(y)))
                            - accWE.getCostRight(v);
                } else {
                    return accWE
                            .getCost(XR.getStartingPointOfRoute(XR.route(y)),
                                    XR.prev(XR.getTerminatingPointOfRoute(XR
                                            .route(y))))
                            + calc(XR.prev(XR.getTerminatingPointOfRoute(XR
                            .route(y))), XR.next(y))
                            + accWE.getCost(XR.next(y),
                            XR.getTerminatingPointOfRoute(XR.route(y)))
                            - accWE.getCostRight(v);
                }
            }
            if (XR.next(x) != XR.getTerminatingPointOfRoute(XR.route(x))) {
                return accWE.getCost(XR.getStartingPointOfRoute(XR.route(y)),
                        XR.next(x))
                        + calc(XR.next(x), XR.prev(XR
                        .getTerminatingPointOfRoute(XR.route(x))))
                        + accWE.getCost(XR.prev(XR
                        .getTerminatingPointOfRoute(XR.route(x))), XR
                        .getTerminatingPointOfRoute(XR.route(y)))
                        - accWE.getCostRight(v);
            }
            return accWE.getCost(XR.getStartingPointOfRoute(XR.route(y)),
                    XR.getTerminatingPointOfRoute(XR.route(y)))
                    - accWE.getCostRight(v);
        }

        if (XR.route(y) == XR.route(v)) {
            if (XR.isBefore(y, v)) {
                return accWE.getCost(XR.getStartingPointOfRoute(XR.route(y)),
                        XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))))
                        + calc(XR.prev(XR.getTerminatingPointOfRoute(XR
                        .route(y))), v) - accWE.getCostRight(v);
            }
            return accWE.getCostRight(x) + accWE.getCost(x, y) + calc(y, v)
                    - accWE.getCostRight(v);
        }
        if (XR.route(x) == XR.route(v) && XR.isBefore(x, v)) {
            if (XR.next(y) == XR.getTerminatingPointOfRoute(XR.route(y))) {
                return accWE.getCost(XR.getStartingPointOfRoute(XR.route(y)),
                        XR.next(x))
                        + calc(XR.next(x), v)
                        - accWE.getCostRight(v);
            }
            return accWE.getCost(XR.getStartingPointOfRoute(XR.route(y)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))))
                    + calc(XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))),
                    XR.next(y))
                    + accWE.getCost(XR.next(y), XR.next(x))
                    + calc(XR.next(x), v) - accWE.getCostRight(v);
        }
        return 0;
    }

    //
    public double evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove4: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(y))) {
            if (XR.next(y) != XR.getTerminatingPointOfRoute(XR.route(y))) {
                if (XR.next(x) != XR.getTerminatingPointOfRoute(XR.route(x))) {
                    return accWE
                            .getCost(XR.getStartingPointOfRoute(XR.route(y)),
                                    XR.prev(XR.getTerminatingPointOfRoute(XR
                                            .route(y))))
                            + calc(XR.prev(XR.getTerminatingPointOfRoute(XR
                            .route(y))), XR.next(y))
                            + accWE.getCost(XR.next(y), XR.next(x))
                            + calc(XR.next(x), XR.prev(XR
                            .getTerminatingPointOfRoute(XR.route(x))))
                            + accWE.getCost(XR.prev(XR
                                    .getTerminatingPointOfRoute(XR.route(x))),
                            XR.getTerminatingPointOfRoute(XR.route(y)))
                            - accWE.getCostRight(v);
                } else {
                    return accWE
                            .getCost(XR.getStartingPointOfRoute(XR.route(y)),
                                    XR.prev(XR.getTerminatingPointOfRoute(XR
                                            .route(y))))
                            + calc(XR.prev(XR.getTerminatingPointOfRoute(XR
                            .route(y))), XR.next(y))
                            + accWE.getCost(XR.next(y),
                            XR.getTerminatingPointOfRoute(XR.route(y)))
                            - accWE.getCostRight(v);
                }
            }
            if (XR.next(x) != XR.getTerminatingPointOfRoute(XR.route(x))) {
                return accWE.getCost(XR.getStartingPointOfRoute(XR.route(y)),
                        XR.next(x))
                        + calc(XR.next(x), XR.prev(XR
                        .getTerminatingPointOfRoute(XR.route(x))))
                        + accWE.getCost(XR.prev(XR
                        .getTerminatingPointOfRoute(XR.route(x))), XR
                        .getTerminatingPointOfRoute(XR.route(y)))
                        - accWE.getCostRight(v);
            }
            return accWE.getCost(XR.getStartingPointOfRoute(XR.route(y)),
                    XR.getTerminatingPointOfRoute(XR.route(y)))
                    - accWE.getCostRight(v);
        }
        if (XR.route(y) == XR.route(v)) {
            if (XR.isBefore(y, v)) {
                return accWE.getCost(XR.getStartingPointOfRoute(XR.route(y)),
                        XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))))
                        + calc(XR.prev(XR.getTerminatingPointOfRoute(XR
                        .route(y))), v) - accWE.getCostRight(v);
            }
            return accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.next(XR.getStartingPointOfRoute(XR.route(y))))
                    - accWE.getCostRight(XR.next(XR.getStartingPointOfRoute(XR
                    .route(y))));
        }
        if (XR.route(x) == XR.route(v)) {
            if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
                return accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)),
                        XR.next(XR.getStartingPointOfRoute(XR.route(y))))
                        + calc(XR.next(XR.getStartingPointOfRoute(XR.route(y))),
                        y)
                        + accWE.getCost(y, x)
                        + calc(x, XR.next(XR.getStartingPointOfRoute(XR
                        .route(x))))
                        + accWE.getCost(XR.next(XR.getStartingPointOfRoute(XR
                        .route(x))), XR.getTerminatingPointOfRoute(XR
                        .route(x))) - accWE.getCostRight(v);
            }
            if (XR.isBefore(x, v)) {
                if (XR.next(y) == XR.getTerminatingPointOfRoute(XR.route(y))) {
                    return accWE
                            .getCost(XR.getStartingPointOfRoute(XR.route(y)),
                                    XR.next(x))
                            + calc(XR.next(x), v) - accWE.getCostRight(v);
                }
                return accWE.getCost(XR.getStartingPointOfRoute(XR.route(y)),
                        XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))))
                        + calc(XR.prev(XR.getTerminatingPointOfRoute(XR
                        .route(y))), XR.next(y))
                        + accWE.getCost(XR.next(y), XR.next(x))
                        + calc(XR.next(x), v) - accWE.getCostRight(v);
            }
            return accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.next(XR.getStartingPointOfRoute(XR.route(y))))
                    + calc(XR.next(XR.getStartingPointOfRoute(XR.route(y))), y)
                    + accWE.getCost(y, x) + calc(x, v) - accWE.getCostRight(v);
        }
        return 0;
    }

    //
    public double evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove5: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            if (XR.next(y) == XR.getTerminatingPointOfRoute(XR.route(y))) {
                return accWE.getCostRight(x)
                        + accWE.getCost(x,
                        XR.getTerminatingPointOfRoute(XR.route(x)))
                        - accWE.getCostRight(v);
            }
            return accWE.getCostRight(x)
                    + accWE.getCost(x, XR.next(y))
                    + calc(XR.next(y),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))))
                    + accWE.getCost(
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))),
                    XR.getTerminatingPointOfRoute(XR.route(x)))
                    - accWE.getCostRight(v);
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(y))) {
            if (XR.next(x) == XR.getTerminatingPointOfRoute(XR.route(x))) {
                return accWE.getCostRight(y)
                        + accWE.getCost(y,
                        XR.getTerminatingPointOfRoute(XR.route(y)))
                        - accWE.getCostRight(v);
            }
            return accWE.getCostRight(y)
                    + accWE.getCost(y, XR.next(x))
                    + calc(XR.next(x),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    + accWE.getCost(
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))),
                    XR.getTerminatingPointOfRoute(XR.route(y)))
                    - accWE.getCostRight(v);
        }
        if (XR.route(x) == XR.route(v) && XR.isBefore(x, v)) {
            return accWE.getCostRight(y) + accWE.getCost(y, XR.next(x))
                    + calc(XR.next(x), v) - accWE.getCostRight(v);
        }
        if (XR.route(y) == XR.route(v) && XR.isBefore(y, v)) {
            return accWE.getCostRight(x) + accWE.getCost(x, XR.next(y))
                    + calc(XR.next(y), v) - accWE.getCostRight(v);
        }
        return 0;
    }

    //
    public double evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove6: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            if (XR.next(y) == XR.getTerminatingPointOfRoute(XR.route(y))) {
                return accWE
                        .getCost(XR.getStartingPointOfRoute(XR.route(x)), x)
                        + calc(x, XR.next(XR.getStartingPointOfRoute(XR
                        .route(x))))
                        + accWE.getCost(XR.next(XR.getStartingPointOfRoute(XR
                        .route(x))), XR.getTerminatingPointOfRoute(XR
                        .route(x))) - accWE.getCostRight(v);
            }
            return accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))))
                    + calc(XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))),
                    XR.next(y))
                    + accWE.getCost(XR.next(y), x)
                    + calc(x, XR.next(XR.getStartingPointOfRoute(XR.route(x))))
                    + accWE.getCost(
                    XR.next(XR.getStartingPointOfRoute(XR.route(x))),
                    XR.getTerminatingPointOfRoute(XR.route(x)))
                    - accWE.getCostRight(v);
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(y))) {
            if (XR.next(x) == XR.getTerminatingPointOfRoute(XR.route(x))) {
                return accWE.getCostRight(y)
                        + accWE.getCost(y,
                        XR.getTerminatingPointOfRoute(XR.route(y)))
                        - accWE.getCostRight(v);
            }
            return accWE.getCostRight(y)
                    + accWE.getCost(y, XR.next(x))
                    + calc(XR.next(x),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    + accWE.getCost(
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))),
                    XR.getTerminatingPointOfRoute(XR.route(y)))
                    - accWE.getCostRight(v);
        }

        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(x, v)) {
                return accWE.getCostRight(y) + accWE.getCost(y, XR.next(x))
                        + calc(XR.next(x), v) - accWE.getCostRight(v);
            }
            if (XR.next(y) == XR.getTerminatingPointOfRoute(XR.route(y))) {
                return accWE
                        .getCost(XR.getStartingPointOfRoute(XR.route(x)), x)
                        + calc(x, v) - accWE.getCostRight(v);
            }
            return accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))))
                    + calc(XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))),
                    XR.next(y))
                    + accWE.getCost(XR.next(y), x)
                    + calc(x, v) - accWE.getCostRight(v);
        }
        if (XR.route(y) == XR.route(v) && XR.isBefore(y, v)) {
            return accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))))
                    + calc(XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))),
                    v) - accWE.getCostRight(v);
        }
        return 0;
    }

    //
    public double evaluateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove7: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        return evaluateTwoOptMove6(y, x);
    }

    //
    public double evaluateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove8: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            if (XR.next(y) == XR.getTerminatingPointOfRoute(XR.route(y))) {
                return accWE
                        .getCost(XR.getStartingPointOfRoute(XR.route(x)), x)
                        + calc(x, XR.next(XR.getStartingPointOfRoute(XR
                        .route(x))))
                        + accWE.getCost(XR.next(XR.getStartingPointOfRoute(XR
                        .route(x))), XR.getTerminatingPointOfRoute(XR
                        .route(x))) - accWE.getCostRight(v);
            }
            return accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))))
                    + calc(XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))),
                    XR.next(y))
                    + accWE.getCost(XR.next(y), x)
                    + calc(x, XR.next(XR.getStartingPointOfRoute(XR.route(x))))
                    + accWE.getCost(
                    XR.next(XR.getStartingPointOfRoute(XR.route(x))),
                    XR.getTerminatingPointOfRoute(XR.route(x)))
                    - accWE.getCostRight(v);
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(y))) {
            if (XR.next(x) == XR.getTerminatingPointOfRoute(XR.route(x))) {
                return accWE
                        .getCost(XR.getStartingPointOfRoute(XR.route(y)), y)
                        + calc(y, XR.next(XR.getStartingPointOfRoute(XR
                        .route(y))))
                        + accWE.getCost(XR.next(XR.getStartingPointOfRoute(XR
                        .route(y))), XR.getTerminatingPointOfRoute(XR
                        .route(y))) - accWE.getCostRight(v);
            }
            return accWE.getCost(XR.getStartingPointOfRoute(XR.route(y)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    + calc(XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))),
                    XR.next(x))
                    + accWE.getCost(XR.next(x), y)
                    + calc(y, XR.next(XR.getStartingPointOfRoute(XR.route(y))))
                    + accWE.getCost(
                    XR.next(XR.getStartingPointOfRoute(XR.route(y))),
                    XR.getTerminatingPointOfRoute(XR.route(y)))
                    - accWE.getCostRight(v);
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(x, v)) {
                return accWE.getCost(XR.getStartingPointOfRoute(XR.route(y)),
                        XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                        + calc(XR.prev(XR.getTerminatingPointOfRoute(XR
                        .route(x))), v) - accWE.getCostRight(v);
            }
            if (XR.next(y) == XR.getTerminatingPointOfRoute(XR.route(y))) {
                return accWE
                        .getCost(XR.getStartingPointOfRoute(XR.route(x)), x)
                        + calc(x, v) - accWE.getCostRight(v);
            }
            return accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))))
                    + calc(XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))),
                    XR.next(y))
                    + accWE.getCost(XR.next(y), x)
                    + calc(x, v) - accWE.getCostRight(v);
        }
        if (XR.route(y) == XR.route(v)) {
            if (XR.isBefore(y, v)) {
                return accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)),
                        XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))))
                        + calc(XR.prev(XR.getTerminatingPointOfRoute(XR
                        .route(y))), v) - accWE.getCostRight(v);
            }
            if (XR.next(x) == XR.getTerminatingPointOfRoute(XR.route(x))) {
                return accWE
                        .getCost(XR.getStartingPointOfRoute(XR.route(y)), y)
                        + calc(y, v) - accWE.getCostRight(v);
            }
            return accWE.getCost(XR.getStartingPointOfRoute(XR.route(y)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    + calc(XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))),
                    XR.next(x))
                    + accWE.getCost(XR.next(x), y)
                    + calc(y, v) - accWE.getCostRight(v);
        }
        return 0;
    }

    //
    public double evaluateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformOrOptMove(x1, x2, y)) {
            System.out.println(name() + ":: Error evaluateOrOptMove1: " + x1
                    + " " + x2 + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.route(x1) == XR.route(v)) {
            if (XR.isBefore(x2, v)) {
                return accWE.getCostRight(XR.prev(x1))
                        + accWE.getCost(XR.prev(x1), XR.next(x2))
                        + calc(XR.next(x2), v) - accWE.getCostRight(v);
            }
            if (XR.isBefore(v, x1)) {
                return 0;
            }
            return accWE.getCostRight(y) + accWE.getCost(y, x1) + calc(x1, v)
                    - accWE.getCostRight(v);
        }
        if (XR.route(y) == XR.route(v) && XR.isBefore(y, v)) {
            return accWE.getCostRight(y) + accWE.getCost(y, x1) + calc(x1, x2)
                    + accWE.getCost(x2, XR.next(y)) + calc(XR.next(y), v)
                    - accWE.getCostRight(v);
        }
        return 0;
    }

    //
    public double evaluateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformOrOptMove(x1, x2, y)) {
            System.out.println(name() + ":: Error evaluateOrOptMove2: " + x1
                    + " " + x2 + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.route(x1) == XR.route(v)) {
            if (XR.isBefore(x2, v)) {
                return accWE.getCostRight(XR.prev(x1))
                        + accWE.getCost(XR.prev(x1), XR.next(x2))
                        + calc(XR.next(x2), v) - accWE.getCostRight(v);
            }
            if (XR.isBefore(v, x1)) {
                return 0;
            }
            return accWE.getCostRight(y) + accWE.getCost(y, x2) + calc(x2, v)
                    - accWE.getCostRight(v);
        }
        if (XR.route(y) == XR.route(v) && XR.isBefore(y, v)) {
            return accWE.getCostRight(y) + accWE.getCost(y, x2) + calc(x2, x1)
                    + accWE.getCost(x1, XR.next(y)) + calc(XR.next(y), v)
                    - accWE.getCostRight(v);
        }
        return 0;
    }

    //
    public double evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove1: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            double newV = accWE.getCostRight(x);
            newV += accWE.getCost(x, z) + calc(z, XR.next(y));
            newV += accWE.getCost(XR.next(y), XR.next(x)) + calc(XR.next(x), y);
            newV += accWE.getCost(y, XR.next(z))
                    + calc(XR.next(z),
                    XR.getTerminatingPointOfRoute(XR.route(x)));
            return newV - accWE.getCostRight(v);
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {
                double newV = accWE.getCostRight(x);
                newV += accWE.getCost(x, z) + calc(z, XR.next(y));
                newV += accWE.getCost(XR.next(y), XR.next(x))
                        + calc(XR.next(x), y);
                newV += accWE.getCost(y, XR.next(z)) + calc(XR.next(z), v);
                return newV - accWE.getCostRight(v);
            }
            if (XR.isBefore(y, v)) {
                return accWE.getCostRight(x) + accWE.getCost(x, z) + calc(z, v)
                        - accWE.getCostRight(v);
            }
            if (XR.isBefore(x, v)) {
                double newV = accWE.getCostRight(x);
                newV += accWE.getCost(x, z) + calc(z, XR.next(y));
                newV += accWE.getCost(XR.next(y), XR.next(x))
                        + calc(XR.next(x), v);
                return newV - accWE.getCostRight(v);
            }
        }
        return 0;
    }

    //
    public double evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove2: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))) {
            return 0;
        }
        double d1 = 0;
        double d2 = 0;
        if (XR.next(z) != XR.getTerminatingPointOfRoute(XR.route(x))) {
            d1 = accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    - accWE.getCost(XR.getTerminatingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))));
            d2 = accWE.getCostLeft(XR.next(z)) + d1
                    + accWE.getCost(XR.next(z), y);
        } else {
            d2 = accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)), y);
        }

        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {

            double newV = d2;
            newV += calc(y, XR.next(x));
            newV += accWE.getCost(XR.next(x), XR.next(y)) + calc(XR.next(y), z);
            newV += accWE.getCost(z, x)
                    + calc(x, XR.next(XR.getStartingPointOfRoute(XR.route(x))))
                    + accWE.getCost(
                    XR.next(XR.getStartingPointOfRoute(XR.route(x))),
                    XR.getTerminatingPointOfRoute(XR.route(x)));
            return newV - accWE.getCostRight(v);
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {
                return accWE.getCostLeft(v) + d1 - accWE.getCostRight(v);
            }
            if (XR.isBefore(y, v)) {
                double newV = d2;
                newV += calc(y, XR.next(x));
                newV += accWE.getCost(XR.next(x), XR.next(y))
                        + calc(XR.next(y), v);
                return newV - accWE.getCostRight(v);
            }
            if (XR.isBefore(x, v)) {
                return d2 + calc(y, v) - accWE.getCostRight(v);
            }
            double newV = d2 + calc(y, XR.next(x));
            newV += accWE.getCost(XR.next(x), XR.next(y)) + calc(XR.next(y), z);
            newV += accWE.getCost(z, x) + calc(x, v);
            return newV - accWE.getCostRight(v);
        }
        return 0;
    }

    //
    public double evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove3: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            double newV = accWE.getCostRight(x);
            newV += accWE.getCost(x, y) + calc(y, XR.next(x));
            newV += accWE.getCost(XR.next(x), z) + calc(z, XR.next(y));
            newV += accWE.getCost(XR.next(y), XR.next(z))
                    + calc(XR.next(z),
                    XR.getTerminatingPointOfRoute(XR.route(x)));
            return newV - accWE.getCostRight(v);
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {
                double newV = accWE.getCostRight(x);
                newV += accWE.getCost(x, y) + calc(y, XR.next(x));
                newV += accWE.getCost(XR.next(x), z) + calc(z, XR.next(y));
                newV += accWE.getCost(XR.next(y), XR.next(z))
                        + calc(XR.next(z), v);
                return newV - accWE.getCostRight(v);
            }
            if (XR.isBefore(y, v)) {
                double newV = accWE.getCostRight(x);
                newV += accWE.getCost(x, y) + calc(y, XR.next(x));
                newV += accWE.getCost(XR.next(x), z) + calc(z, v);
                return newV - accWE.getCostRight(v);
            }
            if (XR.isBefore(x, v)) {
                return accWE.getCostRight(x) + accWE.getCost(x, y) + calc(y, v)
                        - accWE.getCostRight(v);
            }
        }
        return 0;
    }

    //
    public double evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove4: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))) {
            return 0;
        }
        double d1 = 0;
        double d2 = 0;
        if (XR.next(z) != XR.getTerminatingPointOfRoute(XR.route(x))) {
            d1 = accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    - accWE.getCost(XR.getTerminatingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))));
            d2 = accWE.getCostLeft(XR.next(z)) + d1
                    + accWE.getCost(XR.next(z), XR.next(y));
        } else {
            d2 = accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.next(y));
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            double newV = d2 + calc(XR.next(y), z);
            newV += accWE.getCost(z, XR.next(x)) + calc(XR.next(x), y);
            newV += accWE.getCost(y, x)
                    + calc(x, XR.next(XR.getStartingPointOfRoute(XR.route(x))))
                    + accWE.getCost(
                    XR.next(XR.getStartingPointOfRoute(XR.route(x))),
                    XR.getTerminatingPointOfRoute(XR.route(x)));
            return newV - accWE.getCostRight(v);
        }

        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {
                return accWE.getCostLeft(v) + d1 - accWE.getCostRight(v);
            }
            if (XR.isBefore(y, v)) {
                return d2 + calc(XR.next(y), v) - accWE.getCostRight(v);
            }
            if (XR.isBefore(x, v)) {
                double newV = d2 + calc(XR.next(y), z);
                newV += accWE.getCost(z, XR.next(x)) + calc(XR.next(x), v);
                return newV - accWE.getCostRight(v);
            }
            double newV = d2 + calc(XR.next(y), z);
            newV += accWE.getCost(z, XR.next(x)) + calc(XR.next(x), y);
            newV += accWE.getCost(y, x) + calc(x, v);

            return newV - accWE.getCostRight(v);
        }
        return 0;
    }

    //
    public double evaluateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove5: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            double newV = accWE.getCostRight(x);
            newV += accWE.getCost(x, XR.next(y)) + calc(XR.next(y), z);
            newV += accWE.getCost(z, XR.next(x)) + calc(XR.next(x), y);
            newV += accWE.getCost(y, XR.next(z))
                    + calc(XR.next(z),
                    XR.getTerminatingPointOfRoute(XR.route(x)));
            return newV - accWE.getCostRight(v);
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {// if (accWE.getCostRight(v] >
                // accWE.getCostRight(z]) {
                double newV = accWE.getCostRight(x);
                newV += accWE.getCost(x, XR.next(y)) + calc(XR.next(y), z);
                newV += accWE.getCost(z, XR.next(x)) + calc(XR.next(x), y);
                newV += accWE.getCost(y, XR.next(z)) + calc(XR.next(z), v);
                return newV - accWE.getCostRight(v);
            }
            if (XR.isBefore(y, v)) {// if (accWE.getCostRight(v] >
                // accWE.getCostRight(y]) {
                return accWE.getCostRight(x) + accWE.getCost(x, XR.next(y))
                        + calc(XR.next(y), v) - accWE.getCostRight(v);
            }
            if (XR.isBefore(x, v)) {// if (accWE.getCostRight(v] >
                // accWE.getCostRight(x]) {
                double newV = accWE.getCostRight(x);
                newV += accWE.getCost(x, XR.next(y)) + calc(XR.next(y), z);
                newV += accWE.getCost(z, XR.next(x)) + calc(XR.next(x), v);
                return newV - accWE.getCostRight(v);
            }
        }
        return 0;
    }

    //
    public double evaluateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove6: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))) {
            return 0;
        }
        double d1 = 0;
        double d2 = 0;
        if (XR.next(z) != XR.getTerminatingPointOfRoute(XR.route(x))) {
            d1 = accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    - accWE.getCost(XR.getTerminatingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))));
            d2 = accWE.getCostLeft(XR.next(z)) + d1
                    + accWE.getCost(XR.next(z), y);
        } else {
            d2 = accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)), y);
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            double newV = d2 + calc(y, XR.next(x));
            newV += accWE.getCost(XR.next(x), z) + calc(z, XR.next(y));
            newV += accWE.getCost(XR.next(y), x)
                    + calc(x, XR.next(XR.getStartingPointOfRoute(XR.route(x))))
                    + accWE.getCost(
                    XR.next(XR.getStartingPointOfRoute(XR.route(x))),
                    XR.getTerminatingPointOfRoute(XR.route(x)));
            return newV - accWE.getCostRight(v);
        }

        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {
                return accWE.getCostLeft(v) + d1 - accWE.getCostRight(v);
            }
            if (XR.isBefore(y, v)) {
                double newV = d2 + calc(y, XR.next(x));
                newV += accWE.getCost(XR.next(x), z) + calc(z, v);
                return newV - accWE.getCostRight(v);
            }
            if (XR.isBefore(x, v)) {
                return d2 + calc(y, v) - accWE.getCostRight(v);
            }
            double newV = d2 + calc(y, XR.next(x));
            newV += accWE.getCost(XR.next(x), z) + calc(z, XR.next(y));
            newV += accWE.getCost(XR.next(y), x) + calc(x, v);
            return newV - accWE.getCostRight(v);
        }
        return 0;
    }

    //
    public double evaluateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove7: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            double newV = accWE.getCostRight(x);
            newV += accWE.getCost(x, XR.next(y)) + calc(XR.next(y), z);
            newV += accWE.getCost(z, y) + calc(y, XR.next(x));
            newV += accWE.getCost(XR.next(x), XR.next(z))
                    + calc(XR.next(z),
                    XR.getTerminatingPointOfRoute(XR.route(x)));
            return newV - accWE.getCostRight(v);
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {// if (accWE.getCostRight(v] >
                // accWE.getCostRight(z]) {
                double newV = accWE.getCostRight(x);
                newV += accWE.getCost(x, XR.next(y)) + calc(XR.next(y), z);
                newV += accWE.getCost(z, y) + calc(y, XR.next(x));
                newV += accWE.getCost(XR.next(x), XR.next(z))
                        + calc(XR.next(z), v);
                return newV - accWE.getCostRight(v);
            }
            if (XR.isBefore(y, v)) {// if (accWE.getCostRight(v] >
                // accWE.getCostRight(y]) {
                return accWE.getCostRight(x) + accWE.getCost(x, XR.next(y))
                        + calc(XR.next(y), v) - accWE.getCostRight(v);
            }
            if (XR.isBefore(x, v)) {// if (accWE.getCostRight(v] >
                // accWE.getCostRight(x]) {
                double newV = accWE.getCostRight(x);
                newV += accWE.getCost(x, XR.next(y)) + calc(XR.next(y), z);
                newV += accWE.getCost(z, y) + calc(y, v);
                return newV - accWE.getCostRight(v);
            }
        }
        return 0;
    }

    //
    public double evaluateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove8: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))) {
            return 0;
        }
        double d1 = 0;
        double d2 = 0;
        if (XR.next(z) != XR.getTerminatingPointOfRoute(XR.route(x))) {
            d1 = accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    - accWE.getCost(XR.getTerminatingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))));
            d2 = accWE.getCostLeft(XR.next(z)) + d1
                    + accWE.getCost(XR.next(z), XR.next(x));
        } else {
            d2 = accWE.getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.next(x));
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            double newV = d2 + calc(XR.next(x), y);
            newV += accWE.getCost(y, z) + calc(z, XR.next(y));
            newV += accWE.getCost(XR.next(y), x)
                    + calc(x, XR.next(XR.getStartingPointOfRoute(XR.route(x))))
                    + accWE.getCost(
                    XR.next(XR.getStartingPointOfRoute(XR.route(x))),
                    XR.getTerminatingPointOfRoute(XR.route(x)));
            return newV - accWE.getCostRight(v);
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {
                return accWE.getCostLeft(v) + d1 - accWE.getCostRight(v);
            }
            if (XR.isBefore(y, v)) {
                double newV = d2 + calc(XR.next(x), y);
                newV += accWE.getCost(y, z) + calc(z, v);
                return newV - accWE.getCostRight(v);
            }
            if (XR.isBefore(x, v)) {
                return d2 + calc(XR.next(x), v) - accWE.getCostRight(v);
            }
            double newV = d2 + calc(XR.next(x), y);
            newV += accWE.getCost(y, z) + calc(z, XR.next(y));
            newV += accWE.getCost(XR.next(y), x) + calc(x, v);
            return newV - accWE.getCostRight(v);
        }
        return 0;
    }

    //
    public double evaluateCrossExchangeMove(Point x1, Point y1, Point x2,
                                            Point y2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformCrossExchangeMove(x1, y1, x2, y2)) {
            System.out.println(name() + ":: Error evaluateCrossExchangeMove: "
                    + x1 + " " + y1 + " " + x2 + " " + y2 + "\n"
                    + XR.toString());
            System.exit(-1);
        }
        if (XR.route(x1) == XR.route(v)) {
            if (XR.isBefore(y1, v)) {
                double newV = accWE.getCostRight(x1)
                        + accWE.getCost(x1, XR.next(x2));
                newV += calc(XR.next(x2), y2) + accWE.getCost(y2, XR.next(y1))
                        + calc(XR.next(y1), v);
                return newV - accWE.getCostRight(v);
            }
            if (XR.isBefore(x1, v)) {
                return accWE.getCostRight(x2) + accWE.getCost(x2, XR.next(x1))
                        + calc(XR.next(x1), v) - accWE.getCostRight(v);
            }
        }
        if (XR.route(x2) == XR.route(v)) {
            if (XR.isBefore(y2, v)) {
                double newV = accWE.getCostRight(x2)
                        + accWE.getCost(x2, XR.next(x1));
                newV += calc(XR.next(x1), y1) + accWE.getCost(y1, XR.next(y2))
                        + calc(XR.next(y2), v);
                return newV - accWE.getCostRight(v);
            }
            if (XR.isBefore(x2, v)) {
                return accWE.getCostRight(x1) + accWE.getCost(x1, XR.next(x2))
                        + calc(XR.next(x2), v) - accWE.getCostRight(v);
            }
        }
        return 0;
    }

    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        System.out.println(name() + "::propagateTwoOptMoveOneRoute NOT IMPLEMENTED YET");
        System.exit(-1);
    }

    //
    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub

    }

    //
    public void propagateThreePointsMove(Point x1, Point x2, Point x3,
                                         Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub

    }

    //
    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                        Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub

    }

    //
    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub

    }

    //
    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub

    }

    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        //System.out.println("AccumulatedEdgeWeightsOnPathVR::propagateAddTwoPoints HAS NOT BEEN IMPLEMENTED YET");
        //System.exit(-1);
    }

    //
    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        //System.out.println("AccumulatedEdgeWeightsOnPathVR::propagateRemoveTwoPoints HAS NOT BEEN IMPLEMENTED YET");
        //System.exit(-1);
    }

    private void swap(Point[] a, int i, int j) {
        Point tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private double evaluateMove(Point[] x, Point[] y, Point[] z) {
        boolean ok = false;
        for (int i = 0; i < z.length; i++) {
            if (z[i] == v) {
                for (int j = 0; j < x.length; j++) {
                    if (x[j] == v) {
                        ok = true;
                        break;
                    }
                }
                if (!ok) {
                    return 0;
                }
            }
        }

        for (int i = 0; i < x.length - 1; i++) {
            for (int j = x.length - 1; j > i; j--) {
                if (XR.isBefore(y[j], y[j - 1])) {
                    swap(x, j, j - 1);
                    swap(y, j, j - 1);
                }
            }
        }
        for (int i = 0; i < z.length - 1; i++) {
            for (int j = i + 1; j < z.length; j++) {
                if (XR.isBefore(z[j], z[i])) {
                    swap(z, i, j);
                }
            }
        }
        int i = 0;
        int j = 0;
        double d = 0;
        while (i < x.length || j < z.length) {
            if (j == z.length || (i < x.length && XR.isBefore(y[i], z[j]))) {
                if ((!ok) && XR.route(v) == XR.route(y[i])
                        && (!XR.isBefore(y[i], v))) {
                    return d;
                }
                d += accWE.getCost(y[i], x[i]);
                if (v == x[i]) {
                    return d + accWE.getCostRight(y[i]) - accWE.getCostRight(v);
                }
                while (i < x.length - 1 && y[i] == y[i + 1]) {
                    d += accWE.getCost(x[i], x[i + 1]);
                    i++;
                    if (v == x[i]) {
                        return d + accWE.getCostRight(y[i])
                                - accWE.getCostRight(v);
                    }
                }
                d += accWE.getCost(x[i], XR.next(y[i]))
                        - accWE.getCost(y[i], XR.next(y[i]));
                i++;
            } else {
                if ((!ok) && XR.isBefore(v, z[j])) {
                    return d;
                }
                Point prevZ = XR.prev(z[j]);
                if (i > 0 && XR.next(y[i - 1]) == z[j]) {
                    prevZ = x[i - 1];
                }
                d -= accWE.getCost(prevZ, z[j]);
                while (j < z.length - 1 && XR.next(z[j]) == z[j + 1]) {
                    d -= accWE.getCost(z[j], z[j + 1]);
                    j++;
                }
                Point nextZ = XR.next(z[j]);
                d += accWE.getCost(prevZ, nextZ) - accWE.getCost(z[j], nextZ);
                j++;
            }
        }

        return d;
    }

    //
    public double evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoPointsMove(x1, x2, y1, y2)) {
            System.out.println(name() + ":: Error evaluateTwoPointsMove: " + x1
                    + " " + y1 + " " + x2 + " " + y2 + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 2;
        Point[] x = { x1, x2 };
        Point[] y = { y1, y2 };
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            route.add(XR.route(x[i]));
            route.add(XR.route(y[i]));
        }
        double eval = 0;
        for (int r : route) {
            boolean ok = false;
            ArrayList<Point> xx = new ArrayList<Point>();
            ArrayList<Point> yy = new ArrayList<Point>();
            ArrayList<Point> zz = new ArrayList<Point>();
            for (int i = 0; i < n; i++) {
                if (XR.route(y[i]) == r) {
                    xx.add(x[i]);
                    yy.add(y[i]);
                    ok |= x[i] == v;
                }
                if (XR.route(x[i]) == r) {
                    zz.add(x[i]);
                }
            }
            if (ok || XR.route(v) == r) {
                Point[] X = new Point[xx.size()];
                Point[] Y = new Point[yy.size()];
                Point[] Z = new Point[zz.size()];
                for (int i = 0; i < X.length; i++) {
                    X[i] = xx.get(i);
                    Y[i] = yy.get(i);
                }
                for (int i = 0; i < Z.length; i++) {
                    Z[i] = zz.get(i);
                }
                eval += evaluateMove(X, Y, Z);
            }
        }
        return eval;
    }

    //
    public double evaluateThreePointsMove(Point x1, Point x2, Point x3,
                                          Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreePointsMove(x1, x2, x3, y1, y2, y3)) {
            System.out.println(name() + ":: Error evaluateThreePointsMove: "
                    + x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3
                    + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 3;
        Point[] x = { x1, x2, x3 };
        Point[] y = { y1, y2, y3 };
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            route.add(XR.route(x[i]));
            route.add(XR.route(y[i]));
        }
        double eval = 0;
        for (int r : route) {
            boolean ok = false;
            ArrayList<Point> xx = new ArrayList<Point>();
            ArrayList<Point> yy = new ArrayList<Point>();
            ArrayList<Point> zz = new ArrayList<Point>();
            for (int i = 0; i < n; i++) {
                if (XR.route(y[i]) == r) {
                    xx.add(x[i]);
                    yy.add(y[i]);
                    ok |= x[i] == v;
                }
                if (XR.route(x[i]) == r) {
                    zz.add(x[i]);
                }
            }
            if (ok || XR.route(v) == r) {
                Point[] X = new Point[xx.size()];
                Point[] Y = new Point[yy.size()];
                Point[] Z = new Point[zz.size()];
                for (int i = 0; i < X.length; i++) {
                    X[i] = xx.get(i);
                    Y[i] = yy.get(i);
                }
                for (int i = 0; i < Z.length; i++) {
                    Z[i] = zz.get(i);
                }
                // System.out.println("--------- " + r);
                eval += evaluateMove(X, Y, Z);
            }
        }
        return eval;
    }

    //
    public double evaluateFourPointsMove(Point x1, Point x2, Point x3,
                                         Point x4, Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4)) {
            System.out.println(name() + ":: Error evaluateFourPointsMove: "
                    + x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3
                    + " " + x4 + " " + y4 + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 4;
        Point[] x = { x1, x2, x3, x4 };
        Point[] y = { y1, y2, y3, y4 };
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            route.add(XR.route(x[i]));
            route.add(XR.route(y[i]));
        }
        double eval = 0;
        for (int r : route) {
            boolean ok = false;
            ArrayList<Point> xx = new ArrayList<Point>();
            ArrayList<Point> yy = new ArrayList<Point>();
            ArrayList<Point> zz = new ArrayList<Point>();
            for (int i = 0; i < n; i++) {
                if (XR.route(y[i]) == r) {
                    xx.add(x[i]);
                    yy.add(y[i]);
                    ok |= x[i] == v;
                }
                if (XR.route(x[i]) == r) {
                    zz.add(x[i]);
                }
            }
            if (ok || XR.route(v) == r) {
                Point[] X = new Point[xx.size()];
                Point[] Y = new Point[yy.size()];
                Point[] Z = new Point[zz.size()];
                for (int i = 0; i < X.length; i++) {
                    X[i] = xx.get(i);
                    Y[i] = yy.get(i);
                }
                for (int i = 0; i < Z.length; i++) {
                    Z[i] = zz.get(i);
                }
                // System.out.println("--------- " + r);
                eval += evaluateMove(X, Y, Z);
            }
        }
        return eval;
    }

    public String toString() {
        String s = "";
        for (int k = 1; k <= XR.getNbRoutes(); k++) {
            s += "route[" + k + "] : ";
            for (Point x = XR.getStartingPointOfRoute(k); x != XR
                    .getTerminatingPointOfRoute(k); x = XR.next(x)) {
                s += x.getID() + " " + accWE.getCostRight(x) + " "
                        + accWE.getCostLeft(x) + " | ";
            }
            s += "\n";
        }
        return s;
    }

    //
    public double evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformAddOnePoint(x, y)) {
            System.out.println(name() + ":: Error evaluate AddOnePoint: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (x == v) {
            return accWE.getCostRight(y) + accWE.getCost(y, x);
        }
        if (XR.isBefore(y, v)) {
            return accWE.getCost(y, x) + accWE.getCost(x, XR.next(y))
                    - accWE.getCost(y, XR.next(y));
        }
        return 0;
    }

    //
    public double evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformRemoveOnePoint(x)) {
            System.out.println(name() + ":: Error evaluate RemoveOnePoint: "
                    + x + "\n" + XR.toString());
            System.exit(-1);
        }
        if (x == v) {
            return -accWE.getCostRight(x);
        }
        if (XR.isBefore(x, v)) {
            return accWE.getCost(XR.prev(x), XR.next(x))
                    - accWE.getCost(XR.prev(x), x)
                    - accWE.getCost(x, XR.next(x));
        }
        return 0;
    }

    public double evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2){
        // TODO Auto-generated method stub
        if (!XR.checkPerformAddTwoPoints(x1, y1, x2, y2)) {
            System.out.println(name() + ":: Error evaluate AddTwoPoint: " + x1
                    + " " + y1 + " " + x2
                    + " " + y2 + "\n" + XR.toString());
            System.exit(-1);
        }
        if (x1 == v)
            return accWE.getCostRight(y1) + accWE.getCost(y1, x1);

        if (x2 == v) {
            if(y1 != y2){
                Point ny1 = XR.next(y1);
                return accWE.getCostRight(y2) - accWE.getCost(y1, ny1)
                        + accWE.getCost(y1, x1) + accWE.getCost(x1, ny1) + accWE.getCost(y2, x2);
            }
            else
                return accWE.getCostRight(y1) + accWE.getCost(y1, x1) + accWE.getCost(x1, x2);
        }

        if (XR.isBefore(y1, v) && !XR.isBefore(y2, v))
            return accWE.getCost(y1, x1) + accWE.getCost(x1, XR.next(y1))
                    - accWE.getCost(y1, XR.next(y1));

        if(XR.isBefore(y2, v)){
            if(y1 != y2)
                return accWE.getCost(y1, x1) + accWE.getCost(x1, XR.next(y1)) - accWE.getCost(y1, XR.next(y1))
                        + accWE.getCost(y2, x2) + accWE.getCost(x2, XR.next(y2)) - accWE.getCost(y2, XR.next(y2));
            else
                return accWE.getCost(y1, x1) + accWE.getCost(x1, x2)
                        + accWE.getCost(x2, XR.next(y1)) - accWE.getCost(y1,  XR.next(y1));
        }

        return 0;
    }

    public double evaluateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformRemoveTwoPoints(x1, x2)) {
            System.out.println(name() + ":: Error evaluate RemoveTwoPoints: "
                    + x1 + " " + x2 + "\n" + XR.toString());
            System.exit(-1);
        }
        if (x1 == v)
            return -accWE.getCostRight(x1);

        if(x2 == v)
            return -accWE.getCostRight(x2);

        if (XR.isBefore(x1, v) && !XR.isBefore(x2, v))
            return accWE.getCost(XR.prev(x1), XR.next(x1))
                    - accWE.getCost(XR.prev(x1), x1)
                    - accWE.getCost(x1, XR.next(x1));

        if(XR.isBefore(x2, v))
            if(x2 == XR.next(x1)){
                return accWE.getCost(XR.prev(x1), XR.next(x2)) - accWE.getCost(XR.prev(x1), x1)
                        - accWE.getCost(x1, x2) - accWE.getCost(x2, XR.next(x2));
            }
            else{
                return accWE.getCost(XR.prev(x1), XR.next(x1))
                        - accWE.getCost(XR.prev(x1), x1)
                        - accWE.getCost(x1, XR.next(x1))
                        + accWE.getCost(XR.prev(x2), XR.next(x2))
                        - accWE.getCost(XR.prev(x2), x2)
                        - accWE.getCost(x2, XR.next(x2));
            }
        return 0;
    }

    //
    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }

    //
    public double evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformAddRemovePoints(x, y, z)) {
            System.out.println(name() + ":: Error evaluate AddRemovePoints: "
                    + x + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.route(x) == XR.route(z)) {
            if (v != y && XR.route(x) != XR.route(v)) {
                return 0;
            }
            if (x == v) {
                return -accWE.getCostRight(x);
            }

            Point[] X = { y };
            Point[] Y = { z };
            Point[] Z = { x };
            return evaluateMove(X, Y, Z);
        } else {
            if (XR.route(x) == XR.route(v)) {
                if (v == x) {
                    return -accWE.getCostRight(x);
                }
                if (XR.isBefore(x, v)) {
                    return accWE.getCost(XR.prev(x), XR.next(x))
                            - accWE.getCost(XR.prev(x), x)
                            - accWE.getCost(x, XR.next(x));
                }
            }
            if (v == y) {

                return accWE.getCostRight(z) + accWE.getCost(z, y);
            }
            if (XR.isBefore(z, v)) {
                return accWE.getCost(z, y) + accWE.getCost(y, XR.next(z))
                        - accWE.getCost(z, XR.next(z));
            }

        }

        return 0;
    }

    //
    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub

    }

    //
    public double evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformKPointsMove(x, y)) {
            System.out.println(name() + ":: Error evaluateKPointsMove:\n"
                    + XR.toString());
            System.exit(-1);
        }
        int n = x.size();
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            if (XR.route(x.get(i)) != Constants.NULL_POINT) {
                route.add(XR.route(x.get(i)));
            }
            if (y.get(i) != CBLSVR.NULL_POINT) {
                route.add(XR.route(y.get(i)));
            }
        }
        double eval = 0;
        for (int r : route) {
            boolean ok = false;
            ArrayList<Point> xx = new ArrayList<Point>();
            ArrayList<Point> yy = new ArrayList<Point>();
            ArrayList<Point> zz = new ArrayList<Point>();
            for (int i = 0; i < n; i++) {
                if (y.get(i) != CBLSVR.NULL_POINT && XR.route(y.get(i)) == r) {
                    xx.add(x.get(i));
                    yy.add(y.get(i));
                    ok |= x.get(i) == v;
                } else if (y.get(i) == CBLSVR.NULL_POINT) {
                    if (x.get(i) == v) {
                        return -accWE.getCostRight(v);
                    }
                }
                if (XR.route(x.get(i)) == r) {
                    zz.add(x.get(i));
                }
            }
            if (ok || XR.route(v) == r) {
                Point[] X = new Point[xx.size()];
                Point[] Y = new Point[yy.size()];
                Point[] Z = new Point[zz.size()];
                for (int i = 0; i < X.length; i++) {
                    X[i] = xx.get(i);
                    Y[i] = yy.get(i);
                }
                for (int i = 0; i < Z.length; i++) {
                    Z[i] = zz.get(i);
                }
                eval += evaluateMove(X, Y, Z);
            }
        }
        return eval;
    }

    public static void main(String[] avgr) {
        int N = 60;
        int n = 50;
        int K = 5;
        Point[] p = new Point[N];
        SecureRandom rand = new SecureRandom();
        for (int i = 0; i < N; i++) {
            p[i] = new Point(i, rand.nextInt(50), rand.nextInt(50));
        }
        VRManager mgr = new VRManager();
        VarRoutesVR XR = new VarRoutesVR(mgr);
        for (int i = 0; i < n; i++) {
            XR.addClientPoint(p[i]);
        }
        for (int i = n; i < N - K; i++) {
            XR.addRoute(p[i], p[i + K]);
        }
        XR.initSequential();
        ArcWeightsManager awm = new ArcWeightsManager(XR.getAllPoints());
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                awm.setWeight(p[i], p[j], p[i].distance(p[j]));
            }
        }
        AccumulatedWeightEdgesVR accWE = new AccumulatedWeightEdgesVR(XR, awm);
        IFunctionVR[] f = new IFunctionVR[N];
        for (int i = 0; i < f.length; i++) {
            f[i] = new AccumulatedEdgeWeightsOnPathVR(accWE, p[i]);
        }
        mgr.close();
        mgr.performRemoveOnePoint(p[0]);

        int iter = 0;
        double[] oldV = new double[N];
        double[] newV = new double[N];
        double[] delta = new double[N];
        while (iter < 10000) {
            System.out.println(iter++ + "\n" + XR + "\n" + accWE);
            for (int i = 0; i < N; i++) {
                oldV[i] = f[i].getValue();
            }
            // int x1 = rand.nextInt(N);
            // int x2 = rand.nextInt(N);
            // int y1 = rand.nextInt(N);
            // int y2 = rand.nextInt(N);
            // int x3 = rand.nextInt(N);
            // int y3 = rand.nextInt(N);
            // int x4 = rand.nextInt(N);
            // int y4 = rand.nextInt(N);
            // while (!XR.checkPerformAddRemovePoints(p[x1], p[x2], p[x3])) {
            // x1 = rand.nextInt(N);
            // y1 = rand.nextInt(N);
            // x2 = rand.nextInt(N);
            // y2 = rand.nextInt(N);
            // x3 = rand.nextInt(N);
            // y3 = rand.nextInt(N);
            // x4 = rand.nextInt(N);
            // y4 = rand.nextInt(N);
            // }

            // System.out.println(x1 + " " + p[x1] + " " + x2 + " " + p[x2] +
            // " " + x3 + " "+ p[x3] + " " );
            ArrayList<Point> x = new ArrayList<Point>();
            ArrayList<Point> y = new ArrayList<Point>();
            int count = rand.nextInt(5) + 5;
            for (int i = 0; i < count; i++) {
                x.add(p[rand.nextInt(N)]);
                if (rand.nextInt(5) == 0) {
                    y.add(CBLSVR.NULL_POINT);
                } else {
                    y.add(p[rand.nextInt(N)]);
                }
            }
            while (!XR.checkPerformKPointsMove(x, y)) {
                x.clear();
                y.clear();
                count = rand.nextInt(5) + 5;
                for (int i = 0; i < count; i++) {
                    x.add(p[rand.nextInt(N)]);
                    if (rand.nextInt(5) == 0) {
                        y.add(CBLSVR.NULL_POINT);
                    } else {
                        y.add(p[rand.nextInt(N)]);
                    }
                }
            }
            System.out.println(count);
            for (int i = 0; i < count; i++) {
                System.out.println(x.get(i) + " " + y.get(i));
            }
            for (int i = 0; i < N; i++) {
                delta[i] = f[i].evaluateKPointsMove(x, y);
            }
            mgr.performKPointsMove(x, y);
            for (int i = 0; i < N; i++) {
                newV[i] = f[i].getValue();
            }
            System.out.println(XR + "\n" + accWE);
            for (int i = 0; i < N; i++) {
                if (Math.abs(oldV[i] + delta[i] - newV[i]) > 1e-6) {
                    System.out.println("WTFFFFFFFFFFFFFFFFFFF " + i + " "
                            + oldV[i] + " " + delta[i] + " " + newV[i]);
                    System.exit(-1);
                }
            }
        }
        System.out.println("Okkkkkkkkkkkkkk");
    }

}
class AccumulatedNodeWeightsOnPathVR implements IFunctionVR {

    private Point v;
    private VarRoutesVR XR;
    private VRManager mgr;
    private AccumulatedWeightNodesVR accWN;

    public AccumulatedNodeWeightsOnPathVR(AccumulatedWeightNodesVR accWN, Point v){
        this.accWN = accWN;
        this.v = v;
        //System.out.println(name() + "::constructor, v = " + v.ID);
        post();
    }

    private void post() {
        mgr = accWN.getVRManager();
        this.XR = accWN.getVarRoutesVR();
        mgr.post(this);
    }

    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return mgr;
    }

    public void initPropagation() {
        // TODO Auto-generated method stub

    }

    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub

    }

    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub

    }

    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2,
                                           Point y2) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateThreePointsMove(Point x1, Point x2, Point x3,
                                         Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                        Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub

    }

    ////
    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub

    }

    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        System.out.println("AccumulatedNodeWeightsOnPathVR::propagateAddTwoPoints HAS NOT BEEN IMPLEMENTED YET");
        System.exit(-1);
    }

    ////
    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        System.out.println("AccumulatedNodeWeightsOnPathVR::propagateRemoveTwoPoints HAS NOT BEEN IMPLEMENTED YET");
        System.exit(-1);
    }

    ////
    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }

    ////
    public String name() {
        // TODO Auto-generated method stub
        return "AccumulatedEdgeWeightsOnPathVR";
    }

    ////
    public double getValue() {
        // TODO Auto-generated method stub
        //System.out.println(name() + "::getValue, v = " + v.ID);
        return accWN.getSumWeights(v);
    }

    private double calc(Point s, Point t) {
        if (XR.route(s) != XR.route(t)){
            System.out.println(name() + "::calc(" + s + "," + t + ") EXCEPTION, " + s + " and " + t + " are not the the same route");
            mgr.exit(-1);
        }
        return XR.isBefore(s, t) ? accWN.getSumWeights(t) - accWN.getSumWeights(s) + accWN.getWeights(s)
                : accWN.getSumWeights(s) - accWN.getSumWeights(t) + accWN.getWeights(t);
    }

    private void swap(Point[] a, int i, int j) {
        Point tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private double evaluateMove(Point[] x, Point[] y, Point[] z) {
        boolean ok = false;
        for (int i = 0; i < z.length; i++) {
            if (z[i] == v) {
                for (int j = 0; j < x.length; j++) {
                    if (x[j] == v) {
                        ok = true;
                        break;
                    }
                }
                if (!ok) {
                    return 0;
                }
            }
        }

        for (int i = 0; i < x.length - 1; i++) {
            for (int j = x.length - 1; j > i; j--) {
                if (XR.isBefore(y[j], y[j - 1])) {
                    swap(x, j, j - 1);
                    swap(y, j, j - 1);
                }
            }
        }
        for (int i = 0; i < z.length - 1; i++) {
            for (int j = i + 1; j < z.length; j++) {
                if (XR.isBefore(z[j], z[i])) {
                    swap(z, i, j);
                }
            }
        }
        int i = 0;
        int j = 0;
        double d = 0;
        while (i < x.length || j < z.length) {
            if (j == z.length || (i < x.length && XR.isBefore(y[i], z[j]))) {
                if ((!ok) && XR.route(v) == XR.route(y[i]) && (!XR.isBefore(y[i], v))) {
                    return d;
                }
                d += accWN.getWeights(x[i]);
                if (v == x[i]) {
                    return d + accWN.getSumWeights(y[i]) - accWN.getSumWeights(v);
                }
                while (i < x.length - 1 && y[i] == y[i + 1]) {
                    i++;
                    d += accWN.getWeights(x[i]);
                    if (v == x[i]) {
                        return d + accWN.getSumWeights(y[i]) - accWN.getSumWeights(v);
                    }
                }
                i++;
            } else {
                if ((!ok) && XR.isBefore(v, z[j])) {
                    return d;
                }
                d -= accWN.getWeights(z[j]);
                while (j < z.length - 1 && XR.next(z[j]) == z[j + 1]) {
                    d -= accWN.getWeights(z[j + 1]);
                    j++;
                }
                j++;
            }
        }

        return d;
    }
    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    public double evaluateTwoOptMoveOneRoute(Point x, Point y) {
        System.out.println(name() + "::evaluateTwoOptMoveOneRoute NOT IMPEMENTED YET");
        System.exit(-1);
        return 0;
    }


    ////
    public double evaluateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformOnePointMove(x, y)) {
            System.out.println(name() + ":: Error evaluateOnePointMove: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 1;
        Point[] X = {x};
        Point[] Y = {y};
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            route.add(XR.route(X[i]));
            route.add(XR.route(Y[i]));
        }
        double eval = 0;
        for (int r : route) {
            boolean ok = false;
            ArrayList<Point> xx = new ArrayList<Point>();
            ArrayList<Point> yy = new ArrayList<Point>();
            ArrayList<Point> zz = new ArrayList<Point>();
            for (int i = 0; i < n; i++) {
                if (XR.route(Y[i]) == r) {
                    xx.add(X[i]);
                    yy.add(Y[i]);
                    ok |= X[i] == v;
                }
                if (XR.route(X[i]) == r) {
                    zz.add(X[i]);
                }
            }
            if (ok || XR.route(v) == r) {
                Point[] XX = new Point[xx.size()];
                Point[] YY = new Point[yy.size()];
                Point[] ZZ = new Point[zz.size()];
                for (int i = 0; i < XX.length; i++) {
                    XX[i] = xx.get(i);
                    YY[i] = yy.get(i);
                }
                for (int i = 0; i < ZZ.length; i++) {
                    ZZ[i] = zz.get(i);
                }
                eval += evaluateMove(XX, YY, ZZ);
            }
        }
        return eval;
    }

    ////
    public double evaluateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoPointsMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoPointsMove: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.next(x) == y) {
            return evaluateTwoPointsMove(y, x, XR.prev(x), XR.prev(x));
        } else if (XR.next(y) == x) {
            return evaluateTwoPointsMove(x, y, XR.prev(y), XR.prev(y));
        } else {
            return evaluateTwoPointsMove(x, y, XR.prev(y), XR.prev(x));
        }
    }

    ////
    public double evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove1: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x)) || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
                return accWN.getSumWeights(x) + accWN.getSumWeights(y)
                        - accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                        + accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                        - accWN.getSumWeights(v);
            }
            if (XR.isBefore(x, v)) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(x)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                        - accWN.getSumWeights(v);
            }
            return 0;
        }
        if (XR.route(y) == XR.route(v)) {
            if (XR.isBefore(y, v)) {
                return calc(XR.next(x), XR.getTerminatingPointOfRoute(XR.route(x)))
                        + calc(XR.next(y), v)
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                        - accWN.getSumWeights(v);
            }
            return accWN.getSumWeights(x) + calc(v, y) - accWN.getSumWeights(v);
        }
        return 0;
    }

    ////
    public double evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove2: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x)) || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
                return accWN.getSumWeights(x) + accWN.getSumWeights(y)
                        - accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                        + accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                        - accWN.getSumWeights(v);
            }
            if (XR.isBefore(x, v)) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(x)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                        - accWN.getSumWeights(v);
            }
            return calc(x, v) + accWN.getSumWeights(y)
                    - accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                    + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                    - accWN.getSumWeights(v);
        }
        if (XR.route(y) == XR.route(v)) {
            if (XR.isBefore(y, v)) {
                return calc(XR.next(x), XR.getTerminatingPointOfRoute(XR.route(x)))
                        + calc(XR.next(y), v)
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                        - accWN.getSumWeights(v);
            }
            return accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                    - accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)));
        }
        return 0;
    }

    ////
    public double evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove3: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x)) || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
                return accWN.getSumWeights(x) + accWN.getSumWeights(y)
                        - accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                        + accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                        - accWN.getSumWeights(v);
            }
            if (XR.isBefore(x, v)) {
                return calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(y)))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                        + calc(XR.next(x), v)
                        - accWN.getSumWeights(v);
            }
            return 0;
        }
        if (XR.route(y) == XR.route(v)) {
            if (v == XR.getTerminatingPointOfRoute(XR.route(y))) {
                return calc(XR.next(x), XR.getTerminatingPointOfRoute(XR.route(x)))
                        + calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                        - accWN.getSumWeights(v);
            }
            if (XR.isBefore(y, v)) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(y)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(y)))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                        - accWN.getSumWeights(v);
            }
            return accWN.getSumWeights(x) + calc(v, y) - accWN.getSumWeights(v);
        }
        return 0;
    }

    ////
    public double evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove4: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x)) || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
                return accWN.getSumWeights(x) + accWN.getSumWeights(y)
                        - accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                        + accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                        - accWN.getSumWeights(v);
            }
            if (XR.isBefore(x, v)) {
                return calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(y)))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                        + calc(XR.next(x), v)
                        - accWN.getSumWeights(v);
            }
            return calc(x, v) + accWN.getSumWeights(y)
                    - accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                    + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                    - accWN.getSumWeights(v);
        }
        if (XR.route(y) == XR.route(v)) {
            if (v == XR.getTerminatingPointOfRoute(XR.route(y))) {
                return calc(XR.next(x), XR.getTerminatingPointOfRoute(XR.route(x)))
                        + calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                        - accWN.getSumWeights(v);
            }
            if (XR.isBefore(y, v)) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(y)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(y)))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                        - accWN.getSumWeights(v);
            }
            return accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                    - accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)));
        }
        return 0;
    }

    ////
    public double evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove5: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x)) || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return accWN.getSumWeights(x)
                    + calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                    - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(y)))
                    + accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                    - accWN.getSumWeights(v);
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(y))) {
            return accWN.getSumWeights(y)
                    + calc(XR.next(x), XR.getTerminatingPointOfRoute(XR.route(x)))
                    - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                    + accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(y)))
                    - accWN.getSumWeights(v);
        }
        if (XR.isBefore(x, v)) {
            return accWN.getSumWeights(y) + calc(XR.next(x), v) - accWN.getSumWeights(v);
        }
        if (XR.isBefore(y, v)) {
            return accWN.getSumWeights(x) + calc(XR.next(y), v) - accWN.getSumWeights(v);
        }
        return 0;
    }

    ////
    public double evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove6: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x)) || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return accWN.getSumWeights(x)
                    + calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                    - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(y)))
                    + accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                    - accWN.getSumWeights(v);
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(y))) {
            return accWN.getSumWeights(y)
                    + calc(XR.next(x), XR.getTerminatingPointOfRoute(XR.route(x)))
                    - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                    + accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(y)))
                    - accWN.getSumWeights(v);
        }
        if (XR.route(v) == XR.route(x)) {
            if (XR.isBefore(x, v)) {
                return accWN.getSumWeights(y) + calc(XR.next(x), v) - accWN.getSumWeights(v);
            }
            return calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                    - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(y)))
                    + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                    + calc(x, v)
                    - accWN.getSumWeights(v);
        }

        if (XR.isBefore(y, v)) {
            return calc(v, XR.getTerminatingPointOfRoute(XR.route(y)))
                    - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(y)))
                    + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                    - accWN.getSumWeights(v);
        }
        return 0;
    }

    ////
    public double evaluateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove7: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        return evaluateTwoOptMove6(y, x);
    }

    ////
    public double evaluateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove8: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x)) || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return accWN.getSumWeights(x)
                    + calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                    - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(y)))
                    + accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                    - accWN.getSumWeights(v);
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(y))) {
            return accWN.getSumWeights(y)
                    + calc(XR.next(x), XR.getTerminatingPointOfRoute(XR.route(x)))
                    - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                    + accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(y)))
                    - accWN.getSumWeights(v);
        }
        if (XR.route(v) == XR.route(x)) {
            if (XR.isBefore(x, v)) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(x)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                        - accWN.getSumWeights(v);
            }
            return calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                    - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(y)))
                    + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                    + calc(x, v)
                    - accWN.getSumWeights(v);
        }
        if (XR.route(v) == XR.route(y)) {
            if (XR.isBefore(y, v)) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(y)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(y)))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                        - accWN.getSumWeights(v);
            }
            return calc(XR.next(x), XR.getTerminatingPointOfRoute(XR.route(x)))
                    - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                    + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                    + calc(y, v)
                    - accWN.getSumWeights(v);
        }
        return 0;
    }

    ////
    public double evaluateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformOrOptMove(x1, x2, y)) {
            System.out.println(name() + ":: Error evaluateOrOptMove1: " + x1 + " " + x2 + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.route(x1) == XR.route(v)) {
            if (XR.isBefore(x2, v)) {
                return accWN.getSumWeights(XR.prev(x1)) + calc(XR.next(x2), v) - accWN.getSumWeights(v);
            }
            if (XR.isBefore(XR.prev(x1), v)) {
                return accWN.getSumWeights(y) + calc(x1, v) - accWN.getSumWeights(v);
            }
            return 0;
        }
        if (XR.route(y) == XR.route(v) && XR.isBefore(y, v)){
            return calc(x1, x2);
        }
        return 0;
    }

    ////
    public double evaluateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformOrOptMove(x1, x2, y)) {
            System.out.println(name() + ":: Error evaluateOrOptMove2: " + x1 + " " + x2 + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.route(x1) == XR.route(v)) {
            if (XR.isBefore(x2, v)) {
                return accWN.getSumWeights(XR.prev(x1)) + calc(XR.next(x2), v) - accWN.getSumWeights(v);
            }
            if (XR.isBefore(XR.prev(x1), v)) {
                return accWN.getSumWeights(y) + calc(x2, v) - accWN.getSumWeights(v);
            }
            return 0;
        }
        if (XR.route(y) == XR.route(v) && XR.isBefore(y, v)){
            return calc(x1, x2);
        }
        return 0;
    }

    ////
    public double evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove1: " + x + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x)) || v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(v, XR.next(z)) && XR.isBefore(y, v)) {
                return accWN.getSumWeights(x) + calc(v, z) - accWN.getSumWeights(v);
            }
            if (XR.isBefore(v, XR.next(y)) && XR.isBefore(x, v)) {
                return accWN.getSumWeights(x) + calc(XR.next(y), z) + calc(XR.next(x), v) - accWN.getSumWeights(v);
            }
        }
        return 0;
    }

    ////
    public double evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove2: " + x + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x)) || v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(x)))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                        - accWN.getSumWeights(v);
            }
            if (XR.isBefore(y, v)) {
                double newV = accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));
                newV += calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)));
                newV += calc(XR.next(x), y) + calc(XR.next(y), v);
                return newV - accWN.getSumWeights(v);
            }
            if (XR.isBefore(x, v)) {
                double newV = accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));
                newV += calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)));
                newV += calc(v, y);
                return newV - accWN.getSumWeights(v);
            }
            double newV = accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                    - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));;
            newV += calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)));
            newV += calc(XR.next(x), y) + calc(XR.next(y), z) + calc(v, x);
            return newV - accWN.getSumWeights(v);
        }
        return 0;
    }

    ////
    public double evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove3: " + x + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x)) || v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {
                return 0;
            }
            if (XR.isBefore(y, v)) {
                return accWN.getSumWeights(x) + calc(XR.next(x), y) + calc(v, z) - accWN.getSumWeights(v);
            }
            if (XR.isBefore(x, v)) {
                return accWN.getSumWeights(x) + calc(v, y) - accWN.getSumWeights(v);
            }
        }
        return 0;
    }

    ////
    public double evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove4: " + x + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x)) || v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(x)))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                        - accWN.getSumWeights(v);
            }
            if (XR.isBefore(y, v)) {
                double newV = calc(XR.next(y), v)
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));
                newV += calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)));
                return newV - accWN.getSumWeights(v);
            }
            if (XR.isBefore(x, v)) {
                double newV = calc(XR.next(y), z) + calc(XR.next(x), v);
                newV += calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));
                return newV - accWN.getSumWeights(v);
            }
            double newV = calc(XR.next(y), z) + calc(XR.next(x), y) + calc(x, v);
            newV += calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)))
                    + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                    - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));
            return newV - accWN.getSumWeights(v);
        }
        return 0;
    }

    ////
    public double evaluateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove5: " + x + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x)) || v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {
                return 0;
            }
            if (XR.isBefore(y, v)) {
                return accWN.getSumWeights(x) + calc(XR.next(y), v) - accWN.getSumWeights(v);
            }
            if (XR.isBefore(x, v)) {
                return accWN.getSumWeights(x) + calc(XR.next(y), z) + calc(XR.next(x), v) - accWN.getSumWeights(v);
            }
        }
        return 0;
    }

    ////
    public double evaluateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove6: " + x + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x)) || v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(x)))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                        - accWN.getSumWeights(v);
            }
            if (XR.isBefore(y, v)) {
                double newV = calc(z, v) + calc(y, XR.next(x))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));
                newV += calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)));
                return newV - accWN.getSumWeights(v);
            }
            if (XR.isBefore(x, v)) {
                double newV = calc(y, v) + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));
                newV += calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)));
                return newV - accWN.getSumWeights(v);
            }
            double newV = calc(XR.next(y), z) + calc(XR.next(x), y) + calc(x, v)
                    + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                    - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));
            newV += calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)));
            return newV - accWN.getSumWeights(v);
        }
        return 0;
    }

    ////
    public double evaluateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove7: " + x + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x)) || v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {
                return 0;
            }
            if (XR.isBefore(y, v)) {
                return accWN.getSumWeights(x) + calc(XR.next(y), v) - accWN.getSumWeights(v);
            }
            if (XR.isBefore(x, v)) {
                return accWN.getSumWeights(x) + calc(XR.next(y), z) + calc(y, v) - accWN.getSumWeights(v);
            }
        }
        return 0;
    }

    ////
    public double evaluateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluate three opt move8: " + x + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x)) || v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(x)))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                        - accWN.getSumWeights(v);
            }
            if (XR.isBefore(y, v)) {
                double newV = calc(z, v) + calc(y, XR.next(x))
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));
                newV += calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)));
                return newV - accWN.getSumWeights(v);
            }
            if (XR.isBefore(x, v)) {
                double newV = calc(XR.next(x), v)
                        + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                        - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));;
                newV += calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)));
                return newV - accWN.getSumWeights(v);
            }
            double newV = calc(XR.next(y), z) + calc(XR.next(x), y) + calc(x, v)
                    + accWN.getWeights(XR.getStartingPointOfRoute(XR.route(x)))
                    - accWN.getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));
            newV += calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)));
            return newV - accWN.getSumWeights(v);
        }
        return 0;
    }

    ////
    public double evaluateCrossExchangeMove(Point x1, Point y1, Point x2,
                                            Point y2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformCrossExchangeMove(x1, y1, x2, y2)) {
            System.out.println(name() + ":: Error evaluateCrosExchangeMove: " + x1 + " " + y1 + " " + x2 + " " + y2  + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.route(x1) == XR.route(v)) {
            if (XR.isBefore(y1, v)) {
                return accWN.getSumWeights(x1) + calc(XR.next(x2), y2) + calc(XR.next(y1), v) - accWN.getSumWeights(v);
            }
            if (XR.isBefore(x1, v)) {
                return accWN.getSumWeights(x2) + calc(XR.next(x1), v) - accWN.getSumWeights(v);
            }
        }
        if (XR.route(x2) == XR.route(v)) {
            if (XR.isBefore(y2, v)) {
                return accWN.getSumWeights(x2) + calc(XR.next(x1), y1) + calc(XR.next(y2), v) - accWN.getSumWeights(v);
            }
            if (XR.isBefore(x2, v)) {
                return accWN.getSumWeights(x1) + calc(XR.next(x2), v) - accWN.getSumWeights(v);
            }
        }
        return 0;
    }

    ////
    public double evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoPointsMove(x1, x2, y1, y2)) {
            System.out.println(name() + ":: Error evaluateTwoPointsMove: " + x1 + " " + x2 + " " + y1 + " " + y2 + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 2;
        Point[] X = {x1, x2};
        Point[] Y = {y1, y2};
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            route.add(XR.route(X[i]));
            route.add(XR.route(Y[i]));
        }
        double eval = 0;
        for (int r : route) {
            boolean ok = false;
            ArrayList<Point> xx = new ArrayList<Point>();
            ArrayList<Point> yy = new ArrayList<Point>();
            ArrayList<Point> zz = new ArrayList<Point>();
            for (int i = 0; i < n; i++) {
                if (XR.route(Y[i]) == r) {
                    xx.add(X[i]);
                    yy.add(Y[i]);
                    ok |= X[i] == v;
                }
                if (XR.route(X[i]) == r) {
                    zz.add(X[i]);
                }
            }
            if (ok || XR.route(v) == r) {
                Point[] XX = new Point[xx.size()];
                Point[] YY = new Point[yy.size()];
                Point[] ZZ = new Point[zz.size()];
                for (int i = 0; i < XX.length; i++) {
                    XX[i] = xx.get(i);
                    YY[i] = yy.get(i);
                }
                for (int i = 0; i < ZZ.length; i++) {
                    ZZ[i] = zz.get(i);
                }
                eval += evaluateMove(XX, YY, ZZ);
            }
        }
        return eval;
    }

    ////
    public double evaluateThreePointsMove(Point x1, Point x2, Point x3,
                                          Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreePointsMove(x1, x2, x3, y1, y2, y3)) {
            System.out.println(name() + ":: Error evaluate ThreePointsMove: " + x1 + " " + y1 + " " + x2 + " " + y2  + " " + x3 + " " + y3 + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 3;
        Point[] X = {x1, x2, x3};
        Point[] Y = {y1, y2, y3};
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            route.add(XR.route(X[i]));
            route.add(XR.route(Y[i]));
        }
        double eval = 0;
        for (int r : route) {
            boolean ok = false;
            ArrayList<Point> xx = new ArrayList<Point>();
            ArrayList<Point> yy = new ArrayList<Point>();
            ArrayList<Point> zz = new ArrayList<Point>();
            for (int i = 0; i < n; i++) {
                if (XR.route(Y[i]) == r) {
                    xx.add(X[i]);
                    yy.add(Y[i]);
                    ok |= X[i] == v;
                }
                if (XR.route(X[i]) == r) {
                    zz.add(X[i]);
                }
            }
            if (ok || XR.route(v) == r) {
                Point[] XX = new Point[xx.size()];
                Point[] YY = new Point[yy.size()];
                Point[] ZZ = new Point[zz.size()];
                for (int i = 0; i < XX.length; i++) {
                    XX[i] = xx.get(i);
                    YY[i] = yy.get(i);
                }
                for (int i = 0; i < ZZ.length; i++) {
                    ZZ[i] = zz.get(i);
                }
                eval += evaluateMove(XX, YY, ZZ);
            }
        }
        return eval;
    }

    ////
    public double evaluateFourPointsMove(Point x1, Point x2, Point x3,
                                         Point x4, Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4)) {
            System.out.println(name() + ":: Error evaluate FourPointsMove: " + x1 + " " + y1 + " " + x2 + " " + y2  + " " + x3 + " " + y3 + " " + x4 + " " + y4 + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 4;
        Point[] X = {x1, x2, x3, x4};
        Point[] Y = {y1, y2, y3, y4};
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            route.add(XR.route(X[i]));
            route.add(XR.route(Y[i]));
        }
        double eval = 0;
        for (int r : route) {
            boolean ok = false;
            ArrayList<Point> xx = new ArrayList<Point>();
            ArrayList<Point> yy = new ArrayList<Point>();
            ArrayList<Point> zz = new ArrayList<Point>();
            for (int i = 0; i < n; i++) {
                if (XR.route(Y[i]) == r) {
                    xx.add(X[i]);
                    yy.add(Y[i]);
                    ok |= X[i] == v;
                }
                if (XR.route(X[i]) == r) {
                    zz.add(X[i]);
                }
            }
            if (ok || XR.route(v) == r) {
                Point[] XX = new Point[xx.size()];
                Point[] YY = new Point[yy.size()];
                Point[] ZZ = new Point[zz.size()];
                for (int i = 0; i < XX.length; i++) {
                    XX[i] = xx.get(i);
                    YY[i] = yy.get(i);
                }
                for (int i = 0; i < ZZ.length; i++) {
                    ZZ[i] = zz.get(i);
                }
                eval += evaluateMove(XX, YY, ZZ);
            }
        }
        return eval;
    }

    ////
    public double evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformAddOnePoint(x, y)) {
            System.out.println(name() + ":: Error evaluateAddOnePoint: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == x) {
            return accWN.getSumWeights(y) + accWN.getWeights(x);
        }
        if (XR.isBefore(y, v)) {
            return accWN.getWeights(x);
        }
        return 0;
    }

    ////
    public double evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformRemoveOnePoint(x)) {
            System.out.println(name() + ":: Error evaluateRemoveOnePoint: " + x + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == x) {
            return -(accWN.getSumWeights(XR.prev(x)) + accWN.getWeights(x));
        }
        if (XR.isBefore(x, v)) {
            return -accWN.getWeights(x);
        }
        return 0;
    }

    public double evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformAddTwoPoints(x1, y1, x2, y2)) {
            System.out.println(name() + ":: Error evaluateAddTwoPoints: " + x1 + " " + y1 + " " + x2 + " " + y2 + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == x1) {
            return accWN.getSumWeights(y1) + accWN.getWeights(x1);
        }
        if(v == x2){
            return accWN.getSumWeights(y2) + accWN.getWeights(x1) + accWN.getWeights(x2);
        }
        if (XR.isBefore(y1, v) && !XR.isBefore(y2, v)) {
            return accWN.getWeights(x1);
        }
        if(XR.isBefore(y2, v)){
            return accWN.getWeights(x1) + accWN.getWeights(x2);
        }
        return 0;
    }

    public double evaluateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformRemoveTwoPoints(x1, x2)) {
            System.out.println(name() + ":: Error evaluateRemoveTwoPoints: " + x1 + " " + x2 + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == x1) {
            return -(accWN.getSumWeights(XR.prev(x1)) + accWN.getWeights(x1));
        }
        if(v == x2){
            return - accWN.getSumWeights(x2);
        }
        if (XR.isBefore(x1, v) && !XR.isBefore(x2, v)) {
            return -accWN.getWeights(x1);
        }
        if(XR.isBefore(x2, v)){
            return -accWN.getWeights(x1) - accWN.getWeights(x2);
        }
        return 0;
    }

    ////
    public double evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformAddRemovePoints(x, y, z)) {
            System.out.println(name() + ":: Error evaluate AddRemovePoints: " + x + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.route(x) == XR.route(z)) {
            if (y != v && XR.route(x) != XR.route(v)) {
                return 0;
            }
            if (x == v) {
                return -accWN.getSumWeights(x);
            }
            Point[] X = {y};
            Point[] Y = {z};
            Point[] Z = {x};
            return evaluateMove(X, Y, Z);
        } else {
            if (XR.route(x) == XR.route(v)) {
                if (v == x) {
                    return -(accWN.getSumWeights(XR.prev(x)) + accWN.getWeights(x));
                }
                if (XR.isBefore(x, v)) {
                    return -accWN.getWeights(x);
                }
            }
            if (v == y) {
                return accWN.getSumWeights(z) + accWN.getWeights(y);
            }
            if (XR.isBefore(z, v)) {
                return accWN.getWeights(y);
            }

        }

        return 0;
    }
    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        System.out.println(name() + "::propagateTwoOptMoveOneRoute NOT IMPLEMENTED YET");
        System.exit(-1);
    }

    ////
    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub

    }


    public double evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformKPointsMove(x, y)) {
            System.out.println(name() + ":: Error evaluateKPointsMove:\n" + XR.toString());
            System.exit(-1);
        }
        int n = x.size();
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            if (XR.route(x.get(i)) != Constants.NULL_POINT) {
                route.add(XR.route(x.get(i)));
            }
            if (y.get(i) != CBLSVR.NULL_POINT) {
                route.add(XR.route(y.get(i)));
            }
        }
        double eval = 0;
        for (int r : route) {
            boolean ok = false;
            ArrayList<Point> xx = new ArrayList<Point>();
            ArrayList<Point> yy = new ArrayList<Point>();
            ArrayList<Point> zz = new ArrayList<Point>();
            for (int i = 0; i < n; i++) {
                if (y.get(i) != CBLSVR.NULL_POINT && XR.route(y.get(i)) == r) {
                    xx.add(x.get(i));
                    yy.add(y.get(i));
                    ok |= x.get(i) == v;
                } else if (y.get(i) == CBLSVR.NULL_POINT){
                    if (x.get(i) == v) {
                        return -accWN.getSumWeights(v);
                    }
                }
                if (XR.route(x.get(i)) == r) {
                    zz.add(x.get(i));
                }
            }
            if (ok || XR.route(v) == r) {
                Point[] X = new Point[xx.size()];
                Point[] Y = new Point[yy.size()];
                Point[] Z = new Point[zz.size()];
                for (int i = 0; i < X.length; i++) {
                    X[i] = xx.get(i);
                    Y[i] = yy.get(i);
                }
                for (int i = 0; i < Z.length; i++) {
                    Z[i] = zz.get(i);
                }
                eval += evaluateMove(X, Y, Z);
            }
        }
        return eval;
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = 60;
        int n = 50;
        int K = 5;
        Point[] p = new Point[N];
        SecureRandom rand = new SecureRandom();
        for (int i = 0; i < N; i++) {
            p[i] = new Point(i, rand.nextInt(50), rand.nextInt(50));
        }
        VRManager mgr = new VRManager();
        VarRoutesVR XR = new VarRoutesVR(mgr);
        for (int i = 0; i < n; i++) {
            XR.addClientPoint(p[i]);
        }
        for (int i = n; i < N - K; i++) {
            XR.addRoute(p[i], p[i + K]);
        }
        XR.initSequential();
        NodeWeightsManager nwm = new NodeWeightsManager(XR.getAllPoints());
        for (int i = 0; i < p.length; i++) {
            nwm.setWeight(p[i], rand.nextInt(50));
        }
        AccumulatedWeightNodesVR accWN = new AccumulatedWeightNodesVR(XR, nwm);
        IFunctionVR[] f = new IFunctionVR[N];
        for (int i = 0; i < f.length; i++) {
            f[i] = new AccumulatedNodeWeightsOnPathVR(accWN, p[i]);
        }

        mgr.close();
        mgr.performRemoveOnePoint(p[0]);

        int iter = 0;
        double[] oldV = new double[N];
        double[] newV = new double[N];
        double[] delta = new double[N];
        while (iter < 10000) {
            System.out.println(iter++ + "\n" + XR + "\n" + accWN);
            for (int i = 0; i < N; i++) {
                oldV[i] = f[i].getValue();
            }
//			int x1 = rand.nextInt(N);
//			int x2 = rand.nextInt(N);
//			int y1 = rand.nextInt(N);
//			int y2 = rand.nextInt(N);
//			int x3 = rand.nextInt(N);
//			int y3 = rand.nextInt(N);
//			int x4 = rand.nextInt(N);
//			int y4 = rand.nextInt(N);
//			while (!XR.checkPerformAddRemovePoints(p[x1], p[x2], p[x3])) {
//				x1 = rand.nextInt(N);
//				y1 = rand.nextInt(N);
//				x2 = rand.nextInt(N);
//				y2 = rand.nextInt(N);
//				x3 = rand.nextInt(N);
//				y3 = rand.nextInt(N);
//				x4 = rand.nextInt(N);
//				y4 = rand.nextInt(N);
//			}
//
//			System.out.println(x1 + " " + y1);
//			for (int i = 0; i < N; i++) {
//				delta[i] = f[i].evaluateAddRemovePoints(p[x1], p[x2], p[x3]);
//			}
//			mgr.performAddRemovePoints(p[x1], p[x2], p[x3]);
//			for (int i = 0; i < N; i++) {
//				newV[i] = f[i].getValue();
//			}
            ArrayList<Point> x = new ArrayList<Point>();
            ArrayList<Point> y = new ArrayList<Point>();
            int count = rand.nextInt(5) + 5;
            for (int i = 0; i < count; i++) {
                x.add(p[rand.nextInt(N)]);
                if (rand.nextInt(5) == 0) {
                    y.add(CBLSVR.NULL_POINT);
                } else {
                    y.add(p[rand.nextInt(N)]);
                }
            }
            while (!XR.checkPerformKPointsMove(x, y)) {
                x.clear();
                y.clear();
                count = rand.nextInt(5) + 5;
                for (int i = 0; i < count; i++) {
                    x.add(p[rand.nextInt(N)]);
                    if (rand.nextInt(5) == 0) {
                        y.add(CBLSVR.NULL_POINT);
                    } else {
                        y.add(p[rand.nextInt(N)]);
                    }
                }
            }
            System.out.println(count);
            for (int i = 0; i < count; i++) {
                System.out.println(x.get(i) + " " + y.get(i));
            }
            for (int i = 0; i < N; i++) {
                delta[i] = f[i].evaluateKPointsMove(x, y);
            }
            mgr.performKPointsMove(x, y);
            for (int i = 0; i < N; i++) {
                newV[i] = f[i].getValue();
            }
            System.out.println(XR + "\n" + accWN);
            for (int i = 0; i < N; i++) {
                if (Math.abs(oldV[i] + delta[i] - newV[i]) > 1e-6) {
                    System.out.println("WTFFFFFFFFFFFFFFFFFFF " + i + " "
                            + oldV[i] + " " + delta[i] + " " + newV[i]);
                    System.exit(-1);
                }
            }
        }
        System.out.println("Okkkkkkkkkkkkkk");
    }


}
class NodeWeightsManager {
    protected ArrayList<Point> points;
    protected double[] weights;
    protected HashMap<Point, Integer> map;
    public NodeWeightsManager(ArrayList<Point> points){
        this.points = points;
        map = new HashMap<Point, Integer>();
        for(int i = 0; i < points.size(); i++)
            map.put(points.get(i), i);
        //weights = new double[points.size()];
        weights = new double[points.size() < 100 ? 100 : points.size()];
    }

    private void scaleUp(){
        double[] t_w = new double[2*weights.length];
        System.arraycopy(weights, 0, t_w, 0, weights.length);
        weights = t_w;
    }
    public void addPoint(Point p){
        if(weights.length == points.size()) scaleUp();
        points.add(p);
        map.put(p, points.size()-1);
    }

    public double getWeight(Point p){
        return weights[map.get(p)];
    }
    public void setWeight(Point p, double w){
        weights[map.get(p)] = w;
    }
    public ArrayList<Point> getPoints(){
        return this.points;
    }

    public String name(){
        return "NodeWeightManager";
    }
    public void print(){
        for(int i = 0; i < points.size(); i++){
            System.out.println(name() + "::NodeWeightManager::print, point " + points.get(i).ID);
        }
    }
}

class CapacityConstraintViolationsVR implements IFunctionVR {

    private VRManager mgr;
    private VarRoutesVR XR;
    private NodeWeightsManager nwm;

    private double[] capacity;
    private double[] sumWeights;

    private double violations;

    private HashMap<Point, Integer> map;

    public CapacityConstraintViolationsVR(VarRoutesVR XR, NodeWeightsManager nwm, double capacity) {
        this.XR = XR;
        this.nwm = nwm;
        this.capacity = new double[XR.getNbRoutes() + 1];
        for (int i = 1; i <= XR.getNbRoutes(); i++) {
            this.capacity[i] = capacity;
        }
        post();
    }

    private void post() {
        mgr = XR.getVRManager();
        sumWeights = new double[XR.getTotalNbPoints()];
        ArrayList<Point> points = XR.getAllPoints();
        map = new HashMap<Point, Integer>();
        for (int i = 0; i < points.size(); i++) {
            map.put(points.get(i), i);
        }
        mgr.post(this);
    }


    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return mgr;
    }

    private double getViolations(double s, int k) {
        return (s < capacity[k] || CBLSVR.equal(s, capacity[k])) ? 0 : s - capacity[k];
    }

    private int getIndex(Point p) {
        return map.get(p);
    }

    private double getWeights(Point p){
        return nwm.getWeight(p);
    }

    private double getSumWeights(Point p){
        return sumWeights[getIndex(p)];
    }

    public VarRoutesVR getVarRoutesVR(){
        return this.XR;
    }

    private void update(int k) {
        Point sp = XR.getStartingPointOfRoute(k);
        Point tp = XR.getTerminatingPointOfRoute(k);
        sumWeights[getIndex(sp)] = nwm.getWeight(sp);
        for (Point u = sp; u != tp; u = XR.next(u)){
            sumWeights[getIndex(XR.next(u))] = sumWeights[getIndex(u)] + nwm.getWeight(XR.next(u));
        }
    }


    public void initPropagation() {
        // TODO Auto-generated method stub
        violations = 0;
        for (int i = 1; i <= XR.getNbRoutes(); i++) {
            update(i);
            violations += getViolations(getSumWeights(XR.getTerminatingPointOfRoute(i)), i);
        }
    }

    private double calc(Point s, Point t) {
        if (XR.route(s) != XR.route(t)){
            System.out.println(name() + "::calc(" + s + "," + t + ") EXCEPTION, " + s + " and " + t + " are not the the same route");
            mgr.exit(-1);
        }
        return XR.isBefore(s, t) ? getSumWeights(t) - getSumWeights(s) + getWeights(s)
                : getSumWeights(s) - getSumWeights(t) + getWeights(t);
    }


    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x));
        oldR.add(XR.oldRoute(y));
        for (int r : oldR) {
            violations -= getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
            update(r);
            violations += getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
        }
    }


    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        if (XR.next(x) == y) {
            propagateTwoPointsMove(y, x, XR.prev(x), XR.prev(x));
        } else if (XR.next(y) == x) {
            propagateTwoPointsMove(x, y, XR.prev(y), XR.prev(y));
        } else {
            propagateTwoPointsMove(x, y, XR.prev(y), XR.prev(x));
        }
    }


    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x))), XR.oldRoute(x));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
        double newX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x))), XR.oldRoute(x));
        double newY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        violations += newX + newY - oldX - oldY;
    }


    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x))), XR.oldRoute(x));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
        double newX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x))), XR.oldRoute(x));
        double newY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        violations += newX + newY - oldX - oldY;
    }


    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x))), XR.oldRoute(x));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
        double newX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x))), XR.oldRoute(x));
        double newY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        violations += newX + newY - oldX - oldY;
    }


    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x))), XR.oldRoute(x));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
        double newX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x))), XR.oldRoute(x));
        double newY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        violations += newX + newY - oldX - oldY;
    }


    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x))), XR.oldRoute(x));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
        double newX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x))), XR.oldRoute(x));
        double newY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        violations += newX + newY - oldX - oldY;
    }


    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x))), XR.oldRoute(x));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
        double newX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x))), XR.oldRoute(x));
        double newY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        violations += newX + newY - oldX - oldY;
    }


    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x))), XR.oldRoute(x));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
        double newX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x))), XR.oldRoute(x));
        double newY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        violations += newX + newY - oldX - oldY;
    }


    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x))), XR.oldRoute(x));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
        double newX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x))), XR.oldRoute(x));
        double newY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        violations += newX + newY - oldX - oldY;
    }


    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x1))), XR.oldRoute(x1));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        update(XR.oldRoute(x1));
        update(XR.oldRoute(y));
        double newX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x1))), XR.oldRoute(x1));
        double newY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        violations += newX + newY - oldX - oldY;
    }


    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x1))), XR.oldRoute(x1));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        update(XR.oldRoute(x1));
        update(XR.oldRoute(y));
        double newX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x1))), XR.oldRoute(x1));
        double newY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(y))), XR.oldRoute(y));
        violations += newX + newY - oldX - oldY;
    }


    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        update(XR.route(x));
    }


    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2,
                                           Point y2) {
        // TODO Auto-generated method stub
        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x1))), XR.oldRoute(x1));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x2))), XR.oldRoute(x2));
        update(XR.oldRoute(x1));
        update(XR.oldRoute(x2));
        double newX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x1))), XR.oldRoute(x1));
        double newY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.oldRoute(x2))), XR.oldRoute(x2));
        violations += newX + newY - oldX - oldY;
    }


    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x1));
        oldR.add(XR.oldRoute(y1));
        oldR.add(XR.oldRoute(x2));
        oldR.add(XR.oldRoute(y2));
        for (int r : oldR) {
            violations -= getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
            update(r);
            violations += getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
        }
    }


    public void propagateThreePointsMove(Point x1, Point x2, Point x3,
                                         Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x1));
        oldR.add(XR.oldRoute(y1));
        oldR.add(XR.oldRoute(x2));
        oldR.add(XR.oldRoute(y2));
        oldR.add(XR.oldRoute(x3));
        oldR.add(XR.oldRoute(y3));
        for (int r : oldR) {
            violations -= getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
            update(r);
            violations += getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
        }
    }


    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                        Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x1));
        oldR.add(XR.oldRoute(y1));
        oldR.add(XR.oldRoute(x2));
        oldR.add(XR.oldRoute(y2));
        oldR.add(XR.oldRoute(x3));
        oldR.add(XR.oldRoute(y3));
        oldR.add(XR.oldRoute(x4));
        oldR.add(XR.oldRoute(y4));
        for (int r : oldR) {
            violations -= getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
            update(r);
            violations += getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
        }
    }


    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        int r = XR.route(y);
        violations -= getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
        update(r);
        violations += getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
    }


    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        int r = XR.oldRoute(x);
        violations -= getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
        update(r);
        violations += getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
    }

    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        int r = XR.route(y1);
        violations -= getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
        update(r);
        violations += getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
    }


    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        int r = XR.oldRoute(x1);
        violations -= getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
        update(r);
        violations += getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
    }

    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (XR.oldRoute(x) == XR.oldRoute(z)) {
            int r = XR.oldRoute(x);
            violations -= getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
            update(r);
            violations += getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
        } else {
            int r = XR.oldRoute(x);
            violations -= getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
            update(r);
            violations += getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
            r = XR.oldRoute(z);
            violations -= getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
            update(r);
            violations += getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
        }
    }


    public String name() {
        // TODO Auto-generated method stub
        return "AccumulatedNodeWeightsOnPathVR";
    }


    public double getValue() {
        // TODO Auto-generated method stub
        return violations;
    }

    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    public double evaluateTwoOptMoveOneRoute(Point x, Point y) {
        System.out.println(name() + "::evaluateTwoOptMoveOneRoute NOT IMPEMENTED YET");
        System.exit(-1);
        return 0;
    }

    public double evaluateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformOnePointMove(x, y)) {
            System.out.println(name() + ":: Error evaluateOnePointMove: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }

        int n = 1;
        Point[] xx = {x};
        Point[] yy = {y};
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            route.add(XR.route(xx[i]));
            route.add(XR.route(yy[i]));
        }
        int eval = 0;
        for (int r : route) {
            eval -= getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
            double s = getSumWeights(XR.getTerminatingPointOfRoute(r));
            for (int i = 0; i < n; i++) {
                if (XR.route(xx[i]) == r) {
                    s -= getWeights(xx[i]);
                }
                if (XR.route(yy[i]) == r) {
                    s += getWeights(xx[i]);
                }
            }
            eval += getViolations(s, r);
        }
        return eval;
    }


    public double evaluateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoPointsMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoPointsMove: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.next(x) == y) {
            return evaluateTwoPointsMove(y, x, XR.prev(x), XR.prev(x));
        } else if (XR.next(y) == x) {
            return evaluateTwoPointsMove(x, y, XR.prev(y), XR.prev(y));
        } else {
            return evaluateTwoPointsMove(x, y, XR.prev(y), XR.prev(x));
        }
    }


    public double evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove1: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }

        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x))), XR.route(x));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(y))), XR.route(y));
        double sx = getSumWeights(x) + getSumWeights(y)
                - getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                + getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));
        double sy = calc(XR.next(x), XR.getTerminatingPointOfRoute(XR.route(x)))
                + calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                - getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                + getWeights(XR.getStartingPointOfRoute(XR.route(y)));
        double newX = getViolations(sx, XR.route(x));
        double newY = getViolations(sy, XR.route(y));
        return newX + newY - oldX - oldY;
    }


    public double evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove2: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }

        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x))), XR.route(x));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(y))), XR.route(y));
        double sx = getSumWeights(x) + getSumWeights(y)
                - getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                + getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));
        double sy = calc(XR.next(x), XR.getTerminatingPointOfRoute(XR.route(x)))
                + calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                - getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                + getWeights(XR.getStartingPointOfRoute(XR.route(y)));
        double newX = getViolations(sx, XR.route(x));
        double newY = getViolations(sy, XR.route(y));
        return newX + newY - oldX - oldY;
    }


    public double evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove3: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }

        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x))), XR.route(x));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(y))), XR.route(y));
        double sx = getSumWeights(x) + getSumWeights(y)
                - getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                + getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));
        double sy = calc(XR.next(x), XR.getTerminatingPointOfRoute(XR.route(x)))
                + calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                - getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                + getWeights(XR.getStartingPointOfRoute(XR.route(y)));
        double newX = getViolations(sx, XR.route(x));
        double newY = getViolations(sy, XR.route(y));
        return newX + newY - oldX - oldY;
    }


    public double evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove4: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }

        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x))), XR.route(x));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(y))), XR.route(y));
        double sx = getSumWeights(x) + getSumWeights(y)
                - getWeights(XR.getStartingPointOfRoute(XR.route(y)))
                + getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));
        double sy = calc(XR.next(x), XR.getTerminatingPointOfRoute(XR.route(x)))
                + calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                - getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                + getWeights(XR.getStartingPointOfRoute(XR.route(y)));
        double newX = getViolations(sx, XR.route(x));
        double newY = getViolations(sy, XR.route(y));
        return newX + newY - oldX - oldY;
    }


    public double evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove5: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }

        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x))), XR.route(x));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(y))), XR.route(y));
        double sx = getSumWeights(x)
                + calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                - getWeights(XR.getTerminatingPointOfRoute(XR.route(y)))
                + getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));
        double sy = getSumWeights(y)
                + calc(XR.next(x), XR.getTerminatingPointOfRoute(XR.route(x)))
                - getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                + getWeights(XR.getTerminatingPointOfRoute(XR.route(y)));
        double newX = getViolations(sx, XR.route(x));
        double newY = getViolations(sy, XR.route(y));
        return newX + newY - oldX - oldY;
    }


    public double evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove6: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }

        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x))), XR.route(x));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(y))), XR.route(y));
        double sx = getSumWeights(x)
                + calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                - getWeights(XR.getTerminatingPointOfRoute(XR.route(y)))
                + getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));
        double sy = getSumWeights(y)
                + calc(XR.next(x), XR.getTerminatingPointOfRoute(XR.route(x)))
                - getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                + getWeights(XR.getTerminatingPointOfRoute(XR.route(y)));
        double newX = getViolations(sx, XR.route(x));
        double newY = getViolations(sy, XR.route(y));
        return newX + newY - oldX - oldY;
    }


    public double evaluateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove7: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }

        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x))), XR.route(x));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(y))), XR.route(y));
        double sx = getSumWeights(x)
                + calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                - getWeights(XR.getTerminatingPointOfRoute(XR.route(y)))
                + getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));
        double sy = getSumWeights(y)
                + calc(XR.next(x), XR.getTerminatingPointOfRoute(XR.route(x)))
                - getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                + getWeights(XR.getTerminatingPointOfRoute(XR.route(y)));
        double newX = getViolations(sx, XR.route(x));
        double newY = getViolations(sy, XR.route(y));
        return newX + newY - oldX - oldY;
    }


    public double evaluateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove8: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }

        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x))), XR.route(x));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(y))), XR.route(y));
        double sx = getSumWeights(x)
                + calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                - getWeights(XR.getTerminatingPointOfRoute(XR.route(y)))
                + getWeights(XR.getTerminatingPointOfRoute(XR.route(x)));
        double sy = getSumWeights(y)
                + calc(XR.next(x), XR.getTerminatingPointOfRoute(XR.route(x)))
                - getWeights(XR.getTerminatingPointOfRoute(XR.route(x)))
                + getWeights(XR.getTerminatingPointOfRoute(XR.route(y)));
        double newX = getViolations(sx, XR.route(x));
        double newY = getViolations(sy, XR.route(y));
        return newX + newY - oldX - oldY;
    }


    public double evaluateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformOrOptMove(x1, x2, y)) {
            System.out.println(name() + ":: Error evaluateOrOptMove1: " + x1 + " " + x2 + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x1))), XR.route(x1));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(y))), XR.route(y));
        double sx = getSumWeights(XR.prev(x1)) + calc(XR.next(x2), XR.getTerminatingPointOfRoute(XR.route(x1)));
        double sy = getSumWeights(XR.getTerminatingPointOfRoute(XR.route(y))) + calc(x1, x2);
        double newX = getViolations(sx, XR.route(x1));
        double newY = getViolations(sy, XR.route(y));
        return newX + newY - oldX - oldY;
    }


    public double evaluateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformOrOptMove(x1, x2, y)) {
            System.out.println(name() + ":: Error evaluateOrOptMove2: " + x1 + " " + x2 + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x1))), XR.route(x1));
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(y))), XR.route(y));
        double sx = getSumWeights(XR.prev(x1)) + calc(XR.next(x2), XR.getTerminatingPointOfRoute(XR.route(x1)));
        double sy = getSumWeights(XR.getTerminatingPointOfRoute(XR.route(y))) + calc(x1, x2);
        double newX = getViolations(sx, XR.route(x1));
        double newY = getViolations(sy, XR.route(y));
        return newX + newY - oldX - oldY;
    }


    public double evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return 0;
    }


    public double evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return 0;
    }


    public double evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return 0;
    }


    public double evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return 0;
    }


    public double evaluateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return 0;
    }


    public double evaluateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return 0;
    }


    public double evaluateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return 0;
    }


    public double evaluateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return 0;
    }


    public double evaluateCrossExchangeMove(Point x1, Point y1, Point x2,
                                            Point y2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformCrossExchangeMove(x1, y1, x2, y2)) {
            System.out.println(name() + ":: Error evaluateCrossExchangeMove: " + x1 + " " + y1 + " " + x2 + " " + y2 + "\n" + XR.toString());
            System.exit(-1);
        }

        double oldX1 = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x1))), XR.route(x1));
        double oldX2 = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x2))), XR.route(x2));
        double delta = calc(XR.next(x1), y1) - calc(XR.next(x2), y2);
        double newX1 = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x1))) - delta, XR.route(x1));
        double newX2 = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x2))) + delta, XR.route(x2));
        return newX1 + newX2 - oldX1 - oldX2;
    }


    public double evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoPointsMove(x1, x2, y1, y2)) {
            System.out.println(name() + ":: Error evaluateTwoPointsMove: " + x1 + " " + x2 + " " + y1 + " " + y2 + "\n" + XR.toString());
            System.exit(-1);
        }

        int n = 2;
        Point[] xx = {x1, x2};
        Point[] yy = {y1, y2};
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            route.add(XR.route(xx[i]));
            route.add(XR.route(yy[i]));
        }
        int eval = 0;
        for (int r : route) {
            eval -= getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
            double s = getSumWeights(XR.getTerminatingPointOfRoute(r));
            for (int i = 0; i < n; i++) {
                if (XR.route(xx[i]) == r) {
                    s -= getWeights(xx[i]);
                }
                if (XR.route(yy[i]) == r) {
                    s += getWeights(xx[i]);
                }
            }
            eval += getViolations(s, r);
        }
        return eval;
    }


    public double evaluateThreePointsMove(Point x1, Point x2, Point x3,
                                          Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreePointsMove(x1, x2, x3, y1, y2, y3)) {
            System.out.println(name() + ":: Error evaluateThreePointsMove: " + x1 + " " + y1 + " " + x2 + " " + y2  + " " + x3 + " " + y3 + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 3;
        Point[] xx = {x1, x2, x3};
        Point[] yy = {y1, y2, y3};
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            route.add(XR.route(xx[i]));
            route.add(XR.route(yy[i]));
        }
        int eval = 0;
        for (int r : route) {
            eval -= getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
            double s = getSumWeights(XR.getTerminatingPointOfRoute(r));
            for (int i = 0; i < n; i++) {
                if (XR.route(xx[i]) == r) {
                    s -= getWeights(xx[i]);
                }
                if (XR.route(yy[i]) == r) {
                    s += getWeights(xx[i]);
                }
            }
            eval += getViolations(s, r);
        }
        return eval;
    }


    public double evaluateFourPointsMove(Point x1, Point x2, Point x3,
                                         Point x4, Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4)) {
            System.out.println(name() + ":: Error evaluateFourPointsMove: " + x1 + " " + y1 + " " + x2 + " " + y2  + " " + x3 + " " + y3 + " " + x4 + " " + y4 + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 4;
        Point[] xx = {x1, x2, x3, x4};
        Point[] yy = {y1, y2, y3, y4};
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            route.add(XR.route(xx[i]));
            route.add(XR.route(yy[i]));
        }
        int eval = 0;
        for (int r : route) {
            eval -= getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
            double s = getSumWeights(XR.getTerminatingPointOfRoute(r));
            for (int i = 0; i < n; i++) {
                if (XR.route(xx[i]) == r) {
                    s -= getWeights(xx[i]);
                }
                if (XR.route(yy[i]) == r) {
                    s += getWeights(xx[i]);
                }
            }
            eval += getViolations(s, r);
        }
        return eval;
    }


    public double evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformAddOnePoint(x, y)) {
            System.out.println(name() + ":: Error evaluateAddOnePoint: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(y))), XR.route(y));
        double newY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(y))) + getWeights(x), XR.route(y));
        return newY - oldY;
    }


    public double evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformRemoveOnePoint(x)) {
            System.out.println(name() + ":: Error evaluateRemoveOnePoint: " + x + "\n" + XR.toString());
            System.exit(-1);
        }
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x))), XR.route(x));
        double newY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x))) - getWeights(x), XR.route(x));
        return newY - oldY;
    }

    public double evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformAddTwoPoints(x1, y1, x2, y2)) {
            System.out.println(name() + ":: Error evaluateAddTwoPoints: " + x1 + " " + y1 + " " + x2 + " " + y2 + "\n" + XR.toString());
            System.exit(-1);
        }
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(y1))), XR.route(y1));
        double newY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(y1))) + getWeights(x1) + getWeights(x2), XR.route(y1));
        return newY - oldY;
    }

    public double evaluateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformRemoveTwoPoints(x1, x2)) {
            System.out.println(name() + ":: Error evaluateRemoveTwoPoints: " + x1 + " " + x2 + "\n" + XR.toString());
            System.exit(-1);
        }
        double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x1))), XR.route(x1));
        double newY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x1))) - getWeights(x1) - getWeights(x2), XR.route(x1));
        return newY - oldY;
    }

    public double evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformAddRemovePoints(x, y, z)) {
            System.out.println(name() + ":: Error evaluateAddRemovePoints: " + x + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        double eval = 0;
        if (XR.route(x) == XR.route(z)) {
            double oldV = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x))), XR.route(x));
            double newV = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x))) - getWeights(x) + getWeights(y), XR.route(x));
            eval = newV - oldV;
        } else {
            double oldX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x))), XR.route(x));
            double newX = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(x))) - getWeights(x), XR.route(x));
            double oldY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(z))), XR.route(z));
            double newY = getViolations(getSumWeights(XR.getTerminatingPointOfRoute(XR.route(z))) + getWeights(y), XR.route(z));
            eval = newY + newX - oldY - oldX;
        }

        return eval;
    }

    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        System.out.println(name() + "::propagateTwoOptMoveOneRoute NOT IMPLEMENTED YET");
        System.exit(-1);
    }

    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        for (int i = 0; i < x.size(); i++) {
            Point p = x.get(i);
            Point q = y.get(i);
            if (q != CBLSVR.NULL_POINT) {
                oldR.add(XR.oldRoute(p));
                oldR.add(XR.oldRoute(q));
            } else {
                oldR.add(XR.oldRoute(p));
                sumWeights[getIndex(p)] = 0;
            }
        }
        for (int r : oldR) {
            if (r != Constants.NULL_POINT) {
                violations -= getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
                update(r);
                violations += getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
            }
        }
    }


    public double evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformKPointsMove(x, y)) {
            System.out.println(name() + ":: Error evaluateKPointsMove: \n" + XR.toString());
            System.exit(-1);
        }
        int n = x.size();
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            if (XR.route(x.get(i)) != Constants.NULL_POINT) {
                route.add(XR.route(x.get(i)));
            }
            if (y.get(i) != CBLSVR.NULL_POINT) {
                route.add(XR.route(y.get(i)));
            }
        }
        int eval = 0;
        for (int r : route) {
            eval -= getViolations(getSumWeights(XR.getTerminatingPointOfRoute(r)), r);
            double s = getSumWeights(XR.getTerminatingPointOfRoute(r));
            for (int i = 0; i < n; i++) {
                if (XR.route(x.get(i)) == r) {
                    s -= getWeights(x.get(i));
                }
                if (y.get(i) != CBLSVR.NULL_POINT && XR.route(y.get(i)) == r) {
                    s += getWeights(x.get(i));
                }
            }
            eval += getViolations(s, r);
        }
        return eval;
    }

    public String toString() {
        String s = "";
        for (int k = 1; k <= XR.getNbRoutes(); k++) {
            s += "route[" + k + "] : ";
            Point x = XR.getStartingPointOfRoute(k);
            while (x != XR.getTerminatingPointOfRoute(k)) {
                s += x.getID() + " (" + sumWeights[getIndex(x)] + ") ";
                x = XR.next(x);
            }
            s += x.getID() + " (" + sumWeights[getIndex(x)] + ") ";
            s += getViolations(sumWeights[getIndex(x)], k) + "\n";
        }
        return s;
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = 60;
        int n = 50;
        int K = 5;
        Point[] p = new Point[N];
        SecureRandom rand = new SecureRandom();
        for (int i = 0; i < N; i++) {
            p[i] = new Point(i, rand.nextInt(50), rand.nextInt(50));
        }
        VRManager mgr = new VRManager();
        VarRoutesVR XR = new VarRoutesVR(mgr);
        for (int i = 0; i < n; i++) {
            XR.addClientPoint(p[i]);
        }
        for (int i = n; i < N - K; i++) {
            XR.addRoute(p[i], p[i + K]);
        }
        XR.initSequential();
        NodeWeightsManager nwm = new NodeWeightsManager(XR.getAllPoints());
        for (int i = 0; i < p.length; i++) {
            nwm.setWeight(p[i], rand.nextInt(10));
        }
        IFunctionVR f = new CapacityConstraintViolationsVR(XR, nwm, 50);

        mgr.close();
        mgr.performRemoveOnePoint(p[0]);

        int iter = 0;
        double oldV = 0;
        double newV = 0;
        double delta = 0;
        while (iter < 1000) {
            System.out.println(iter++ + "\n" + XR + "\n");
            //for (int i = 0; i < N; i++) {
            oldV = f.getValue();
            //}
//			int x1 = rand.nextInt(N);
//			int x2 = rand.nextInt(N);
//			int y1 = rand.nextInt(N);
//			int y2 = rand.nextInt(N);
//			int x3 = rand.nextInt(N);
//			int y3 = rand.nextInt(N);
//			int x4 = rand.nextInt(N);
//			int y4 = rand.nextInt(N);
//			while (!XR.checkPerformAddRemovePoints(p[x1], p[x2], p[x3])) {
//				x1 = rand.nextInt(N);
//				y1 = rand.nextInt(N);
//				x2 = rand.nextInt(N);
//				y2 = rand.nextInt(N);
//				x3 = rand.nextInt(N);
//				y3 = rand.nextInt(N);
//				x4 = rand.nextInt(N);
//				y4 = rand.nextInt(N);
//			}
//
//			System.out.println(p[x1] + " " + p[y1] + " " );
//			//for (int i = 0; i < N; i++) {
//				delta = f.evaluateAddRemovePoints(p[x1], p[x2], p[x3]);
//			//}
//			mgr.performAddRemovePoints(p[x1], p[x2], p[x3]);
//			//for (int i = 0; i < N; i++) {
//				newV = f.getValue();
//			//}
            ArrayList<Point> x = new ArrayList<Point>();
            ArrayList<Point> y = new ArrayList<Point>();
            int count = rand.nextInt(5) + 5;
            for (int i = 0; i < count; i++) {
                x.add(p[rand.nextInt(N)]);
                if (rand.nextInt(5) == 0) {
                    y.add(CBLSVR.NULL_POINT);
                } else {
                    y.add(p[rand.nextInt(N)]);
                }
            }
            while (!XR.checkPerformKPointsMove(x, y)) {
                x.clear();
                y.clear();
                count = rand.nextInt(5) + 5;
                for (int i = 0; i < count; i++) {
                    x.add(p[rand.nextInt(N)]);
                    if (rand.nextInt(5) == 0) {
                        y.add(CBLSVR.NULL_POINT);
                    } else {
                        y.add(p[rand.nextInt(N)]);
                    }
                }
            }
            System.out.println(count);
            for (int i = 0; i < count; i++) {
                System.out.println(x.get(i) + " " + y.get(i));
            }
            //for (int i = 0; i < N; i++) {
            delta = f.evaluateKPointsMove(x, y);
            //}
            mgr.performKPointsMove(x, y);
            //for (int i = 0; i < N; i++) {
            newV = f.getValue();
            //}
            System.out.println(XR + " " + f);
            //for (int i = 0; i < N; i++) {
            if (Math.abs(oldV + delta - newV) > 1e-6) {
                System.out.println("WTFFFFFFFFFFFFFFFFFFF " + " "
                        + oldV + " " + delta + " " + newV);
                System.exit(-1);
            }
            //}
        }
        System.out.println("Okkkkkkkkkkkkkk");
    }



}
class ConstraintViolationsVR implements IFunctionVR {

    private IConstraintVR cstr;
    public ConstraintViolationsVR(IConstraintVR constraint){
        this.cstr = constraint;
    }


    public void initPropagation() {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        // DO NOTHING
    }


    public String name() {
        // TODO Auto-generated method stub
        return "ConstraintViolations";
    }


    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return cstr.getVRManager();
    }


    public double getValue() {
        // TODO Auto-generated method stub
        return cstr.violations();
    }

    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    public double evaluateTwoOptMoveOneRoute(Point x, Point y) {
        System.out.println(name() + "::evaluateTwoOptMoveOneRoute NOT IMPEMENTED YET");
        System.exit(-1);
        return 0;
    }

    public double evaluateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateOnePointMove(x, y);
    }


    public double evaluateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoPointsMove(x, y);
    }


    public double evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove1(x, y);
    }


    public double evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove2(x, y);
    }


    public double evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove3(x, y);
    }


    public double evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove4(x, y);
    }


    public double evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove5(x, y);
    }


    public double evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove6(x, y);
    }


    public double evaluateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove7(x, y);
    }


    public double evaluateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoOptMove8(x, y);
    }


    public double evaluateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateOrOptMove1(x1, x2, y);
    }


    public double evaluateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateOrOptMove2(x1, x2, y);
    }


    public double evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove1(x, y, z);
    }


    public double evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove2(x, y, z);
    }


    public double evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove3(x, y, z);
    }


    public double evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove4(x, y, z);
    }


    public double evaluateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove5(x, y, z);
    }


    public double evaluateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove6(x, y, z);
    }


    public double evaluateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove7(x, y, z);
    }


    public double evaluateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreeOptMove8(x, y, z);
    }


    public double evaluateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        return cstr.evaluateCrossExchangeMove(x1, y1, x2, y2);
    }

    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        System.out.println(name() + "::propagateTwoOptMoveOneRoute NOT IMPLEMENTED YET");
        System.exit(-1);
    }

    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub

    }


    public void propagateThreePointsMove(Point x1, Point x2, Point x3, Point y1,
                                         Point y2, Point y3) {
        // TODO Auto-generated method stub

    }


    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4, Point y1,
                                        Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub

    }


    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub

    }


    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub

    }

    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        System.out.println("ConstraintViolationsVR::propagateAddTwoPoints HAS NOT BEEN IMPLEMENTED YET");
        System.exit(-1);
    }


    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        System.out.println("ConstraintViolationsVR::propagateRemoveTwoPoints HAS NOT BEEN IMPLEMENTED YET");
        System.exit(-1);
    }

    public double evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        return cstr.evaluateTwoPointsMove(x1, x2, y1, y2);
    }


    public double evaluateThreePointsMove(Point x1, Point x2, Point x3, Point y1,
                                          Point y2, Point y3) {
        // TODO Auto-generated method stub
        return cstr.evaluateThreePointsMove(x1, x2, x3, y1, y2, y3);
    }


    public double evaluateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                         Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        return cstr.evaluateFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4);
    }


    public double evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        return cstr.evaluateAddOnePoint(x, y);
    }


    public double evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        return cstr.evaluateRemoveOnePoint(x);
    }

    public double evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        return cstr.evaluateAddTwoPoints(x1, y1, x2, y2);
    }


    public double evaluateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        return cstr.evaluateRemoveTwoPoints(x1, x2);
    }

    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }


    public double evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return cstr.evaluateAddRemovePoints(x, y, z);
    }


    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub

    }


    public double evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        return cstr.evaluateKPointsMove(x, y);
    }
}
class FEarliestArrivalTimeVR implements IFunctionVR {
    VarRoutesVR XR;
    EarliestArrivalTimeVR eat;
    HashMap<Point, Integer> earliestAllowedArrivalTime;
    HashMap<Point, Integer> serviceDuration;
    double earliestArrivalTime;
    HashMap<Point,Point> t_next;
    Point calPoint;
    public FEarliestArrivalTimeVR(EarliestArrivalTimeVR eat, Point v){
        this.XR = eat.getVarRouteVR();
        this.eat = eat;
        earliestAllowedArrivalTime = eat.getEarliestAllowedArrivalTime();
        serviceDuration = eat.getServiceDuration();
        earliestArrivalTime = 0;
        t_next = new HashMap<Point,Point>();
        this.calPoint = v;
        getVRManager().post(this);
    }
    @Override
    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return XR.getVRManager();
    }

    @Override
    public void initPropagation() {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
        t_next = new HashMap<Point,Point>();
    }

    @Override
    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2,
                                           Point y2) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateThreePointsMove(Point x1, Point x2, Point x3,
                                         Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                        Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        //System.out.println("FEarliestArrivalTimeVR::propagateRemoveTwoPoints HAS NOT BEEN IMPLEMENTED YET");
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        //System.out.println("FEarliestArrivalTimeVR::propagateRemoveTwoPoints HAS NOT BEEN IMPLEMENTED YET");
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        return "FEaliestArrivalTimeVR";
    }

    @Override
    public double getValue() {
        // TODO Auto-generated method stub
        return earliestArrivalTime;
    }

    void getSegment(Point begin,Point end)
    {
        Point v = begin;
        while(v!=end)
        {
            t_next.put(v , XR.next(v));
            v = XR.next(v);
        }
    }
    void getRevSegment(Point begin,Point end)
    {
        Point v = begin;
        while(v!=end)
        {
            //System.out.println(v);
            t_next.put(v , XR.prev(v));
            v = XR.prev(v);
        }
    }


    double calDeltaSegment(Point begin,Point end)
    {
        //System.out.println("start cal delta");

        Point v = begin;
        int delta = 0;
        double dt = eat.getEarliestArrivalTime(v)
                + eat.getServiceDuration(v);

        while (v != end) {
            //System.out.println(v);
            Point nv = t_next.get(v);
            double at = dt + eat.getTravelTime(v,nv);
            if(at < eat.getEarliestAllowedArrivalTime(nv))
                at = eat.getEarliestAllowedArrivalTime(nv);
            if(nv==calPoint)
                return at - earliestArrivalTime;
            dt = at + eat.getServiceDuration(nv);
            v = nv;
        }
        return 0;
    }
    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    public double evaluateTwoOptMoveOneRoute(Point x, Point y) {
        System.out.println(name() + "::evaluateTwoOptMoveOneRoute NOT IMPEMENTED YET");
        System.exit(-1);
        return 0;
    }


    // move of type a [Groer et al., 2010]
    // move customer x to from route of x to route of y; insert x into the position between y and next[y]
    // x and y are not the depot
    @Override
    public double evaluateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x);
        int ky = XR.route(y);
        int kv = XR.route(calPoint);
        if(kv!=kx&&kv!=ky)
            return 0;
        if(kx==ky)
        {
            Point v,nv;
            if (XR.getIndex(x) < XR.getIndex(y)) {
                v = XR.prev(x);
                nv = XR.next(x);
                t_next.put(v,nv);
                getSegment(nv, y);
                t_next.put(y,x);
                t_next.put(x,XR.next(y));
                getSegment(XR.next(y), XR.getTerminatingPointOfRoute(kx));
                v = XR.prev(x);
            } else {
                v = y;
                t_next.put(v, x);
                t_next.put(x, XR.next(v));
                if(y!= XR.prev(x))
                    getSegment(XR.next(y), XR.prev(x));
                t_next.put(XR.prev(x),XR.next(x));
                getSegment(XR.next(v),XR.getTerminatingPointOfRoute(kx));
                v = XR.prev(y);
            }
            double dt = eat.getEarliestArrivalTime(v)
                    + eat.getServiceDuration(v);
            while (v != XR.getTerminatingPointOfRoute(kx)) {
                nv = t_next.get(v);
                double at = dt + eat.getTravelTime(v,nv);
                if(at < eat.getEarliestAllowedArrivalTime(nv))
                {
                    at = eat.getEarliestAllowedArrivalTime(nv);
                }
                if(nv == calPoint)
                    return at - earliestArrivalTime;
                dt = at + eat.getServiceDuration(nv);
                v = nv;
            }
            return 0;
        }
        else{
            Point v,nv;
            if(kx == kv)
            {
                v = XR.prev(x);
                double dt = eat.getEarliestArrivalTime(v)
                        + eat.getServiceDuration(v);
                nv = XR.next(x);
                double at = dt + eat.getTravelTime(v, nv);
                if(at < eat.getEarliestAllowedArrivalTime(nv))
                    at = eat.getEarliestAllowedArrivalTime(nv);
                if(nv == calPoint)
                    return at - earliestArrivalTime;
                v = nv;
                while(v!=XR.getTerminatingPointOfRoute(kx))
                {
                    nv = XR.next(v);
                    at = at + eat.getServiceDuration(v) + eat.getTravelTime(v, nv);
                    if(at < eat.getEarliestAllowedArrivalTime(nv))
                        at = eat.getEarliestAllowedArrivalTime(nv);
                    if(nv == calPoint)
                        return at - earliestArrivalTime;
                    v = nv;
                }
                return 0;
            }
            else{
                v = y;
                double dt = eat.getEarliestArrivalTime(v)
                        + eat.getServiceDuration(v);
                nv = x;
                double at = dt + eat.getTravelTime(v, nv);
                if(at < eat.getEarliestAllowedArrivalTime(nv))
                    at = eat.getEarliestAllowedArrivalTime(nv);
                if(x == calPoint)
                    return at - earliestArrivalTime;
                v = nv;
                nv = XR.next(y);
                at = dt + eat.getTravelTime(v, nv);
                if(at < eat.getEarliestAllowedArrivalTime(nv))
                    at = eat.getEarliestAllowedArrivalTime(nv);
                if(x == calPoint)
                    return at - earliestArrivalTime;
                v = nv;
                while(v!=XR.getTerminatingPointOfRoute(ky))
                {
                    nv = XR.next(v);
                    at = at + eat.getServiceDuration(v) + eat.getTravelTime(v, nv);
                    if(at < eat.getEarliestAllowedArrivalTime(nv))
                        at = eat.getEarliestAllowedArrivalTime(nv);
                    if(nv == calPoint)
                        return at - earliestArrivalTime;
                    v = nv;
                }
                return 0;
            }

        }
    }
    // move of type b [Groer et al., 2010]
    // x and y are on the same route and are not the depots, y locates before x on the route
    // remove (prev[x],x) and (x,next[x]) and (prev[y], y) and (y, next(y)
    // insert (x,prev[y]) and (next[y],x) and (next[x],y) and (y, prev[x])
    @Override
    public double evaluateTwoPointsMove(Point x, Point y) {
        int kx = XR.route(x);
        int ky = XR.route(y);
        int kv = XR.route(calPoint);
        if(kv!=kx || kv != ky)
            return 0;
        if(XR.index(x) > XR.index(y))
        {
            Point tmp = x;
            x = y;
            y = tmp;
        }
        if(XR.next(x) == y)
        {
            t_next.put(y, x);
            t_next.put(x, XR.next(y));
            getSegment(XR.next(y), XR.endPoint(kx));
            return calDeltaSegment(y, XR.endPoint(kx));
        }
        else{
            Point px = XR.prev(x);
            Point nx = XR.next(x);
            Point py = XR.prev(y);
            Point ny = XR.next(y);
            t_next.put(px, y);
            t_next.put(y, nx);
            t_next.put(py, x);
            t_next.put(x, ny);
            getSegment(nx, py);
            getSegment(ny, XR.endPoint(kx));
            return calDeltaSegment(px, XR.endPoint(kx));
        }
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,y) and (next[x],next(y))
    @Override
    public double evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub

        int kx = XR.route(x);
        int ky = XR.route(y);
        int kv = XR.route(calPoint);
        if(kx!=kv&&ky!=kv)
            return 0;
        Point nx = XR.next(x);
        Point ny = XR.next(y);

        t_next.put(x,y);

        getRevSegment(y,XR.getStartingPointOfRoute(ky));


        t_next.put(nx,ny);
        getRevSegment(XR.getTerminatingPointOfRoute(kx),nx);
        getSegment(ny,XR.getTerminatingPointOfRoute(ky));

        int delta  = 0;

        delta += calDeltaSegment(x, XR.getStartingPointOfRoute(ky));
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(kx), XR.getTerminatingPointOfRoute(ky));

        return delta;
    }

    @Override
    public double evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x);
        int ky = XR.route(y);
        int kv = XR.route(calPoint);
        if(kx!=kv&&ky!=kv)
            return 0;
        Point nx = XR.next(x);
        Point ny = XR.next(y);

        t_next.put(y, x);

        getRevSegment(x,XR.getStartingPointOfRoute(kx));


        t_next.put(nx,ny);
        getRevSegment(XR.getTerminatingPointOfRoute(kx),nx);
        getSegment(ny,XR.getTerminatingPointOfRoute(ky));

        int delta  = 0;

        delta += calDeltaSegment(y, XR.getStartingPointOfRoute(kx));
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(kx), XR.getTerminatingPointOfRoute(ky));

        return delta;
    }

    @Override
    public double evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x);
        int ky = XR.route(y);
        int kv = XR.route(calPoint);
        if(kx!=kv&&ky!=kv)
            return 0;
        Point nx = XR.next(x);
        Point ny = XR.next(y);

        t_next.put(x,y);

        getRevSegment(y,XR.getStartingPointOfRoute(ky));


        t_next.put(ny, nx);
        getRevSegment(XR.getTerminatingPointOfRoute(ky),ny);
        getSegment(nx,XR.getTerminatingPointOfRoute(kx));

        int delta  = 0;

        delta += calDeltaSegment(x, XR.getStartingPointOfRoute(ky));
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(ky), XR.getTerminatingPointOfRoute(kx));

        return delta;
    }

    @Override
    public double evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x);
        int ky = XR.route(y);
        int kv = XR.route(calPoint);
        if(kx!=kv&&ky!=kv)
            return 0;
        Point nx = XR.next(x);
        Point ny = XR.next(y);

        t_next.put(y, x);

        getRevSegment(x,XR.getStartingPointOfRoute(kx));


        t_next.put(ny,nx);
        getRevSegment(XR.getTerminatingPointOfRoute(ky),ny);

        getSegment(nx,XR.getTerminatingPointOfRoute(kx));

        int delta  = 0;
        delta += calDeltaSegment(y, XR.getStartingPointOfRoute(kx));
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(ky), XR.getTerminatingPointOfRoute(kx));

        return delta;
    }

    @Override
    public double evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x);
        int ky = XR.route(y);
        int kv = XR.route(calPoint);
        if(kx!=kv&&ky!=kv)
            return 0;
        Point nx = XR.next(x);
        Point ny = XR.next(y);

        t_next.put(x, ny);

        getSegment(ny,XR.getTerminatingPointOfRoute(ky));


        t_next.put(y, nx);
        //getRevSegment(XR.getTerminatingPointOfRoute(ky),ny);
        getSegment(nx,XR.getTerminatingPointOfRoute(kx));

        int delta  = 0;
        delta += calDeltaSegment(y, XR.getTerminatingPointOfRoute(kx));
        delta += calDeltaSegment(x, XR.getTerminatingPointOfRoute(ky));

        return delta;
    }

    @Override
    public double evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x);
        int ky = XR.route(y);

        int kv = XR.route(calPoint);
        if(kx!=kv&&ky!=kv)
            return 0;
        Point nx = XR.next(x);
        Point ny = XR.next(y);

        t_next.put(ny, x);

        getRevSegment(x,XR.getStartingPointOfRoute(kx));
        getRevSegment(XR.getTerminatingPointOfRoute(ky),ny);

        t_next.put(y, nx);
        getSegment(nx,XR.getTerminatingPointOfRoute(kx));


        int delta  = 0;
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(ky), XR.getStartingPointOfRoute(kx));
        delta += calDeltaSegment(nx,XR.getTerminatingPointOfRoute(kx));

        return delta;
    }

    @Override
    public double evaluateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x);
        int ky = XR.route(y);
        int kv = XR.route(calPoint);
        if(kx!=kv&&ky!=kv)
            return 0;
        Point nx = XR.next(x);
        Point ny = XR.next(y);

        t_next.put(x, ny);

        getSegment(ny,XR.getTerminatingPointOfRoute(ky));

        t_next.put(nx, y);
        getRevSegment(XR.getTerminatingPointOfRoute(kx),nx);
        getRevSegment(y,XR.getStartingPointOfRoute(ky));

        int delta  = 0;
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(kx), XR.getStartingPointOfRoute(ky));
        delta += calDeltaSegment(x, XR.getTerminatingPointOfRoute(ky));

        return delta;
    }

    @Override
    public double evaluateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x);
        int ky = XR.route(y);
        int kv = XR.route(calPoint);
        if(kx!=kv&&ky!=kv)
            return 0;
        Point nx = XR.next(x);
        Point ny = XR.next(y);

        t_next.put(ny, x);

        getRevSegment(x,XR.getStartingPointOfRoute(kx));
        getRevSegment(XR.getTerminatingPointOfRoute(ky),ny);

        t_next.put(nx, y);
        getRevSegment(XR.getTerminatingPointOfRoute(kx),nx);
        getRevSegment(y,XR.getStartingPointOfRoute(ky));


        int delta  = 0;
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(kx),XR.getStartingPointOfRoute(ky));
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(ky),XR.getStartingPointOfRoute(kx));

        return delta;
    }

    @Override
    public double evaluateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x1);
        int ky = XR.route(y);
        int kv = XR.route(calPoint);
        if(kx!=kv&&ky!=kv)
            return 0;
        Point px1 = XR.prev(x1);
        Point nx2 = XR.next(x2);
        Point ny = XR.next(y);

        t_next.put(px1,nx2);
        getSegment(nx2, XR.getTerminatingPointOfRoute(kx));

        t_next.put(y, x1);
        getSegment(x1,x2);
        t_next.put(x2,ny);
        getSegment(ny,XR.getTerminatingPointOfRoute(ky));

        int delta  = 0;
        delta += calDeltaSegment(px1, XR.getTerminatingPointOfRoute(kx));
        delta += calDeltaSegment(y, XR.getTerminatingPointOfRoute(ky));

        return delta;
    }

    @Override
    public double evaluateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        int kx = XR.route(x1);
        int ky = XR.route(y);
        int kv = XR.route(calPoint);
        if(kx!=kv&&ky!=kv)
            return 0;
        Point px1 = XR.prev(x1);
        Point nx2 = XR.next(x2);
        Point ny = XR.next(y);

        t_next.put(px1, nx2);
        getSegment(nx2, XR.getTerminatingPointOfRoute(kx));

        t_next.put(y, x2);
        getRevSegment(x2,x1);
        t_next.put(x1, ny);
        getSegment(ny,XR.getTerminatingPointOfRoute(ky));

        int delta  = 0;
        delta += calDeltaSegment(px1, XR.getTerminatingPointOfRoute(kx));
        delta += calDeltaSegment(y, XR.getTerminatingPointOfRoute(ky));

        return delta;
    }

    @Override
    public double evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int k = XR.route(x);
        int kv = XR.route(calPoint);
        if(k!=kv)
            return 0;
        Point nx = XR.next(x);
        Point ny = XR.next(y);
        Point nz = XR.next(z);


        t_next.put(x,z);
        getRevSegment(z,ny);
        t_next.put(ny,nx);
        getSegment(nx,y);
        t_next.put(y,nz);
        getSegment(nz,XR.getTerminatingPointOfRoute(k));

        int delta  = 0;
        delta += calDeltaSegment(x, XR.getTerminatingPointOfRoute(k));
        return delta;
    }

    @Override
    public double evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int k = XR.route(x);
        int kv = XR.route(calPoint);
        if(k!=kv)
            return 0;
        Point nx = XR.next(x);
        Point ny = XR.next(y);
        Point nz = XR.next(z);


        getRevSegment(XR.getTerminatingPointOfRoute(k),nz);
        t_next.put(nz, y);
        getRevSegment(y,nx);
        t_next.put(nx,ny);
        getSegment(ny,z);
        t_next.put(z, x);
        getRevSegment(x,XR.getStartingPointOfRoute(k));

        int delta  = 0;
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(k), XR.getStartingPointOfRoute(k));
        return delta;
    }

    @Override
    public double evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int k = XR.route(x);
        int kv = XR.route(calPoint);
        if(k!=kv)
            return 0;
        Point nx = XR.next(x);
        Point ny = XR.next(y);
        Point nz = XR.next(z);


        t_next.put(x,y);
        getRevSegment(y,nx);
        t_next.put(nx, z);
        getRevSegment(z,ny);
        t_next.put(ny,nz);
        getSegment(nz,XR.getTerminatingPointOfRoute(k));

        int delta  = 0;
        delta += calDeltaSegment(x, XR.getTerminatingPointOfRoute(k));

        return delta;
    }

    @Override
    public double evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int k = XR.route(x);
        int kv = XR.route(calPoint);
        if(k!=kv)
            return 0;
        Point nx = XR.next(x);
        Point ny = XR.next(y);
        Point nz = XR.next(z);


        getRevSegment(XR.getTerminatingPointOfRoute(k),nz);
        t_next.put(nz,ny);
        getSegment(ny,z);
        t_next.put(z, nx);
        getSegment(nx,y);
        t_next.put(y,x);
        getRevSegment(x,XR.getStartingPointOfRoute(k));

        int delta  = 0;
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(k), XR.getStartingPointOfRoute(k));

        return delta;
    }

    @Override
    public double evaluateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int k = XR.route(x);
        int kv = XR.route(calPoint);
        if(k!=kv)
            return 0;
        Point nx = XR.next(x);
        Point ny = XR.next(y);
        Point nz = XR.next(z);

        t_next.put(x, ny);
        getSegment(ny,z);
        t_next.put(z,nx);
        getSegment(nx,y);
        t_next.put(y,nz);
        getSegment(nz,XR.getTerminatingPointOfRoute(k));

        int delta  = 0;
        delta += calDeltaSegment(x, XR.getTerminatingPointOfRoute(k));

        return delta;
    }

    @Override
    public double evaluateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int k = XR.route(x);
        int kv = XR.route(calPoint);
        if(k!=kv)
            return 0;
        Point nx = XR.next(x);
        Point ny = XR.next(y);
        Point nz = XR.next(z);

        getRevSegment(XR.getTerminatingPointOfRoute(k),nz);
        t_next.put(nz, y);
        getRevSegment(y,nx);
        t_next.put(nx, z);
        getRevSegment(z,ny);
        t_next.put(ny, x);
        getRevSegment(x,XR.getStartingPointOfRoute(k));

        int delta  = 0;
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(k), XR.getStartingPointOfRoute(k));

        return delta;
    }

    @Override
    public double evaluateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int k = XR.route(x);
        int kv = XR.route(calPoint);
        if(k!=kv)
            return 0;
        Point nx = XR.next(x);
        Point ny = XR.next(y);
        Point nz = XR.next(z);

        t_next.put(x, ny);
        getSegment(ny,z);
        t_next.put(z,y);
        getRevSegment(y,nx);
        t_next.put(nx, nz);
        getSegment(nz,XR.getTerminatingPointOfRoute(k));

        int delta  = 0;
        delta += calDeltaSegment(x, XR.getTerminatingPointOfRoute(k));

        return delta;
    }

    @Override
    public double evaluateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int k = XR.route(x);
        int kv = XR.route(calPoint);
        if(k!=kv)
            return 0;
        Point nx = XR.next(x);
        Point ny = XR.next(y);
        Point nz = XR.next(z);

        getRevSegment(XR.getTerminatingPointOfRoute(k),nz);
        t_next.put(nz, nx);
        getSegment(nx,y);
        t_next.put(y, z);
        getRevSegment(z,ny);
        t_next.put(ny, x);
        getRevSegment(x,XR.getStartingPointOfRoute(k));

        int delta  = 0;
        delta += calDeltaSegment(XR.getTerminatingPointOfRoute(k), XR.getStartingPointOfRoute(k));

        return delta;
    }

    @Override
    public double evaluateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        Point nx1 = XR.next(x1);
        Point ny1 = XR.next(y1);
        Point nx2 = XR.next(x2);
        Point ny2 = XR.next(y2);
        int k1 = XR.route(x1);
        int k2 = XR.route(x2);
        int kv = XR.route(calPoint);
        if(k1!=kv&&k2!=kv)
            return 0;
        t_next.put(x1, nx2);
        getSegment(nx2, y2);
        t_next.put(y2,ny1);
        getSegment(ny1, XR.getTerminatingPointOfRoute(k1));

        t_next.put(x2, nx1);
        getSegment(nx1, y1);
        t_next.put(y1, ny2);
        getSegment(ny2, XR.getTerminatingPointOfRoute(k2));

        int delta  = 0;
        delta += calDeltaSegment(x1, XR.getTerminatingPointOfRoute(k1));
        delta += calDeltaSegment(x2, XR.getTerminatingPointOfRoute(k2));

        return delta;
    }

    // remove x1, x2 from their current routes
    // x1 , x2 in same route , index x1 < index x2
    // y1, y2 in same route , index y1 < index y2
    // route of x1 != route of y1
    // re-insert x1 between y1 and next[y1]
    // re-insert x2 between y2 and next[y2]
    @Override
    public double evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        int k1 = XR.route(x1);
        int k2 = XR.route(y1);
        int kv = XR.route(calPoint);
        if(k1!=kv&&k2!=kv)
            return 0;
        Point px1 = XR.prev(x1);
        Point nx1 = XR.next(x1);
        Point px2 = XR.prev(x2);
        Point nx2 = XR.next(x2);
        Point ny1 = XR.next(y1);
        Point ny2 = XR.next(y2);

        //System.out.println(x1.getID()+" "+x2.getID()+" "+y1.getID()+" "+y2.getID());
        if(nx1 == x2)
        {
            t_next.put(px1, nx2);
            getSegment(nx2, XR.getTerminatingPointOfRoute(k1));
        }
        else{
            t_next.put(px1, nx1);
            getSegment(nx1, px2);
            t_next.put(px2, nx2);
            getSegment(nx2, XR.getTerminatingPointOfRoute(k1));
        }
        t_next.put(y1, x1);
        t_next.put(x1,ny1);
        getSegment(ny1, y2);
        t_next.put(y2, x2);
        t_next.put(x2, ny2);
        getSegment(ny2, XR.getTerminatingPointOfRoute(k2));
        int delta = 0;

        delta += calDeltaSegment(px1, XR.getTerminatingPointOfRoute(k1));
        delta += calDeltaSegment(y1, XR.getTerminatingPointOfRoute(k2));
        //System.out.println("delta = "+delta);
        return delta;
    }

    @Override
    public double evaluateThreePointsMove(Point x1, Point x2, Point x3, Point y1,
                                          Point y2, Point y3) {
        // TODO Auto-generated method stub
        ArrayList<Point> x = new ArrayList<Point>();
        ArrayList<Point> y = new ArrayList<Point>();
        x.add(x1);
        x.add(x2);
        x.add(x3);
        y.add(y1);
        y.add(y2);
        y.add(y3);
        return evaluateKPointsMove(x, y);
    }

    @Override
    public double evaluateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                         Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        ArrayList<Point> x = new ArrayList<Point>();
        ArrayList<Point> y = new ArrayList<Point>();
        x.add(x1);
        x.add(x2);
        x.add(x3);
        y.add(y1);
        y.add(y2);
        y.add(y3);
        return evaluateKPointsMove(x, y);
    }

    @Override
    public double evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        int k = XR.route(y);
        int kv = XR.route(calPoint);
        if(k!=kv)
            return 0;
        Point ny = XR.next(y);
        t_next.put(y, x);
        t_next.put(x, ny);
        getSegment(ny, XR.getTerminatingPointOfRoute(k));
        int delta = 0;

        delta += calDeltaSegment(y, XR.getTerminatingPointOfRoute(k));
        return delta;
    }

    @Override
    public double evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        int k = XR.route(x);
        int kv = XR.route(calPoint);
        if(k!=kv)
            return 0;
        Point px = XR.prev(x);
        Point nx = XR.next(x);
        t_next.put(px,nx);
        getSegment(nx, XR.getTerminatingPointOfRoute(k));

        return calDeltaSegment(px, XR.getTerminatingPointOfRoute(k));
    }
    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        System.out.println(name() + "::propagateTwoOptMoveOneRoute NOT IMPLEMENTED YET");
        System.exit(-1);
    }

    @Override
    public double evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        int k = XR.route(y1);
        int kv = XR.route(calPoint);
        if(k!=kv){
            System.out.println("FEarliestArrivalTimeVR::evaluateAddTwoPoints calPoint and y1 and y2 are not on the same route");
            return 0;
        }
        Point ny1 = XR.next(y1);
        t_next.put(y1, x1);
        if(y1 != y2){
            t_next.put(x1, ny1);
            getSegment(ny1, y2);
            Point ny2 = XR.next(y2);
            t_next.put(y2, x2);
            t_next.put(x2, ny2);
            getSegment(ny2, XR.getTerminatingPointOfRoute(k));
        }
        else{
            t_next.put(x1, x2);
            t_next.put(x2, ny1);
            getSegment(ny1, XR.getTerminatingPointOfRoute(k));
        }

        return calDeltaSegment(y1, XR.getTerminatingPointOfRoute(k));
    }

    @Override
    public double evaluateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        int k = XR.route(x1);
        int kv = XR.route(calPoint);
        if(k!=kv){
            System.out.println("FEarliestArrivalTimeVR::evaluateAddTwoPoints calPoint and y1 and y2 are not on the same route");
            return 0;
        }

        Point px1 = XR.prev(x1);
        Point nx1 = XR.next(x1);
        Point px2 = XR.prev(x2);
        Point nx2 = XR.next(x2);
        if(x2 == nx1){
            t_next.put(px1, nx2);
            getSegment(nx2, XR.getTerminatingPointOfRoute(k));
        }
        else{
            t_next.put(px1, nx1);
            getSegment(nx1, px2);
            t_next.put(px2, nx2);
            getSegment(nx2, XR.getTerminatingPointOfRoute(k));
        }

        return calDeltaSegment(px1, XR.getTerminatingPointOfRoute(k));
    }

    @Override
    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        earliestArrivalTime = eat.getEarliestArrivalTime(calPoint);
    }
    private double evaluateDeltaRoute(int k,Set<Point>out,ArrayList<Point>in,ArrayList<Point>preIn)
    {
        Point s = XR.getStartingPointOfRoute(k);
        Point pre = s;
        while(!XR.isTerminatingPoint(s))
        {
            Point ns = XR.next(s);
            if(!out.contains(ns))
            {
                t_next.put(pre, ns);
                pre = ns;
            }
            s = ns;
        }
        for(int i = 0; i < in.size(); ++i)
        {
            Point inp = in.get(i);
            Point preP = preIn.get(i);
            Point nex = t_next.get(preP);
            t_next.put(preP, inp);
            t_next.put(inp, nex);
        }
        Point v = XR.getStartingPointOfRoute(k);
        double dt = eat.getEarliestArrivalTime(v)
                + eat.getServiceDuration(v);

        while (v != XR.endPoint(k)) {
            //System.out.println(v);
            Point nv = t_next.get(v);
            double at = dt + eat.getTravelTime(v,nv);
            dt = (at < eat.getEarliestAllowedArrivalTime(nv) ? eat
                    .getEarliestAllowedArrivalTime(nv) : at )
                    + eat.getServiceDuration(nv);
            if(nv == calPoint )
                return dt - earliestArrivalTime;
            v = nv;
        }
        return 0;
    }
    @Override
    public double evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        for(int i = 0; i < x.size(); ++i)
        {
            if(x.get(i) == calPoint)
                if(y.get(i)==CBLSVR.NULL_POINT)
                    return -earliestArrivalTime;
        }
        HashMap<Integer,Set<Point>> mout= new HashMap<Integer,Set<Point>>();
        HashMap<Integer,ArrayList<Point>> min = new HashMap<Integer,ArrayList<Point>>();
        HashMap<Integer,ArrayList<Point>> mPrein = new HashMap<Integer,ArrayList<Point>>();
        Set<Integer> sk = new HashSet<Integer>();
        for(int i=0;i<x.size();++i)
        {
            Point px = x.get(i);
            Point py = y.get(i);
            int kx = 0;
            if(XR.contains(px))
            {
                kx = XR.route(px);
                sk.add(kx);
                if(mout.containsKey(kx))
                {
                    mout.get(kx).add(px);
                }
                else{
                    Set<Point> o = new HashSet<Point>();
                    o.add(px);
                    mout.put(kx, o);
                }
            }
            if(XR.contains(py))
            {
                int ky = XR.route(py);
                sk.add(ky);
                if(min.containsKey(ky))
                {
                    min.get(ky).add(px);
                    mPrein.get(ky).add(py);
                }
                else{
                    ArrayList<Point>tin = new ArrayList<Point>();
                    tin.add(px);
                    ArrayList<Point>tprein = new ArrayList<Point>();
                    tprein.add(py);
                    min.put(ky, tin);
                    mPrein.put(ky, tprein);
                }
            }
        }
        int delta = 0;
        for(int k : sk)
        {
            Set<Point>out = new HashSet<Point>();
            ArrayList<Point> in = new ArrayList<Point>();
            ArrayList<Point> prein = new ArrayList<Point>();
            if(mout.containsKey(k))
                out = mout.get(k);
            if(min.containsKey(k))
            {
                in = min.get(k);
                prein = mPrein.get(k);
            }
            delta += evaluateDeltaRoute(k, out, in, prein);
        }
        return delta;
    }
    @Override
    public double evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int kx = XR.route(x);
        int kz = XR.route(z);
        int kv = XR.route(calPoint);
        if(kx!=kv&&kz!=kv)
            return 0;
        if(kx!=kz)
        {
            if(kx==kv)
            {
                Point px = XR.prev(x);
                t_next.put(px, XR.next(x));
                getSegment(XR.next(x), XR.endPoint(kx));
                return calDeltaSegment(px, XR.endPoint(kx));
            }
            else{
                t_next.put(z, y);
                Point nz = XR.next(z);
                t_next.put(y, nz);
                getSegment(nz, XR.endPoint(XR.route(z)));
                return calDeltaSegment(z, XR.endPoint(kz));
            }
        }
        else{
            if(XR.getIndex(x) < XR.getIndex(z))
            {
                Point px = XR.prev(x);
                t_next.put(px, XR.next(x));
                getSegment(XR.next(x), XR.endPoint(kx));

                t_next.put(z, y);
                Point nz = XR.next(z);
                t_next.put(y, nz);
                getSegment(nz, XR.endPoint(XR.route(z)));
                return calDeltaSegment(px, XR.endPoint(kx));
            }
            else{


                t_next.put(z, y);
                Point nz = XR.next(z);
                t_next.put(y, nz);
                getSegment(nz, XR.endPoint(XR.route(z)));
                Point px = XR.prev(x);
                t_next.put(px, XR.next(x));
                getSegment(XR.next(x), XR.endPoint(kx));
                return calDeltaSegment(z, XR.endPoint(kx));
            }
        }
    }

}
class IndexOnRoute implements IFunctionVR {

    private Point v;
    private VarRoutesVR XR;
    private VRManager mgr;

    public IndexOnRoute(VarRoutesVR XR, Point v) {
        // / semantic: index of point v on its route
        this.XR = XR;
        this.v = v;
        post();
    }

    private void post() {
        mgr = XR.getVRManager();
        mgr.post(this);
    }

    public String name() {
        return "IndexOnRoute";
    }

    // compute the sum of demands from points s -> t on the route containing s
    // and t
    private double calc(Point s, Point t) {
        if (XR.route(s) != XR.route(t)) {
            System.out.println(name() + "::calc(" + s + "," + t
                    + ") EXCEPTION, " + s + " and " + t
                    + " are not the the same route");
            mgr.exit(-1);
        }
        if (XR.isBefore(t, s)) { // if (XR.index(s] > XR.index(t]) {
            return calc(t, s);
        }
        return XR.index(t) - XR.index(XR.prev(s));
    }

    public void initPropagation() {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2,
                                           Point y2) {
        // TODO Auto-generated method stub
        // DO NOTHING, this was done by accWN before
    }

    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return mgr;
    }

    public double getValue() {
        // TODO Auto-generated method stub
        return XR.index(v);
    }

    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    public double evaluateTwoOptMoveOneRoute(Point x, Point y) {
        System.out.println(name()
                + "::evaluateTwoOptMoveOneRoute NOT IMPEMENTED YET");
        System.exit(-1);
        return 0;
    }

    public double evaluateOnePointMove(Point x, Point y) {
        if (!XR.checkPerformOnePointMove(x, y)) {
            System.out.println(name() + ":: Error evaluateOnePointMove: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 1;
        Point[] X = { x };
        Point[] Y = { y };
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            route.add(XR.route(X[i]));
            route.add(XR.route(Y[i]));
        }
        double eval = 0;
        for (int r : route) {
            boolean ok = false;
            ArrayList<Point> xx = new ArrayList<Point>();
            ArrayList<Point> yy = new ArrayList<Point>();
            ArrayList<Point> zz = new ArrayList<Point>();
            for (int i = 0; i < n; i++) {
                if (XR.route(Y[i]) == r) {
                    xx.add(X[i]);
                    yy.add(Y[i]);
                    ok |= X[i] == v;
                }
                if (XR.route(X[i]) == r) {
                    zz.add(X[i]);
                }
            }
            if (ok || XR.route(v) == r) {
                Point[] XX = new Point[xx.size()];
                Point[] YY = new Point[yy.size()];
                Point[] ZZ = new Point[zz.size()];
                for (int i = 0; i < XX.length; i++) {
                    XX[i] = xx.get(i);
                    YY[i] = yy.get(i);
                }
                for (int i = 0; i < ZZ.length; i++) {
                    ZZ[i] = zz.get(i);
                }
                eval += evaluateMove(XX, YY, ZZ);
            }
        }
        return eval;
    }

    public double evaluateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoPointsMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoPointsMove: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.next(x) == y) {
            return evaluateTwoPointsMove(y, x, XR.prev(x), XR.prev(x));
        } else if (XR.next(y) == x) {
            return evaluateTwoPointsMove(x, y, XR.prev(y), XR.prev(y));
        } else {
            return evaluateTwoPointsMove(x, y, XR.prev(y), XR.prev(x));
        }
    }

    public double evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove1: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
                return XR.index(x) + XR.index(y) + 1 - XR.index(v);
            }
            if (XR.isBefore(x, v)) {// XR.index(v] > XR.index(x]) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(x)))
                        - XR.index(v) - 1;
            }
            return 0;
        }
        if (XR.route(y) == XR.route(v)) {
            if (v == XR.getTerminatingPointOfRoute(XR.route(y))) {
                return calc(XR.next(x),
                        XR.getTerminatingPointOfRoute(XR.route(x)))
                        + calc(XR.next(y),
                        XR.getTerminatingPointOfRoute(XR.route(y)))
                        - 1
                        - XR.index(v);
            }
            if (XR.isBefore(y, v)) {// XR.index(v] > XR.index(y]) {
                double newValue = 0;
                newValue += calc(XR.next(x),
                        XR.getTerminatingPointOfRoute(XR.route(x)));
                newValue += calc(XR.next(y), v);
                return newValue - XR.index(v) - 1;
            }
            // System.out.println(XR.index(x] + " + " + calc(y, v) + " - " +
            // XR.index(v]);
            return XR.index(x) + calc(v, y) - XR.index(v);
        }
        return 0;
    }

    public double evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove2: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
                return XR.index(x) + XR.index(y) + 1 - XR.index(v);
            }
            if (XR.isBefore(x, v)) {// XR.index(v] > XR.index(x]) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(x)))
                        - XR.index(v) - 1;
            }
            return XR.index(y) + calc(v, x) - XR.index(v);
        }
        if (XR.route(y) == XR.route(v)) {
            if (v == XR.getTerminatingPointOfRoute(XR.route(y))) {
                return calc(XR.next(x),
                        XR.getTerminatingPointOfRoute(XR.route(x)))
                        + calc(XR.next(y),
                        XR.getTerminatingPointOfRoute(XR.route(y)))
                        - XR.index(v) - 1;
            }
            if (XR.isBefore(y, v)) {// XR.index(v] > XR.index(y]) {
                double newValue = 0;
                newValue += calc(XR.next(x),
                        XR.getTerminatingPointOfRoute(XR.route(x)));
                newValue += calc(XR.next(y), v);
                return newValue - XR.index(v) - 1;
            }
        }
        return 0;
    }

    public double evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove3: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
                return XR.index(x) + XR.index(y) + 1 - XR.index(v);
            }
            if (XR.isBefore(x, v)) {// XR.index(v] > XR.index(x]) {
                double newValue = 0;
                newValue += calc(XR.next(y),
                        XR.getTerminatingPointOfRoute(XR.route(y)));
                newValue += calc(XR.next(x), v);
                return newValue - XR.index(v) - 1;
            }
            return 0;
        }
        if (XR.route(y) == XR.route(v)) {
            if (v == XR.getTerminatingPointOfRoute(XR.route(y))) {
                return calc(XR.next(x),
                        XR.getTerminatingPointOfRoute(XR.route(x)))
                        + calc(XR.next(y),
                        XR.getTerminatingPointOfRoute(XR.route(y)))
                        - XR.index(v) - 1;
            }
            if (XR.isBefore(y, v)) {// XR.index(v] > XR.index(y]) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(y)))
                        - XR.index(v) - 1;
            }
            // System.out.println(XR.index(x] + " + " + calc(y, v) + " - " +
            // XR.index(v]);
            return XR.index(x) + calc(v, y) - XR.index(v);
        }
        return 0;
    }

    public double evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove4: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
                return XR.index(x) + XR.index(y) + 1 - XR.index(v);
            }
            if (XR.isBefore(x, v)) {// XR.index(v] > XR.index(x]) {
                double newValue = 0;
                newValue += calc(XR.next(y),
                        XR.getTerminatingPointOfRoute(XR.route(y)));
                newValue += calc(XR.next(x), v);
                return newValue - XR.index(v) - 1;
            }
            return XR.index(y) + calc(v, x) - XR.index(v);
        }
        if (XR.route(y) == XR.route(v)) {
            if (v == XR.getTerminatingPointOfRoute(XR.route(y))) {
                return calc(XR.next(x),
                        XR.getTerminatingPointOfRoute(XR.route(x)))
                        + calc(XR.next(y),
                        XR.getTerminatingPointOfRoute(XR.route(y)))
                        - XR.index(v) - 1;
            }
            if (XR.isBefore(y, v)) {// XR.index(v] > XR.index(y]) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(y)))
                        - XR.index(v) - 1;
            }
        }
        return 0;
    }

    public double evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove5: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return XR.index(x)
                    + calc(XR.next(y),
                    XR.getTerminatingPointOfRoute(XR.route(y)))
                    - XR.index(v);
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(y))) {
            return XR.index(y)
                    + calc(XR.next(x),
                    XR.getTerminatingPointOfRoute(XR.route(x)))
                    - XR.index(v);
        }
        if (XR.route(x) == XR.route(v) && XR.isBefore(x, v)) {// XR.index(v] >
            // XR.index(x])
            // {
            return XR.index(y) + calc(XR.next(x), v) - XR.index(v);
        }
        if (XR.route(y) == XR.route(v) && XR.isBefore(y, v)) {// //XR.index(v] >
            // XR.index(y])
            // {
            return XR.index(x) + calc(XR.next(y), v) - XR.index(v);
        }
        return 0;
    }

    public double evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove6: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return XR.index(x)
                    + calc(XR.next(y),
                    XR.getTerminatingPointOfRoute(XR.route(y)))
                    - XR.index(v);
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(y))) {
            return XR.index(y)
                    + calc(XR.next(x),
                    XR.getTerminatingPointOfRoute(XR.route(x)))
                    - XR.index(v);
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(x, v)) {// XR.index(v] > XR.index(x]) {
                return XR.index(y) + calc(XR.next(x), v) - XR.index(v);
            }
            return calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                    + calc(v, x) - XR.index(v) - 1;
        }
        if (XR.route(y) == XR.route(v) && XR.isBefore(y, v)) {// XR.index(v] >
            // XR.index(y])
            // {
            return calc(v, XR.getTerminatingPointOfRoute(XR.route(y)))
                    - XR.index(v) - 1;
        }
        return 0;
    }

    public double evaluateTwoOptMove7(Point x, Point y) {
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove7: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return XR.index(x)
                    + calc(XR.next(y),
                    XR.getTerminatingPointOfRoute(XR.route(y)))
                    - XR.index(v);
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(y))) {
            return XR.index(y)
                    + calc(XR.next(x),
                    XR.getTerminatingPointOfRoute(XR.route(x)))
                    - XR.index(v);
        }
        if (XR.route(y) == XR.route(v)) {
            if (XR.isBefore(y, v)) {// XR.index(v] > XR.index(y]) {
                return XR.index(x) + calc(XR.next(y), v) - XR.index(v);
            }
            return calc(XR.next(x), XR.getTerminatingPointOfRoute(XR.route(x)))
                    + calc(v, y) - XR.index(v) - 1;
        }
        if (XR.route(x) == XR.route(v) && XR.isBefore(x, v)) {// XR.index(v] >
            // XR.index(x])
            // {
            return calc(v, XR.getTerminatingPointOfRoute(XR.route(x)))
                    - XR.index(v) - 1;
        }
        return 0;
    }

    public double evaluateTwoOptMove8(Point x, Point y) {
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove8: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getStartingPointOfRoute(XR.route(y))) {
            return 0;
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return XR.index(x)
                    + calc(XR.next(y),
                    XR.getTerminatingPointOfRoute(XR.route(y)))
                    - XR.index(v);
        }
        if (v == XR.getTerminatingPointOfRoute(XR.route(y))) {
            return XR.index(y)
                    + calc(XR.next(x),
                    XR.getTerminatingPointOfRoute(XR.route(x)))
                    - XR.index(v);
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(x, v)) {// XR.index(v] > XR.index(x]) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(x)))
                        - XR.index(v) - 1;
            }
            return calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)))
                    + calc(v, x) - XR.index(v) - 1;
        }
        if (XR.route(y) == XR.route(v)) {
            if (XR.isBefore(y, v)) {// XR.index(v] > XR.index(y]) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(y)))
                        - XR.index(v) - 1;
            }
            return calc(XR.next(x), XR.getTerminatingPointOfRoute(XR.route(x)))
                    + calc(v, y) - XR.index(v) - 1;
        }
        return 0;
    }

    public double evaluateOrOptMove1(Point x1, Point x2, Point y) {
        if (!XR.checkPerformOrOptMove(x1, x2, y)) {
            System.out.println(name() + ":: Error evaluateOrOptMove1: " + x1
                    + " " + x2 + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.route(x1) == XR.route(v)) {
            if (XR.isBefore(x2, v)) {// XR.index(v] > XR.index(x2]) {
                return XR.index(XR.prev(x1)) + calc(XR.next(x2), v)
                        - XR.index(v);
            }
            if (XR.isBefore(XR.prev(x1), v)) {// XR.index(v] >= XR.index(x1]) {
                return XR.index(y) + calc(x1, v) - XR.index(v);
            }
            return 0;
        }
        if (XR.route(y) == XR.route(v) && XR.isBefore(y, v)) {// XR.index(v] >
            // XR.index(y])
            // {
            return calc(x1, x2);
        }
        return 0;
    }

    public double evaluateOrOptMove2(Point x1, Point x2, Point y) {
        if (!XR.checkPerformOrOptMove(x1, x2, y)) {
            System.out.println(name() + ":: Error evaluateOrOptMove2: " + x1
                    + " " + x2 + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.route(x1) == XR.route(v)) {
            if (XR.isBefore(x2, v)) {// XR.index(v] > XR.index(x2]) {
                return XR.index(XR.prev(x1)) + calc(XR.next(x2), v)
                        - XR.index(v);
            }
            if (XR.isBefore(XR.prev(x1), v)) {// XR.index(v] >= XR.index(x1]) {
                return XR.index(y) + calc(v, x2) - XR.index(v);
            }
            return 0;
        }
        if (XR.route(y) == XR.route(v) && XR.isBefore(y, v)) {// XR.index(v] >
            // XR.index(y])
            // {
            return calc(x1, x2);
        }
        return 0;
    }

    // r -> x --> z -> nextY --> nextX -> y --> nextZ -> r

    public double evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove1: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(v, XR.next(z)) && XR.isBefore(y, v)) {// //XR.index(v]
                // <=
                // XR.index(z]
                // &&
                // XR.index(v]
                // >
                // XR.index(y])
                // {
                return XR.index(x) + calc(v, z) - XR.index(v);
            }
            if (XR.isBefore(v, XR.next(y)) && XR.isBefore(x, v)) {// XR.index(v]
                // <=
                // XR.index(y]
                // &&
                // XR.index(v]
                // >
                // XR.index(x])
                // {
                return XR.index(x) + calc(XR.next(y), z) + calc(XR.next(x), v)
                        - XR.index(v);
            }
        }
        return 0;
    }

    // r -> nextZ --> y -> nextX --> nextY -> z --> x -> r

    public double evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreOptMove2: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {// XR.index(v] > XR.index(z]) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(x)))
                        - XR.index(v) - 1;
            }
            if (XR.isBefore(y, v)) {// XR.index(v] > XR.index(y]) {
                double newV = 0;
                newV += calc(XR.next(z),
                        XR.getTerminatingPointOfRoute(XR.route(x)));
                newV += calc(XR.next(x), y) + calc(XR.next(y), v);
                return newV - XR.index(v) - 1;
            }
            if (XR.isBefore(x, v)) {// XR.index(v] > XR.index(x]) {
                double newV = 0;
                newV += calc(XR.next(z),
                        XR.getTerminatingPointOfRoute(XR.route(x)));
                newV += calc(v, y);
                return newV - XR.index(v) - 1;
            }
            double newV = 0;
            newV += calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)));
            newV += calc(XR.next(x), y) + calc(XR.next(y), z) + calc(v, x);
            return newV - XR.index(v) - 1;
        }
        return 0;
    }

    // r -> x --> y -> nextX --> z -> nextY --> nextZ -> r

    public double evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove3: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {// if (XR.index(v] > XR.index(z]) {
                return 0;
            }
            if (XR.isBefore(y, v)) {// if (XR.index(v] > XR.index(y]) {
                return XR.index(x) + calc(XR.next(x), y) + calc(v, z)
                        - XR.index(v);
            }
            if (XR.isBefore(x, v)) {// if (XR.index(v] > XR.index(x]) {
                return XR.index(x) + calc(v, y) - XR.index(v);
            }
        }
        return 0;
    }

    // r -> nextZ --> nextY -> z --> nextX -> y --> x -> r

    public double evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove4: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {// if (XR.index(v] > XR.index(z]) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(x)))
                        - XR.index(v) - 1;
            }
            if (XR.isBefore(y, v)) {// if (XR.index(v] > XR.index(y]) {
                double newV = calc(XR.next(y), v);
                newV += calc(XR.next(z),
                        XR.getTerminatingPointOfRoute(XR.route(x)));
                return newV - XR.index(v) - 1;
            }
            if (XR.isBefore(x, v)) {// if (XR.index(v] > XR.index(x]) {
                double newV = calc(XR.next(y), z) + calc(XR.next(x), v);
                newV += calc(XR.next(z),
                        XR.getTerminatingPointOfRoute(XR.route(x)));
                return newV - XR.index(v) - 1;
            }
            double newV = calc(XR.next(y), z) + calc(XR.next(x), y)
                    + calc(x, v);
            newV += calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)));
            return newV - XR.index(v) - 1;
        }
        return 0;
    }

    // r -> x --> nextY -> z --> nextX -> y --> nextZ -> r

    public double evaluateThreeOptMove5(Point x, Point y, Point z) {
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove5: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {// if (XR.index(v] > XR.index(z]) {
                return 0;
            }
            if (XR.isBefore(y, v)) {// if (XR.index(v] > XR.index(y]) {
                return XR.index(x) + calc(XR.next(y), v) - XR.index(v);
            }
            if (XR.isBefore(x, v)) {// if (XR.index(v] > XR.index(x]) {
                return XR.index(x) + calc(XR.next(y), z) + calc(XR.next(x), v)
                        - XR.index(v);
            }
        }
        return 0;
    }

    // r -> nextZ --> y -> nextX --> z -> nextY --> x -> r

    public double evaluateThreeOptMove6(Point x, Point y, Point z) {
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove6: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {// if (XR.index(v] > XR.index(z]) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(x)))
                        - XR.index(v) - 1;
            }
            if (XR.isBefore(y, v)) {// if (XR.index(v] > XR.index(y]) {
                double newV = calc(z, v) + calc(y, XR.next(x));
                newV += calc(XR.next(z),
                        XR.getTerminatingPointOfRoute(XR.route(x)));
                return newV - XR.index(v) - 1;
            }
            if (XR.isBefore(x, v)) {// if (XR.index(v] > XR.index(x]) {
                double newV = calc(y, v);
                newV += calc(XR.next(z),
                        XR.getTerminatingPointOfRoute(XR.route(x)));
                return newV - XR.index(v) - 1;
            }
            double newV = calc(XR.next(y), z) + calc(XR.next(x), y)
                    + calc(x, v);
            newV += calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)));
            return newV - XR.index(v) - 1;
        }
        return 0;
    }

    // r -> x --> nextY -> z --> y -> nextX --> nextZ -> r

    public double evaluateThreeOptMove7(Point x, Point y, Point z) {
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove7: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {// if (XR.index(v] > XR.index(z]) {
                return 0;
            }
            if (XR.isBefore(y, v)) {// if (XR.index(v] > XR.index(y]) {
                return XR.index(x) + calc(XR.next(y), v) - XR.index(v);
            }
            if (XR.isBefore(x, v)) {// if (XR.index(v] > XR.index(x]) {
                return XR.index(x) + calc(XR.next(y), z) + calc(y, v)
                        - XR.index(v);
            }
        }
        return 0;
    }

    // r -> nextZ --> nextX -> y --> z -> nextY --> x -> r

    public double evaluateThreeOptMove8(Point x, Point y, Point z) {
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluatThreeOptMove8: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == XR.getStartingPointOfRoute(XR.route(x))
                || v == XR.getTerminatingPointOfRoute(XR.route(x))) {
            return 0;
        }
        if (XR.route(x) == XR.route(v)) {
            if (XR.isBefore(z, v)) {// if (XR.index(v] > XR.index(z]) {
                return calc(v, XR.getTerminatingPointOfRoute(XR.route(x)))
                        - XR.index(v) - 1;
            }
            if (XR.isBefore(y, v)) {// if (XR.index(v] > XR.index(y]) {
                double newV = calc(z, v) + calc(y, XR.next(x));
                newV += calc(XR.next(z),
                        XR.getTerminatingPointOfRoute(XR.route(x))) - 1;
                return newV - XR.index(v);
            }
            if (XR.isBefore(x, v)) {// if (XR.index(v] > XR.index(x]) {
                double newV = calc(XR.next(x), v);
                newV += calc(XR.next(z),
                        XR.getTerminatingPointOfRoute(XR.route(x))) - 1;
                return newV - XR.index(v);
            }
            double newV = calc(XR.next(y), z) + calc(XR.next(x), y)
                    + calc(x, v);
            newV += calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)));
            return newV - XR.index(v) - 1;
        }
        return 0;
    }

    public double evaluateCrossExchangeMove(Point x1, Point y1, Point x2,
                                            Point y2) {
        if (!XR.checkPerformCrossExchangeMove(x1, y1, x2, y2)) {
            System.out.println(name() + ":: Error evaluateCrossExchangeMove: "
                    + x1 + " " + y1 + " " + x2 + " " + y2 + "\n"
                    + XR.toString());
            System.exit(-1);
        }
        if (XR.route(x1) == XR.route(v)) {
            if (XR.isBefore(y1, v)) {// if (XR.index(v] > XR.index(y1]) {
                return XR.index(x1) + calc(XR.next(x2), y2)
                        + calc(XR.next(y1), v) - XR.index(v);
            }
            if (XR.isBefore(x1, v)) {// if (XR.index(v] > XR.index(x1]) {
                return XR.index(x2) + calc(XR.next(x1), v) - XR.index(v);
            }
        }
        if (XR.route(x2) == XR.route(v)) {
            if (XR.isBefore(y2, v)) {// if (XR.index(v] > XR.index(y2]) {
                return XR.index(x2) + calc(XR.next(x1), y1)
                        + calc(XR.next(y2), v) - XR.index(v);
            }
            if (XR.isBefore(x2, v)) {// if (XR.index(v] > XR.index(x2]) {
                return XR.index(x1) + calc(XR.next(x2), v) - XR.index(v);
            }
        }
        return 0;
    }

    public String toString() {
        String s = "";
        for (int k = 1; k <= XR.getNbRoutes(); k++) {
            s += "route[" + k + "] : ";
            for (Point x = XR.getStartingPointOfRoute(k); x != XR
                    .getTerminatingPointOfRoute(k); x = XR.next(x)) {
                s += XR.index(x) + " ";
            }
            s += "\n";
        }
        return s;
    }

    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        System.out.println(name()
                + "::propagateTwoOptMoveOneRoute NOT IMPLEMENTED YET");
        System.exit(-1);
    }

    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub

    }

    public void propagateThreePointsMove(Point x1, Point x2, Point x3,
                                         Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub

    }

    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                        Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub

    }

    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub

    }

    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub

    }


    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        System.out.println("IndexOnRoute::propagateAddTwoPoints HAS NOT BEEN IMPLEMENTED YET");
        System.exit(-1);
    }


    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        System.out.println("IndexOnRoute::propagateRemoveTwoPoints HAS NOT BEEN IMPLEMENTED YET");
        System.exit(-1);
    }

    private void swap(Point[] a, int i, int j) {
        Point tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private double evaluateMove(Point[] x, Point[] y, Point[] z) {
        boolean ok = false;
        for (int i = 0; i < z.length; i++) {
            if (z[i] == v) {
                for (int j = 0; j < x.length; j++) {
                    if (x[j] == v) {
                        ok = true;
                        break;
                    }
                }
                if (!ok) {
                    return 0;
                }
            }
        }

        for (int i = 0; i < x.length - 1; i++) {
            for (int j = x.length - 1; j > i; j--) {
                if (XR.isBefore(y[j], y[j - 1])) {
                    swap(x, j, j - 1);
                    swap(y, j, j - 1);
                }
            }
        }
        for (int i = 0; i < z.length - 1; i++) {
            for (int j = i + 1; j < z.length; j++) {
                if (XR.isBefore(z[j], z[i])) {
                    swap(z, i, j);
                }
            }
        }
        int i = 0;
        int j = 0;
        double d = 0;
        while (i < x.length || j < z.length) {
            if (j == z.length || (i < x.length && XR.isBefore(y[i], z[j]))) {
                if ((!ok) && XR.route(v) == XR.route(y[i])
                        && (!XR.isBefore(y[i], v))) {
                    return d;
                }
                d += 1;
                if (v == x[i]) {
                    return d + XR.index(y[i]) - XR.index(v);
                }
                while (i < x.length - 1 && y[i] == y[i + 1]) {
                    i++;
                    d += 1;
                    if (v == x[i]) {
                        return d + XR.index(y[i]) - XR.index(v);
                    }
                }
                i++;
            } else {
                if ((!ok) && XR.isBefore(v, z[j])) {
                    return d;
                }
                d -= 1;
                while (j < z.length - 1 && XR.next(z[j]) == z[j + 1]) {
                    d -= 1;
                    j++;
                }
                j++;
            }
        }

        return d;
    }

    public double evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoPointsMove(x1, x2, y1, y2)) {
            System.out.println(name() + ":: Error evaluateTwoPointsMove: " + x1
                    + " " + y1 + " " + x2 + " " + y2 + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 2;
        Point[] x = { x1, x2 };
        Point[] y = { y1, y2 };
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            route.add(XR.route(x[i]));
            route.add(XR.route(y[i]));
        }
        double eval = 0;
        for (int r : route) {
            boolean ok = false;
            ArrayList<Point> xx = new ArrayList<Point>();
            ArrayList<Point> yy = new ArrayList<Point>();
            ArrayList<Point> zz = new ArrayList<Point>();
            for (int i = 0; i < n; i++) {
                if (XR.route(y[i]) == r) {
                    xx.add(x[i]);
                    yy.add(y[i]);
                    ok |= x[i] == v;
                }
                if (XR.route(x[i]) == r) {
                    zz.add(x[i]);
                }
            }
            if (ok || XR.route(v) == r) {
                Point[] X = new Point[xx.size()];
                Point[] Y = new Point[yy.size()];
                Point[] Z = new Point[zz.size()];
                for (int i = 0; i < X.length; i++) {
                    X[i] = xx.get(i);
                    Y[i] = yy.get(i);
                }
                for (int i = 0; i < Z.length; i++) {
                    Z[i] = zz.get(i);
                }
                // System.out.println("--------- " + r);
                eval += evaluateMove(X, Y, Z);
            }
        }
        return eval;
    }

    public double evaluateThreePointsMove(Point x1, Point x2, Point x3,
                                          Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreePointsMove(x1, x2, x3, y1, y2, y3)) {
            System.out.println(name() + ":: Error evaluateThreePointsMove: "
                    + x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3
                    + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 3;
        Point[] x = { x1, x2, x3 };
        Point[] y = { y1, y2, y3 };
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            route.add(XR.route(x[i]));
            route.add(XR.route(y[i]));
        }
        double eval = 0;
        for (int r : route) {
            boolean ok = false;
            ArrayList<Point> xx = new ArrayList<Point>();
            ArrayList<Point> yy = new ArrayList<Point>();
            ArrayList<Point> zz = new ArrayList<Point>();
            for (int i = 0; i < n; i++) {
                if (XR.route(y[i]) == r) {
                    xx.add(x[i]);
                    yy.add(y[i]);
                    ok |= x[i] == v;
                }
                if (XR.route(x[i]) == r) {
                    zz.add(x[i]);
                }
            }
            if (ok || XR.route(v) == r) {
                Point[] X = new Point[xx.size()];
                Point[] Y = new Point[yy.size()];
                Point[] Z = new Point[zz.size()];
                for (int i = 0; i < X.length; i++) {
                    X[i] = xx.get(i);
                    Y[i] = yy.get(i);
                }
                for (int i = 0; i < Z.length; i++) {
                    Z[i] = zz.get(i);
                }
                eval += evaluateMove(X, Y, Z);
            }
        }
        return eval;
    }

    public double evaluateFourPointsMove(Point x1, Point x2, Point x3,
                                         Point x4, Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4)) {
            System.out.println(name() + ":: Error evaluateFourPointsMove: "
                    + x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3
                    + " " + x4 + " " + y4 + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 4;
        Point[] x = { x1, x2, x3, x4 };
        Point[] y = { y1, y2, y3, y4 };
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            route.add(XR.route(x[i]));
            route.add(XR.route(y[i]));
        }
        double eval = 0;
        for (int r : route) {
            boolean ok = false;
            ArrayList<Point> xx = new ArrayList<Point>();
            ArrayList<Point> yy = new ArrayList<Point>();
            ArrayList<Point> zz = new ArrayList<Point>();
            for (int i = 0; i < n; i++) {
                if (XR.route(y[i]) == r) {
                    xx.add(x[i]);
                    yy.add(y[i]);
                    ok |= x[i] == v;
                }
                if (XR.route(x[i]) == r) {
                    zz.add(x[i]);
                }
            }
            if (ok || XR.route(v) == r) {
                Point[] X = new Point[xx.size()];
                Point[] Y = new Point[yy.size()];
                Point[] Z = new Point[zz.size()];
                for (int i = 0; i < X.length; i++) {
                    X[i] = xx.get(i);
                    Y[i] = yy.get(i);
                }
                for (int i = 0; i < Z.length; i++) {
                    Z[i] = zz.get(i);
                }
                // System.out.println("--------- " + r);
                eval += evaluateMove(X, Y, Z);
            }
        }
        return eval;
    }

    public double evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformAddOnePoint(x, y)) {
            System.out.println(name() + ":: Error evaluateAddOnePoint: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == x) {
            return XR.index(y) + 1 - XR.index(x);
        }
        if (XR.isBefore(y, v)) {
            return 1;
        }
        return 0;
    }

    public double evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformRemoveOnePoint(x)) {
            System.out.println(name() + ":: Error evaluateRemoveOnePoint: " + x
                    + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == x) {
            return -XR.index(x) + Constants.NULL_POINT;
        }
        if (XR.isBefore(x, v)) {
            return -1;
        }
        return 0;
    }

    public double evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformAddTwoPoints(x1, y1, x2, y2)) {
            System.out.println(name() + ":: Error evaluateAddTwoPoints: " + x1 + " " + y1 + " " + x2 + " " + y2 + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == x1)
            return XR.index(y1) + 1 - XR.index(x1);

        if(v == x2){
            if(y1 == y2)
                return XR.index(y1) + 2 - XR.index(x2);
            else
                return XR.index(y2) + 1 - XR.index(x2);
        }

        if (XR.isBefore(y1, v) && !XR.isBefore(y2, v))
            return 1;

        if(XR.isBefore(y2, v))
            return 2;
        return 0;
    }

    public double evaluateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformRemoveTwoPoints(x1, x2)) {
            System.out.println(name() + ":: Error evaluateRemoveTwoPoints: " + x1 + " " + x2 + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == x1)
            return -XR.index(x1) + Constants.NULL_POINT;

        if (v == x2)
            return -XR.index(x2) + Constants.NULL_POINT;

        if (XR.isBefore(x1, v) && !XR.isBefore(x2, v))
            return -1;

        if(XR.isBefore(x2, v))
            return -2;
        return 0;
    }

    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }

    public double evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformAddRemovePoints(x, y, z)) {
            System.out.println(name() + ":: Error evaluateAddRemovePoints: "
                    + x + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.route(x) == XR.route(z)) {
            if (y != v && XR.route(x) != XR.route(v)) {
                return 0;
            }
            if (x == v) {
                return -XR.index(x) + Constants.NULL_POINT;
            }
            Point[] X = { y };
            Point[] Y = { z };
            Point[] Z = { x };
            return evaluateMove(X, Y, Z);
        } else {
            if (XR.route(x) == XR.route(v)) {
                if (v == x) {
                    return -XR.index(x) + Constants.NULL_POINT;
                }
                if (XR.isBefore(x, v)) {
                    return -1;
                }
            }
            if (v == y) {
                return XR.index(z) + 1 - XR.index(y);
            }
            if (XR.isBefore(z, v)) {
                return 1;
            }

        }

        return 0;
    }

    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub

    }

    public double evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformKPointsMove(x, y)) {
            System.out.println(name() + ":: Error evaluateKPointsMove:\n"
                    + XR.toString());
            System.exit(-1);
        }
        int n = x.size();
        HashSet<Integer> route = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            if (XR.route(x.get(i)) != Constants.NULL_POINT) {
                route.add(XR.route(x.get(i)));
            }
            if (y.get(i) != CBLSVR.NULL_POINT) {
                route.add(XR.route(y.get(i)));
            }
        }
        double eval = 0;
        for (int r : route) {
            boolean ok = false;
            ArrayList<Point> xx = new ArrayList<Point>();
            ArrayList<Point> yy = new ArrayList<Point>();
            ArrayList<Point> zz = new ArrayList<Point>();
            for (int i = 0; i < n; i++) {
                if (y.get(i) != CBLSVR.NULL_POINT && XR.route(y.get(i)) == r) {
                    xx.add(x.get(i));
                    yy.add(y.get(i));
                    ok |= x.get(i) == v;
                } else if (y.get(i) == CBLSVR.NULL_POINT) {
                    if (x.get(i) == v) {
                        return Constants.NULL_POINT - XR.index(v);
                    }
                }
                if (XR.route(x.get(i)) == r) {
                    zz.add(x.get(i));
                }
            }
            if (ok || XR.route(v) == r) {
                Point[] X = new Point[xx.size()];
                Point[] Y = new Point[yy.size()];
                Point[] Z = new Point[zz.size()];
                for (int i = 0; i < X.length; i++) {
                    X[i] = xx.get(i);
                    Y[i] = yy.get(i);
                }
                for (int i = 0; i < Z.length; i++) {
                    Z[i] = zz.get(i);
                }
                eval += evaluateMove(X, Y, Z);
            }
        }
        return eval;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = 60;
        int n = 50;
        int K = 5;
        Point[] p = new Point[N];
        SecureRandom rand = new SecureRandom();
        for (int i = 0; i < N; i++) {
            p[i] = new Point(i, rand.nextInt(50), rand.nextInt(50));
        }
        VRManager mgr = new VRManager();
        VarRoutesVR XR = new VarRoutesVR(mgr);
        for (int i = 0; i < n; i++) {
            XR.addClientPoint(p[i]);
        }
        for (int i = n; i < N - K; i++) {
            XR.addRoute(p[i], p[i + K]);
        }
        XR.initSequential();
        NodeWeightsManager nwm = new NodeWeightsManager(XR.getAllPoints());
        for (int i = 0; i < p.length; i++) {
            nwm.setWeight(p[i], rand.nextInt(50));
        }
        AccumulatedWeightNodesVR accWN = new AccumulatedWeightNodesVR(XR, nwm);
        IFunctionVR[] f = new IFunctionVR[N];
        for (int i = 0; i < f.length; i++) {
            f[i] = new IndexOnRoute(XR, p[i]);
        }

        mgr.close();
        // mgr.performRemoveOnePoint(p[0]);

        int iter = 0;
        double[] oldV = new double[N];
        double[] newV = new double[N];
        double[] delta = new double[N];
        while (iter < 10000) {
            System.out.println(iter++ + "\n" + XR + "\n" + accWN);
            for (int i = 0; i < N; i++) {
                oldV[i] = f[i].getValue();
            }
            // int x1 = rand.nextInt(N);
            // int x2 = rand.nextInt(N);
            // int y1 = rand.nextInt(N);
            // int y2 = rand.nextInt(N);
            // int x3 = rand.nextInt(N);
            // int y3 = rand.nextInt(N);
            // int x4 = rand.nextInt(N);
            // int y4 = rand.nextInt(N);
            // while (!XR.checkPerformThreePointsMove(p[x1], p[x2], p[x3],
            // p[y1], p[y2], p[y3])) {
            // x1 = rand.nextInt(N);
            // y1 = rand.nextInt(N);
            // x2 = rand.nextInt(N);
            // y2 = rand.nextInt(N);
            // x3 = rand.nextInt(N);
            // y3 = rand.nextInt(N);
            // x4 = rand.nextInt(N);
            // y4 = rand.nextInt(N);
            // }
            //
            // System.out.println(x1 + " " + y1);
            // for (int i = 0; i < N; i++) {
            // delta[i] = f[i].evaluateThreePointsMove(p[x1], p[x2], p[x3],
            // p[y1], p[y2], p[y3]);
            // }
            // mgr.performThreePointsMove(p[x1], p[x2], p[x3], p[y1], p[y2],
            // p[y3]);
            // for (int i = 0; i < N; i++) {
            // newV[i] = f[i].getValue();
            // }
            ArrayList<Point> x = new ArrayList<Point>();
            ArrayList<Point> y = new ArrayList<Point>();
            int count = rand.nextInt(5) + 5;
            for (int i = 0; i < count; i++) {
                x.add(p[rand.nextInt(N)]);
                if (rand.nextInt(5) == 0) {
                    y.add(CBLSVR.NULL_POINT);
                } else {
                    y.add(p[rand.nextInt(N)]);
                }
            }
            while (!XR.checkPerformKPointsMove(x, y)) {
                x.clear();
                y.clear();
                count = rand.nextInt(5) + 5;
                for (int i = 0; i < count; i++) {
                    x.add(p[rand.nextInt(N)]);
                    if (rand.nextInt(5) == 0) {
                        y.add(CBLSVR.NULL_POINT);
                    } else {
                        y.add(p[rand.nextInt(N)]);
                    }
                }
            }
            System.out.println(count);
            for (int i = 0; i < count; i++) {
                System.out.println(x.get(i) + " " + y.get(i));
            }
            for (int i = 0; i < N; i++) {
                delta[i] = f[i].evaluateKPointsMove(x, y);
            }
            mgr.performKPointsMove(x, y);
            for (int i = 0; i < N; i++) {
                newV[i] = f[i].getValue();
            }
            System.out.println(XR + "\n" + accWN);
            for (int i = 0; i < N; i++) {
                if (Math.abs(oldV[i] + delta[i] - newV[i]) > 1e-6) {
                    System.out.println("WTFFFFFFFFFFFFFFFFFFF " + i + " "
                            + oldV[i] + " " + delta[i] + " " + newV[i]);
                    System.exit(-1);
                }
            }
        }
        System.out.println("Okkkkkkkkkkkkkk");
    }

}
class TotalCostVR implements IFunctionVR {

    private VarRoutesVR XR;
    private VRManager mgr;
    private ArcWeightsManager awm;

    private double value;
    private double[] costLeft;
    private double[] costRight;

    HashMap<Point, Integer> map;

    public TotalCostVR(VarRoutesVR XR, ArcWeightsManager awm) {
        this.XR = XR;
        this.awm = awm;
        mgr = XR.getVRManager();
        post();
    }

    private void post() {
        costLeft = new double[XR.getTotalNbPoints()];
        costRight = new double[XR.getTotalNbPoints()];
        ArrayList<Point> points = XR.getAllPoints();
        map = new HashMap<Point, Integer>();
        for (int i = 0; i < points.size(); i++) {
            map.put(points.get(i), i);
        }
        mgr.post(this);
    }

    private int getIndex(Point p) {
        return map.get(p);
    }

    private double getCostLeft(Point p) {
        return costLeft[getIndex(p)];
    }

    private double getCostRight(Point p) {
        return costRight[getIndex(p)];
    }

    private double getCost(Point p, Point q) {
        return awm.getWeight(p, q);
    }

    private void update(int k) {
        Point sp = XR.getStartingPointOfRoute(k);
        Point tp = XR.getTerminatingPointOfRoute(k);
        costRight[getIndex(sp)] = 0;
        costLeft[getIndex(tp)] = 0;
        if(XR.next(sp) == tp){
            costRight[getIndex(tp)] = 0;
            costLeft[getIndex(sp)] = 0;
            return;
        }
        for (Point u = sp; u != tp; u = XR.next(u)) {
            costRight[getIndex(XR.next(u))] = costRight[getIndex(u)]
                    + awm.getWeight(u, XR.next(u));
        }

        for (Point u = tp; u != sp; u = XR.prev(u)) {
            costLeft[getIndex(XR.prev(u))] = costLeft[getIndex(u)]
                    + awm.getWeight(u, XR.prev(u));
        }
    }

    private double calc(Point s, Point t) {
        if (XR.route(s) != XR.route(t)) {
            System.out.println(name() + "::calc(" + s + "," + t
                    + ") EXCEPTION, " + s + " and " + t
                    + " are not the the same route");
            mgr.exit(-1);
        }
        return (XR.isBefore(s, t)) ? getCostRight(t) - getCostRight(s)
                : getCostLeft(t) - getCostLeft(s);
    }

    // @Override
    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return mgr;
    }

    // @Override
    public void initPropagation() {
        // TODO Auto-generated method stub
        value = 0;
        for (int i = 1; i <= XR.getNbRoutes(); i++) {
            update(i);
            value += getCostRight(XR.getTerminatingPointOfRoute(i));
        }
    }

    // @Override
    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x));
        oldR.add(XR.oldRoute(y));
        for (int r : oldR) {
            value -= getCostRight(XR.getTerminatingPointOfRoute(r));
            update(r);
            value += getCostRight(XR.getTerminatingPointOfRoute(r));
        }
    }

    // @Override
    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        if (XR.next(x) == y) {
            propagateTwoPointsMove(y, x, XR.prev(x), XR.prev(x));
        } else if (XR.next(y) == x) {
            propagateTwoPointsMove(x, y, XR.prev(y), XR.prev(y));
        } else {
            propagateTwoPointsMove(x, y, XR.prev(y), XR.prev(x));
        }
    }

    // @Override
    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        double oldX = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(x)));
        double oldY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
        double newX = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(x)));
        double newY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        value += newX + newY - oldX - oldY;
    }

    // @Override
    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        double oldX = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(x)));
        double oldY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
        double newX = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(x)));
        double newY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        value += newX + newY - oldX - oldY;
    }

    // @Override
    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        double oldX = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(x)));
        double oldY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
        double newX = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(x)));
        double newY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        value += newX + newY - oldX - oldY;
    }

    // @Override
    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        double oldX = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(x)));
        double oldY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
        double newX = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(x)));
        double newY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        value += newX + newY - oldX - oldY;
    }

    // @Override
    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        double oldX = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(x)));
        double oldY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
        double newX = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(x)));
        double newY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        value += newX + newY - oldX - oldY;
    }

    // @Override
    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        double oldX = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(x)));
        double oldY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
        double newX = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(x)));
        double newY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        value += newX + newY - oldX - oldY;
    }

    // @Override
    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        double oldX = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(x)));
        double oldY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
        double newX = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(x)));
        double newY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        value += newX + newY - oldX - oldY;
    }

    // @Override
    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        double oldX = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(x)));
        double oldY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        update(XR.oldRoute(x));
        update(XR.oldRoute(y));
        double newX = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(x)));
        double newY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        value += newX + newY - oldX - oldY;
    }

    // @Override
    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        double oldX = getCostRight(XR.getTerminatingPointOfRoute(XR
                .oldRoute(x1)));
        double oldY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        update(XR.oldRoute(x1));
        update(XR.oldRoute(y));
        double newX = getCostRight(XR.getTerminatingPointOfRoute(XR
                .oldRoute(x1)));
        double newY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        value += newX + newY - oldX - oldY;
    }

    // @Override
    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        double oldX = getCostRight(XR.getTerminatingPointOfRoute(XR
                .oldRoute(x1)));
        double oldY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        update(XR.oldRoute(x1));
        update(XR.oldRoute(y));
        double newX = getCostRight(XR.getTerminatingPointOfRoute(XR
                .oldRoute(x1)));
        double newY = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        value += newX + newY - oldX - oldY;
    }

    // @Override
    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double oldV = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        update(XR.oldRoute(y));
        double newV = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        value += newV - oldV;
    }

    // @Override
    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double oldV = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        update(XR.oldRoute(y));
        double newV = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        value += newV - oldV;
    }

    // @Override
    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double oldV = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        update(XR.oldRoute(y));
        double newV = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        value += newV - oldV;
    }

    // @Override
    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double oldV = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        update(XR.oldRoute(y));
        double newV = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        value += newV - oldV;
    }

    // @Override
    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double oldV = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        update(XR.oldRoute(y));
        double newV = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        value += newV - oldV;
    }

    // @Override
    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double oldV = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        update(XR.oldRoute(y));
        double newV = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        value += newV - oldV;
    }

    // @Override
    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double oldV = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        update(XR.oldRoute(y));
        double newV = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        value += newV - oldV;
    }

    // @Override
    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        double oldV = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        update(XR.oldRoute(y));
        double newV = getCostRight(XR
                .getTerminatingPointOfRoute(XR.oldRoute(y)));
        value += newV - oldV;
    }

    // @Override
    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2,
                                           Point y2) {
        // TODO Auto-generated method stub
        double oldX = getCostRight(XR.getTerminatingPointOfRoute(XR
                .oldRoute(x1)));
        double oldY = getCostRight(XR.getTerminatingPointOfRoute(XR
                .oldRoute(x2)));
        update(XR.oldRoute(x1));
        update(XR.oldRoute(x2));
        double newX = getCostRight(XR.getTerminatingPointOfRoute(XR
                .oldRoute(x1)));
        double newY = getCostRight(XR.getTerminatingPointOfRoute(XR
                .oldRoute(x2)));
        value += newX + newY - oldX - oldY;
    }

    // @Override
    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x1));
        oldR.add(XR.oldRoute(y1));
        oldR.add(XR.oldRoute(x2));
        oldR.add(XR.oldRoute(y2));
        for (int r : oldR) {
            value -= getCostRight(XR.getTerminatingPointOfRoute(r));
            update(r);
            value += getCostRight(XR.getTerminatingPointOfRoute(r));
        }
    }

    // @Override
    public void propagateThreePointsMove(Point x1, Point x2, Point x3,
                                         Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x1));
        oldR.add(XR.oldRoute(y1));
        oldR.add(XR.oldRoute(x2));
        oldR.add(XR.oldRoute(y2));
        oldR.add(XR.oldRoute(x3));
        oldR.add(XR.oldRoute(y3));
        for (int r : oldR) {
            value -= getCostRight(XR.getTerminatingPointOfRoute(r));
            update(r);
            value += getCostRight(XR.getTerminatingPointOfRoute(r));
        }
    }

    // @Override
    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                        Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(XR.oldRoute(x1));
        oldR.add(XR.oldRoute(y1));
        oldR.add(XR.oldRoute(x2));
        oldR.add(XR.oldRoute(y2));
        oldR.add(XR.oldRoute(x3));
        oldR.add(XR.oldRoute(y3));
        oldR.add(XR.oldRoute(x4));
        oldR.add(XR.oldRoute(y4));
        for (int r : oldR) {
            value -= getCostRight(XR.getTerminatingPointOfRoute(r));
            update(r);
            value += getCostRight(XR.getTerminatingPointOfRoute(r));
        }
    }

    // @Override
    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        int r = XR.route(y);
        value -= getCostRight(XR.getTerminatingPointOfRoute(r));
        update(r);
        value += getCostRight(XR.getTerminatingPointOfRoute(r));
    }

    // @Override
    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        int r = XR.oldRoute(x);
        value -= getCostRight(XR.getTerminatingPointOfRoute(r));
        update(r);
        value += getCostRight(XR.getTerminatingPointOfRoute(r));
    }

    //@Override
    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        int r = XR.route(y1);
        value -= getCostRight(XR.getTerminatingPointOfRoute(r));
        update(r);
        value += getCostRight(XR.getTerminatingPointOfRoute(r));
    }

    //@Override
    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        int r = XR.oldRoute(x1);
        value -= getCostRight(XR.getTerminatingPointOfRoute(r));
        update(r);
        value += getCostRight(XR.getTerminatingPointOfRoute(r));
    }

    // @Override
    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int r = XR.oldRoute(x);
        value -= getCostRight(XR.getTerminatingPointOfRoute(r));
        update(r);
        value += getCostRight(XR.getTerminatingPointOfRoute(r));
        if (XR.oldRoute(x) != XR.oldRoute(z)) {
            r = XR.oldRoute(z);
            value -= getCostRight(XR.getTerminatingPointOfRoute(r));
            update(r);
            value += getCostRight(XR.getTerminatingPointOfRoute(r));
        }
    }

    // @Override
    public String name() {
        // TODO Auto-generated method stub
        return "TotalCostVR";
    }

    // @Override
    public double getValue() {
        // TODO Auto-generated method stub
        return value;
    }

    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    public double evaluateTwoOptMoveOneRoute(Point x, Point y) {
        if (!XR.checkPerformTwoOptMoveOneRoute(x, y)) {
            System.out.println(name()
                    + "::evaluateTwoOptMoveOneRoute, check failed");
            System.exit(-1);
        }
        // int idx = getIndex(x);
        // int idy = getIndex(y);
        Point nx = XR.next(x);
        Point ny = XR.next(y);
        return awm.getWeight(x, y) + awm.getWeight(nx, ny) + calc(y, nx)
                - (awm.getWeight(x, nx) + awm.getWeight(y, ny) + calc(nx, y));

    }

    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])

    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        if (!XR.checkPerformTwoOptMoveOneRoute(x, y)) {
            System.out.println(name()
                    + "::propagateTwoOptMoveOneRoute, check failed");
            System.exit(-1);
        }
        int k = XR.oldRoute(x);
        value -= getCostRight(XR.getTerminatingPointOfRoute(k));
        update(k);
        value += getCostRight(XR.getTerminatingPointOfRoute(k));
    }

    // @Override
    public double evaluateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformOnePointMove(x, y)) {
            System.out.println(name() + ":: Error evaluateOnePointMove: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }

        int n = 1;
        Point[] xx = { x };
        Point[] yy = { y };
        double eval = 0;
        HashSet<Point> V = new HashSet<Point>();
        for (int i = 0; i < n; i++) {
            Point prev = XR.prev(xx[i]);
            while (V.contains(prev)) {
                prev = XR.prev(prev);
            }
            Point next = XR.next(xx[i]);
            while (V.contains(next)) {
                next = XR.next(next);
            }
            eval += getCost(prev, next) - getCost(prev, xx[i])
                    - getCost(xx[i], next);
            V.add(xx[i]);
        }
        HashMap<Point, Point> M = new HashMap<Point, Point>();
        for (int i = 0; i < n; i++) {
            Point next = XR.next(yy[i]);
            while (V.contains(next)) {
                next = XR.next(next);
            }
            Point prev = yy[i];
            if (M.containsKey(yy[i])) {
                prev = M.get(yy[i]);
            }
            eval += getCost(prev, xx[i]) + getCost(xx[i], next)
                    - getCost(prev, next);
            M.put(yy[i], xx[i]);
        }
        return eval;
    }

    // @Override
    public double evaluateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoPointsMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoPointsMove: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.next(x) == y) {
            return evaluateTwoPointsMove(y, x, XR.prev(x), XR.prev(x));
        } else if (XR.next(y) == x) {
            return evaluateTwoPointsMove(x, y, XR.prev(y), XR.prev(y));
        } else {
            return evaluateTwoPointsMove(x, y, XR.prev(y), XR.prev(x));
        }
    }

    // @Override
    public double evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove1: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }

        double oldX = getCostRight(XR.getTerminatingPointOfRoute(XR.route(x)));
        double oldY = getCostRight(XR.getTerminatingPointOfRoute(XR.route(y)));
        double newX = getCostRight(x)
                + getCost(x, y)
                + calc(y, XR.next(XR.getStartingPointOfRoute(XR.route(y))))
                + getCost(XR.next(XR.getStartingPointOfRoute(XR.route(y))),
                XR.getTerminatingPointOfRoute(XR.route(x)));
        double newY = 0;
        if (XR.next(x) == XR.getTerminatingPointOfRoute(XR.route(x))) {
            newY = getCost(XR.getStartingPointOfRoute(XR.route(y)), XR.next(y));
        } else {
            newY = getCost(XR.getStartingPointOfRoute(XR.route(y)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    + calc(XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))),
                    XR.next(x)) + getCost(XR.next(x), XR.next(y));
        }
        newY += calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)));
        return newX + newY - oldX - oldY;
    }

    // @Override
    public double evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove2: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }

        double oldX = getCostRight(XR.getTerminatingPointOfRoute(XR.route(x)));
        double oldY = getCostRight(XR.getTerminatingPointOfRoute(XR.route(y)));
        double newX = getCost(XR.getStartingPointOfRoute(XR.route(x)),
                XR.next(XR.getStartingPointOfRoute(XR.route(y))))
                + calc(XR.next(XR.getStartingPointOfRoute(XR.route(y))), y)
                + getCost(y, x)
                + calc(x, XR.next(XR.getStartingPointOfRoute(XR.route(x))))
                + getCost(XR.next(XR.getStartingPointOfRoute(XR.route(x))),
                XR.getTerminatingPointOfRoute(XR.route(x)));
        double newY = 0;
        if (XR.next(x) == XR.getTerminatingPointOfRoute(XR.route(x))) {
            newY = getCost(XR.getStartingPointOfRoute(XR.route(y)), XR.next(y));
        } else {
            newY = getCost(XR.getStartingPointOfRoute(XR.route(y)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    + calc(XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))),
                    XR.next(x)) + getCost(XR.next(x), XR.next(y));
        }
        newY += calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)));
        return newX + newY - oldX - oldY;
    }

    // @Override
    public double evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove3: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }

        double oldX = getCostRight(XR.getTerminatingPointOfRoute(XR.route(x)));
        double oldY = getCostRight(XR.getTerminatingPointOfRoute(XR.route(y)));
        double newX = getCostRight(x)
                + getCost(x, y)
                + calc(y, XR.next(XR.getStartingPointOfRoute(XR.route(y))))
                + getCost(XR.next(XR.getStartingPointOfRoute(XR.route(y))),
                XR.getTerminatingPointOfRoute(XR.route(x)));
        double newY = 0;
        if (XR.next(x) != XR.getTerminatingPointOfRoute(XR.route(x))) {
            if (XR.next(y) == XR.getTerminatingPointOfRoute(XR.route(y))) {
                newY = getCost(XR.getStartingPointOfRoute(XR.route(y)),
                        XR.next(x));
            } else {
                newY = getCost(XR.getStartingPointOfRoute(XR.route(y)),
                        XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))))
                        + calc(XR.prev(XR.getTerminatingPointOfRoute(XR
                        .route(y))), XR.next(y))
                        + getCost(XR.next(y), XR.next(x));
            }
            newY += calc(XR.next(x),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    + getCost(
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))),
                    XR.getTerminatingPointOfRoute(XR.route(y)));
        } else {
            if (XR.next(y) == XR.getTerminatingPointOfRoute(XR.route(y))) {
                newY = getCost(XR.getStartingPointOfRoute(XR.route(y)),
                        XR.getTerminatingPointOfRoute(XR.route(y)));
            } else {
                newY = getCost(XR.getStartingPointOfRoute(XR.route(y)),
                        XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))))
                        + calc(XR.prev(XR.getTerminatingPointOfRoute(XR
                        .route(y))), XR.next(y))
                        + getCost(XR.next(y),
                        XR.getTerminatingPointOfRoute(XR.route(y)));
            }
        }

        return newX + newY - oldX - oldY;
    }

    // @Override
    public double evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove4: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        double oldX = getCostRight(XR.getTerminatingPointOfRoute(XR.route(x)));
        double oldY = getCostRight(XR.getTerminatingPointOfRoute(XR.route(y)));
        double newX = getCost(XR.getStartingPointOfRoute(XR.route(x)),
                XR.next(XR.getStartingPointOfRoute(XR.route(y))))
                + calc(XR.next(XR.getStartingPointOfRoute(XR.route(y))), y)
                + getCost(y, x)
                + calc(x, XR.next(XR.getStartingPointOfRoute(XR.route(x))))
                + getCost(XR.next(XR.getStartingPointOfRoute(XR.route(x))),
                XR.getTerminatingPointOfRoute(XR.route(x)));
        double newY = 0;
        if (XR.next(x) != XR.getTerminatingPointOfRoute(XR.route(x))) {
            if (XR.next(y) == XR.getTerminatingPointOfRoute(XR.route(y))) {
                newY = getCost(XR.getStartingPointOfRoute(XR.route(y)),
                        XR.next(x));
            } else {
                newY = getCost(XR.getStartingPointOfRoute(XR.route(y)),
                        XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))))
                        + calc(XR.prev(XR.getTerminatingPointOfRoute(XR
                        .route(y))), XR.next(y))
                        + getCost(XR.next(y), XR.next(x));
            }
            newY += calc(XR.next(x),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    + getCost(
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))),
                    XR.getTerminatingPointOfRoute(XR.route(y)));
        } else {
            if (XR.next(y) == XR.getTerminatingPointOfRoute(XR.route(y))) {
                newY = getCost(XR.getStartingPointOfRoute(XR.route(y)),
                        XR.getTerminatingPointOfRoute(XR.route(y)));
            } else {
                newY = getCost(XR.getStartingPointOfRoute(XR.route(y)),
                        XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))))
                        + calc(XR.prev(XR.getTerminatingPointOfRoute(XR
                        .route(y))), XR.next(y))
                        + getCost(XR.next(y),
                        XR.getTerminatingPointOfRoute(XR.route(y)));
            }
        }
        return newX + newY - oldX - oldY;
    }

    // @Override
    public double evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove5: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        double oldX = getCostRight(XR.getTerminatingPointOfRoute(XR.route(x)));
        double oldY = getCostRight(XR.getTerminatingPointOfRoute(XR.route(y)));
        double newX = 0;
        if (XR.next(y) == XR.getTerminatingPointOfRoute(XR.route(y))) {
            newX = getCostRight(x)
                    + getCost(x, XR.getTerminatingPointOfRoute(XR.route(x)));
        } else {
            newX = getCostRight(x)
                    + getCost(x, XR.next(y))
                    + calc(XR.next(y),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))))
                    + getCost(
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))),
                    XR.getTerminatingPointOfRoute(XR.route(x)));
        }
        double newY = 0;
        if (XR.next(x) == XR.getTerminatingPointOfRoute(XR.route(x))) {
            newY = getCostRight(y)
                    + getCost(y, XR.getTerminatingPointOfRoute(XR.route(y)));
        } else {
            newY = getCostRight(y)
                    + getCost(y, XR.next(x))
                    + calc(XR.next(x),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    + getCost(
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))),
                    XR.getTerminatingPointOfRoute(XR.route(y)));
        }
        return newX + newY - oldX - oldY;
    }

    // @Override
    public double evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove6: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        double oldX = getCostRight(XR.getTerminatingPointOfRoute(XR.route(x)));
        double oldY = getCostRight(XR.getTerminatingPointOfRoute(XR.route(y)));
        double newX = 0;
        if (XR.next(y) == XR.getTerminatingPointOfRoute(XR.route(y))) {
            newX = getCost(XR.getStartingPointOfRoute(XR.route(x)), x)
                    + calc(x, XR.next(XR.getStartingPointOfRoute(XR.route(x))))
                    + getCost(XR.next(XR.getStartingPointOfRoute(XR.route(x))),
                    XR.getTerminatingPointOfRoute(XR.route(x)));
        } else {
            newX = getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))))
                    + calc(XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))),
                    XR.next(y))
                    + getCost(XR.next(y), x)
                    + calc(x, XR.next(XR.getStartingPointOfRoute(XR.route(x))))
                    + getCost(XR.next(XR.getStartingPointOfRoute(XR.route(x))),
                    XR.getTerminatingPointOfRoute(XR.route(x)));
        }
        double newY = 0;
        if (XR.next(x) == XR.getTerminatingPointOfRoute(XR.route(x))) {
            newY = getCostRight(y)
                    + getCost(y, XR.getTerminatingPointOfRoute(XR.route(y)));
        } else {
            newY = getCostRight(y)
                    + getCost(y, XR.next(x))
                    + calc(XR.next(x),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    + getCost(
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))),
                    XR.getTerminatingPointOfRoute(XR.route(y)));
        }
        return newX + newY - oldX - oldY;
    }

    // @Override
    public double evaluateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove7: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        return evaluateTwoOptMove6(y, x);
    }

    // @Override
    public double evaluateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove8: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        double oldX = getCostRight(XR.getTerminatingPointOfRoute(XR.route(x)));
        double oldY = getCostRight(XR.getTerminatingPointOfRoute(XR.route(y)));
        double newX = 0;
        if (XR.next(y) == XR.getTerminatingPointOfRoute(XR.route(y))) {
            newX = getCost(XR.getStartingPointOfRoute(XR.route(x)), x)
                    + calc(x, XR.next(XR.getStartingPointOfRoute(XR.route(x))))
                    + getCost(XR.next(XR.getStartingPointOfRoute(XR.route(x))),
                    XR.getTerminatingPointOfRoute(XR.route(x)));
        } else {
            newX = getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))))
                    + calc(XR.prev(XR.getTerminatingPointOfRoute(XR.route(y))),
                    XR.next(y))
                    + getCost(XR.next(y), x)
                    + calc(x, XR.next(XR.getStartingPointOfRoute(XR.route(x))))
                    + getCost(XR.next(XR.getStartingPointOfRoute(XR.route(x))),
                    XR.getTerminatingPointOfRoute(XR.route(x)));
        }
        double newY = 0;
        if (XR.next(x) == XR.getTerminatingPointOfRoute(XR.route(x))) {
            newY = getCost(XR.getStartingPointOfRoute(XR.route(y)), y)
                    + calc(y, XR.next(XR.getStartingPointOfRoute(XR.route(y))))
                    + getCost(XR.next(XR.getStartingPointOfRoute(XR.route(y))),
                    XR.getTerminatingPointOfRoute(XR.route(y)));
        } else {
            newY = getCost(XR.getStartingPointOfRoute(XR.route(y)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    + calc(XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))),
                    XR.next(x))
                    + getCost(XR.next(x), y)
                    + calc(y, XR.next(XR.getStartingPointOfRoute(XR.route(y))))
                    + getCost(XR.next(XR.getStartingPointOfRoute(XR.route(y))),
                    XR.getTerminatingPointOfRoute(XR.route(y)));
        }
        return newX + newY - oldX - oldY;
    }

    // @Override
    public double evaluateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformOrOptMove(x1, x2, y)) {
            System.out.println(name() + ":: Error evaluateOrOptMove1: " + x1
                    + " " + x2 + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }

        double oldX = getCostRight(XR.getTerminatingPointOfRoute(XR.route(x1)));
        double oldY = getCostRight(XR.getTerminatingPointOfRoute(XR.route(y)));
        double newX = getCostRight(XR.prev(x1))
                + getCost(XR.prev(x1), XR.next(x2))
                + calc(XR.next(x2), XR.getTerminatingPointOfRoute(XR.route(x1)));
        double newY = getCostRight(y) + getCost(y, x1) + calc(x1, x2)
                + getCost(x2, XR.next(y))
                + calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)));
        return newX + newY - oldX - oldY;
    }

    // @Override
    public double evaluateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformOrOptMove(x1, x2, y)) {
            System.out.println(name() + ":: Error evaluateOrOptMove2: " + x1
                    + " " + x2 + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }

        double oldX = getCostRight(XR.getTerminatingPointOfRoute(XR.route(x1)));
        double oldY = getCostRight(XR.getTerminatingPointOfRoute(XR.route(y)));
        double newX = getCostRight(XR.prev(x1))
                + getCost(XR.prev(x1), XR.next(x2))
                + calc(XR.next(x2), XR.getTerminatingPointOfRoute(XR.route(x1)));
        double newY = getCostRight(y) + getCost(y, x2) + calc(x2, x1)
                + getCost(x1, XR.next(y))
                + calc(XR.next(y), XR.getTerminatingPointOfRoute(XR.route(y)));
        return newX + newY - oldX - oldY;
    }

    // @Override
    public double evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove1: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        double newV = getCostRight(x);
        newV += getCost(x, z) + calc(z, XR.next(y));
        newV += getCost(XR.next(y), XR.next(x)) + calc(XR.next(x), y);
        newV += getCost(y, XR.next(z))
                + calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)));
        return newV - getCostRight(XR.getTerminatingPointOfRoute(XR.route(x)));
    }

    // @Override
    public double evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove2: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        double d1 = 0;
        double d2 = 0;
        if (XR.next(z) != XR.getTerminatingPointOfRoute(XR.route(x))) {
            d1 = getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    - getCost(XR.getTerminatingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))));
            d2 = getCostLeft(XR.next(z)) + d1 + getCost(XR.next(z), y);
        } else {
            d2 = getCost(XR.getStartingPointOfRoute(XR.route(x)), y);
        }
        double newV = d2;
        newV += calc(y, XR.next(x));
        newV += getCost(XR.next(x), XR.next(y)) + calc(XR.next(y), z);
        newV += getCost(z, x)
                + calc(x, XR.next(XR.getStartingPointOfRoute(XR.route(x))))
                + getCost(XR.next(XR.getStartingPointOfRoute(XR.route(x))),
                XR.getTerminatingPointOfRoute(XR.route(x)));
        return newV - getCostRight(XR.getTerminatingPointOfRoute(XR.route(x)));

    }

    // @Override
    public double evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove3: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        double newV = getCostRight(x);
        newV += getCost(x, y) + calc(y, XR.next(x));
        newV += getCost(XR.next(x), z) + calc(z, XR.next(y));
        newV += getCost(XR.next(y), XR.next(z))
                + calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)));
        return newV - getCostRight(XR.getTerminatingPointOfRoute(XR.route(x)));
    }

    // @Override
    public double evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove4: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        double d1 = 0;
        double d2 = 0;
        if (XR.next(z) != XR.getTerminatingPointOfRoute(XR.route(x))) {
            d1 = getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    - getCost(XR.getTerminatingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))));
            d2 = getCostLeft(XR.next(z)) + d1 + getCost(XR.next(z), XR.next(y));
        } else {
            d2 = getCost(XR.getStartingPointOfRoute(XR.route(x)), XR.next(y));
        }
        double newV = d2 + calc(XR.next(y), z);
        newV += getCost(z, XR.next(x)) + calc(XR.next(x), y);
        newV += getCost(y, x)
                + calc(x, XR.next(XR.getStartingPointOfRoute(XR.route(x))))
                + getCost(XR.next(XR.getStartingPointOfRoute(XR.route(x))),
                XR.getTerminatingPointOfRoute(XR.route(x)));
        return newV - getCostRight(XR.getTerminatingPointOfRoute(XR.route(x)));
    }

    // @Override
    public double evaluateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove5: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        double newV = getCostRight(x);
        newV += getCost(x, XR.next(y)) + calc(XR.next(y), z);
        newV += getCost(z, XR.next(x)) + calc(XR.next(x), y);
        newV += getCost(y, XR.next(z))
                + calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)));
        return newV - getCostRight(XR.getTerminatingPointOfRoute(XR.route(x)));
    }

    // @Override
    public double evaluateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove6: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        double d1 = 0;
        double d2 = 0;
        if (XR.next(z) != XR.getTerminatingPointOfRoute(XR.route(x))) {
            d1 = getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    - getCost(XR.getTerminatingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))));
            d2 = getCostLeft(XR.next(z)) + d1 + getCost(XR.next(z), y);
        } else {
            d2 = getCost(XR.getStartingPointOfRoute(XR.route(x)), y);
        }
        double newV = d2 + calc(y, XR.next(x));
        newV += getCost(XR.next(x), z) + calc(z, XR.next(y));
        newV += getCost(XR.next(y), x)
                + calc(x, XR.next(XR.getStartingPointOfRoute(XR.route(x))))
                + getCost(XR.next(XR.getStartingPointOfRoute(XR.route(x))),
                XR.getTerminatingPointOfRoute(XR.route(x)));
        return newV - getCostRight(XR.getTerminatingPointOfRoute(XR.route(x)));
    }

    // @Override
    public double evaluateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove7: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        double newV = getCostRight(x);
        newV += getCost(x, XR.next(y)) + calc(XR.next(y), z);
        newV += getCost(z, y) + calc(y, XR.next(x));
        newV += getCost(XR.next(x), XR.next(z))
                + calc(XR.next(z), XR.getTerminatingPointOfRoute(XR.route(x)));

        return newV - getCostRight(XR.getTerminatingPointOfRoute(XR.route(x)));
    }

    // @Override
    public double evaluateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error evaluateThreeOptMove8: " + x
                    + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        double d1 = 0;
        double d2 = 0;
        if (XR.next(z) != XR.getTerminatingPointOfRoute(XR.route(x))) {
            d1 = getCost(XR.getStartingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))))
                    - getCost(XR.getTerminatingPointOfRoute(XR.route(x)),
                    XR.prev(XR.getTerminatingPointOfRoute(XR.route(x))));
            d2 = getCostLeft(XR.next(z)) + d1 + getCost(XR.next(z), XR.next(x));
        } else {
            d2 = getCost(XR.getStartingPointOfRoute(XR.route(x)), XR.next(x));
        }
        double newV = d2 + calc(XR.next(x), y);
        newV += getCost(y, z) + calc(z, XR.next(y));
        newV += getCost(XR.next(y), x)
                + calc(x, XR.next(XR.getStartingPointOfRoute(XR.route(x))))
                + getCost(XR.next(XR.getStartingPointOfRoute(XR.route(x))),
                XR.getTerminatingPointOfRoute(XR.route(x)));
        return newV - getCostRight(XR.getTerminatingPointOfRoute(XR.route(x)));
    }

    // @Override
    public double evaluateCrossExchangeMove(Point x1, Point y1, Point x2,
                                            Point y2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformCrossExchangeMove(x1, y1, x2, y2)) {
            System.out.println(name() + ":: Error evaluateCrossExchangeMove: "
                    + x1 + " " + y1 + " " + x2 + " " + y2 + "\n"
                    + XR.toString());
            System.exit(-1);
        }

        double oldX1 = calc(x1, XR.next(y1));
        double oldX2 = calc(x2, XR.next(y2));
        double newX1 = getCost(x1, XR.next(x2)) + calc(XR.next(x2), y2)
                + getCost(y2, XR.next(y1));
        double newX2 = getCost(x2, XR.next(x1)) + calc(XR.next(x1), y1)
                + getCost(y1, XR.next(y2));
        return newX1 + newX2 - oldX1 - oldX2;
    }

    // @Override
    public double evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoPointsMove(x1, x2, y1, y2)) {
            System.out.println(name() + ":: Error evaluateTwoPointsMove: " + x1
                    + " " + y1 + " " + x2 + " " + y2 + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 2;
        Point[] xx = { x1, x2 };
        Point[] yy = { y1, y2 };
        double eval = 0;
        HashSet<Point> V = new HashSet<Point>();
        for (int i = 0; i < n; i++) {
            Point prev = XR.prev(xx[i]);
            while (V.contains(prev)) {
                prev = XR.prev(prev);
            }
            Point next = XR.next(xx[i]);
            while (V.contains(next)) {
                next = XR.next(next);
            }
            eval += getCost(prev, next) - getCost(prev, xx[i])
                    - getCost(xx[i], next);
            V.add(xx[i]);
        }
        HashMap<Point, Point> M = new HashMap<Point, Point>();
        for (int i = 0; i < n; i++) {
            Point next = XR.next(yy[i]);
            while (V.contains(next)) {
                next = XR.next(next);
            }
            Point prev = yy[i];
            if (M.containsKey(yy[i])) {
                prev = M.get(yy[i]);
            }
            eval += getCost(prev, xx[i]) + getCost(xx[i], next)
                    - getCost(prev, next);
            M.put(yy[i], xx[i]);
        }
        return eval;
    }

    // @Override
    public double evaluateThreePointsMove(Point x1, Point x2, Point x3,
                                          Point y1, Point y2, Point y3) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreePointsMove(x1, x2, x3, y1, y2, y3)) {
            System.out.println(name() + ":: Error evaluateThreePointsMove: "
                    + x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3
                    + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 3;
        Point[] xx = { x1, x2, x3 };
        Point[] yy = { y1, y2, y3 };
        double eval = 0;
        HashSet<Point> V = new HashSet<Point>();
        for (int i = 0; i < n; i++) {
            Point prev = XR.prev(xx[i]);
            while (V.contains(prev)) {
                prev = XR.prev(prev);
            }
            Point next = XR.next(xx[i]);
            while (V.contains(next)) {
                next = XR.next(next);
            }
            eval += getCost(prev, next) - getCost(prev, xx[i])
                    - getCost(xx[i], next);
            V.add(xx[i]);
        }
        HashMap<Point, Point> M = new HashMap<Point, Point>();
        for (int i = 0; i < n; i++) {
            Point next = XR.next(yy[i]);
            while (V.contains(next)) {
                next = XR.next(next);
            }
            Point prev = yy[i];
            if (M.containsKey(yy[i])) {
                prev = M.get(yy[i]);
            }
            eval += getCost(prev, xx[i]) + getCost(xx[i], next)
                    - getCost(prev, next);
            M.put(yy[i], xx[i]);
        }
        return eval;
    }

    // @Override
    public double evaluateFourPointsMove(Point x1, Point x2, Point x3,
                                         Point x4, Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4)) {
            System.out.println(name() + ":: Error evaluateFourPointsMove: "
                    + x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3
                    + " " + x4 + " " + y4 + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 4;
        Point[] xx = { x1, x2, x3, x4 };
        Point[] yy = { y1, y2, y3, y4 };
        double eval = 0;
        HashSet<Point> V = new HashSet<Point>();
        for (int i = 0; i < n; i++) {
            Point prev = XR.prev(xx[i]);
            while (V.contains(prev)) {
                prev = XR.prev(prev);
            }
            Point next = XR.next(xx[i]);
            while (V.contains(next)) {
                next = XR.next(next);
            }
            eval += getCost(prev, next) - getCost(prev, xx[i])
                    - getCost(xx[i], next);
            V.add(xx[i]);
        }
        HashMap<Point, Point> M = new HashMap<Point, Point>();
        for (int i = 0; i < n; i++) {
            Point next = XR.next(yy[i]);
            while (V.contains(next)) {
                next = XR.next(next);
            }
            Point prev = yy[i];
            if (M.containsKey(yy[i])) {
                prev = M.get(yy[i]);
            }
            eval += getCost(prev, xx[i]) + getCost(xx[i], next)
                    - getCost(prev, next);
            M.put(yy[i], xx[i]);
        }
        return eval;
    }

    // @Override
    public double evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformAddOnePoint(x, y)) {
            System.out.println(name() + ":: Error evaluateAddOnePoint: " + x
                    + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        return getCost(y, x) + getCost(x, XR.next(y)) - getCost(y, XR.next(y));
    }

    // @Override
    public double evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformRemoveOnePoint(x)) {
            System.out.println(name() + ":: Error evaluate RemoveOnePoint: "
                    + x + "\n" + XR.toString());
            System.exit(-1);
        }
        return getCost(XR.prev(x), XR.next(x)) - getCost(XR.prev(x), x)
                - getCost(x, XR.next(x));
    }

    //@Override
    public double evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformAddTwoPoints(x1, y1, x2, y2)) {
            System.out.println(name() + ":: Error evaluateAddTwoPoints: " + x1 + " " + y1 + " " + x2 + " " + y2 + "\n" + XR.toString());
            System.exit(-1);
        }
        if(y1 == y2){
            return getCost(y1, x1) + getCost(x1, x2) + getCost(x2, XR.next(y1)) - getCost(y1, XR.next(y1));
        }
        return getCost(y1, x1) + getCost(x1, XR.next(y1)) - getCost(y1, XR.next(y1))
                + getCost(y2, x2) + getCost(x2, XR.next(y2)) - getCost(y2, XR.next(y2));
    }

    //@Override
    public double evaluateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformRemoveTwoPoints(x1, x2)) {
            System.out.println(name() + ":: Error evaluate RemoveTwoPoints: " + x1 + " " + x2 + "\n" + XR.toString());
            System.exit(-1);
        }
        if(x2 == XR.next(x1)){
            return getCost(XR.prev(x1), XR.next(x2)) - getCost(XR.prev(x1), x1)
                    - getCost(x1, x2) - getCost(x2, XR.next(x2));
        }
        return getCost(XR.prev(x1), XR.next(x1)) - getCost(XR.prev(x1), x1) - getCost(x1, XR.next(x1))
                + getCost(XR.prev(x2), XR.next(x2)) - getCost(XR.prev(x2), x2) - getCost(x2, XR.next(x2));
    }

    // @Override
    public double evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformAddRemovePoints(x, y, z)) {
            System.out.println(name() + ":: Error evaluate AddRemovePoints: "
                    + x + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        double eval = 0;
        eval -= getCost(XR.prev(x), x) + getCost(x, XR.next(x));
        eval += getCost(XR.prev(x), XR.next(x));
        if (XR.prev(x) == z) {
            eval += getCost(XR.prev(x), y) + getCost(y, XR.next(x));
            eval -= getCost(XR.prev(x), XR.next(x));
        } else {
            eval += getCost(z, y) + getCost(y, XR.next(z));
            eval -= getCost(z, XR.next(z));
        }
        return eval;
    }

    // @Override
    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        HashSet<Integer> oldR = new HashSet<Integer>();
        for (int i = 0; i < x.size(); i++) {
            Point p = x.get(i);
            Point q = y.get(i);
            if (q != CBLSVR.NULL_POINT) {
                oldR.add(XR.oldRoute(p));
                oldR.add(XR.oldRoute(q));
            } else {
                oldR.add(XR.oldRoute(p));
                costRight[getIndex(p)] = costLeft[getIndex(p)] = 0;
            }
        }
        for (int r : oldR) {
            if (r != Constants.NULL_POINT) {
                value -= getCostRight(XR.getTerminatingPointOfRoute(r));
                update(r);
                value += getCostRight(XR.getTerminatingPointOfRoute(r));
            }
        }
    }

    // @Override
    public double evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformKPointsMove(x, y)) {
            System.out.println(name() + ":: Error evaluateKPointsMove: \n"
                    + XR.toString());
            System.exit(-1);
        }
        int n = x.size();
        double eval = 0;
        HashSet<Point> V = new HashSet<Point>();
        for (int i = 0; i < n; i++) {
            if (XR.route(x.get(i)) != Constants.NULL_POINT) {
                Point prev = XR.prev(x.get(i));
                while (V.contains(prev)) {
                    prev = XR.prev(prev);
                }
                Point next = XR.next(x.get(i));
                while (V.contains(next)) {
                    next = XR.next(next);
                }
                eval += getCost(prev, next) - getCost(prev, x.get(i))
                        - getCost(x.get(i), next);
                V.add(x.get(i));
            }
        }
        HashMap<Point, Point> M = new HashMap<Point, Point>();
        for (int i = 0; i < n; i++) {
            if (y.get(i) != CBLSVR.NULL_POINT) {
                Point next = XR.next(y.get(i));
                while (V.contains(next)) {
                    next = XR.next(next);
                }
                Point prev = y.get(i);
                if (M.containsKey(y.get(i))) {
                    prev = M.get(y.get(i));
                }
                eval += getCost(prev, x.get(i)) + getCost(x.get(i), next)
                        - getCost(prev, next);
                M.put(y.get(i), x.get(i));
            }
        }
        return eval;
    }

    public static void main(String[] avgr) {
        int N = 60;
        int n = 50;
        int K = 5;
        Point[] p = new Point[N];
        SecureRandom rand = new SecureRandom();
        for (int i = 0; i < N; i++) {
            p[i] = new Point(i, rand.nextInt(50), rand.nextInt(50));
        }
        VRManager mgr = new VRManager();
        VarRoutesVR XR = new VarRoutesVR(mgr);
        for (int i = 0; i < n; i++) {
            XR.addClientPoint(p[i]);
        }
        for (int i = n; i < N - K; i++) {
            XR.addRoute(p[i], p[i + K]);
        }
        XR.initSequential();
        ArcWeightsManager awm = new ArcWeightsManager(XR.getAllPoints());
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                awm.setWeight(p[i], p[j], p[i].distance(p[j]));
            }
        }
        IFunctionVR f = new TotalCostVR(XR, awm);

        mgr.close();

        int iter = 0;
        double oldV = 0;
        double newV = 0;
        double delta = 0;
        while (iter < 10000) {
            System.out.println(iter++ + "\n" + XR + "\n");
            // for (int i = 0; i < N; i++) {
            oldV = f.getValue();
            // }
            // int x1 = rand.nextInt(N);
            // int x2 = rand.nextInt(N);
            // int y1 = rand.nextInt(N);
            // int y2 = rand.nextInt(N);
            // int x3 = rand.nextInt(N);
            // int y3 = rand.nextInt(N);
            // int x4 = rand.nextInt(N);
            // int y4 = rand.nextInt(N);
            // while (!XR.checkPerformFourPointsMove(p[x1], p[x2], p[x3], p[x4],
            // p[y1], p[y2], p[y3], p[y4])) {
            // x1 = rand.nextInt(N);
            // y1 = rand.nextInt(N);
            // x2 = rand.nextInt(N);
            // y2 = rand.nextInt(N);
            // x3 = rand.nextInt(N);
            // y3 = rand.nextInt(N);
            // x4 = rand.nextInt(N);
            // y4 = rand.nextInt(N);
            // }
            //
            // System.out.println(p[x1] + " " + p[y1] + " " );
            // //for (int i = 0; i < N; i++) {
            // delta = f.evaluateFourPointsMove(p[x1], p[x2], p[x3], p[x4],
            // p[y1], p[y2], p[y3], p[y4]);
            // //}
            // mgr.performFourPointsMove(p[x1], p[x2], p[x3], p[x4], p[y1],
            // p[y2], p[y3], p[y4]);
            // //for (int i = 0; i < N; i++) {
            // newV = f.getValue();
            // //}
            ArrayList<Point> x = new ArrayList<Point>();
            ArrayList<Point> y = new ArrayList<Point>();
            int count = rand.nextInt(5) + 5;
            for (int i = 0; i < count; i++) {
                x.add(p[rand.nextInt(N)]);
                if (rand.nextInt(5) == 0) {
                    y.add(CBLSVR.NULL_POINT);
                } else {
                    y.add(p[rand.nextInt(N)]);
                }
            }
            while (!XR.checkPerformKPointsMove(x, y)) {
                x.clear();
                y.clear();
                count = rand.nextInt(5) + 5;
                for (int i = 0; i < count; i++) {
                    x.add(p[rand.nextInt(N)]);
                    if (rand.nextInt(5) == 0) {
                        y.add(CBLSVR.NULL_POINT);
                    } else {
                        y.add(p[rand.nextInt(N)]);
                    }
                }
            }
            System.out.println(count);
            for (int i = 0; i < count; i++) {
                System.out.println(x.get(i) + " " + y.get(i));
            }
            // for (int i = 0; i < N; i++) {
            delta = f.evaluateKPointsMove(x, y);
            // }
            mgr.performKPointsMove(x, y);
            // for (int i = 0; i < N; i++) {
            newV = f.getValue();
            // }
            System.out.println(XR);
            // for (int i = 0; i < N; i++) {
            if (Math.abs(oldV + delta - newV) > 1e-6) {
                System.out.println("WTFFFFFFFFFFFFFFFFFFF " + " " + oldV + " "
                        + delta + " " + newV);
                System.exit(-1);
            }
            // }
        }
        System.out.println("Okkkkkkkkkkkkkk");
    }

}

class CBLSVR {
    public static final int MAX_INT = 2147483647;
    public static final double EPSILON = 0.0000000001;
    public static final Point NULL_POINT = new Point(-1);
    public static boolean equal(double a, double b){
        return Math.abs(a-b) < EPSILON;
    }
}

class ValueRoutesVR {
    private HashMap<Point, Point> next;
    private HashMap<Point, Point> prev;
    private HashMap<Point, Integer> route;
    private VarRoutesVR XR;
    private ArrayList<Point> allPoints;

    public ValueRoutesVR(VarRoutesVR XR){
        this.XR = XR;
        this.next = new HashMap<Point, Point>();
        this.prev = new HashMap<Point, Point>();
        this.route = new HashMap<Point, Integer>();

        allPoints = XR.getAllPoints();
        for(Point p : allPoints){
            next.put(p, XR.next(p));
            prev.put(p, XR.prev(p));
            route.put(p, XR.route(p));
        }
    }
    public Point next(Point p){
        return next.get(p);
    }
    public Point prev(Point p){
        return prev.get(p);
    }
    public int route(Point p){
        return route.get(p);
    }
    public void store(){
        for(Point p : allPoints){
            next.put(p, XR.next(p));
            prev.put(p, XR.prev(p));
            route.put(p, XR.route(p));
        }
    }
    public String toString() {
        String s = "";
        for(int k = 1; k <= XR.getNbRoutes(); k++){
            s += "route[" + k + "] = ";
            Point x = XR.getStartingPointOfRoute(k);
            while(x != XR.getTerminatingPointOfRoute(k)){
                s = s + x.getID() + " " + " -> ";
                x = next.get(x);
            }
            s = s + x.getID() + "\n";
        }
        return s;
    }
}

enum PointType {
    STARTING_ROUTE,
    TERMINATING_ROUTE,
    CLIENT
}
/*
 * K: number of vehicles (also the number of routes)
 * n: number of clients
 * Indexing:
 * * N = 2*K+n: total number of points
 * * clients are numbered 1, 2, ..., n
 * * (n+i, n+i+K) are respectively the starting end terminating points of vehicle i, \forall i = 1,...,K
 * * n+i and n+i+K are mapped to the physical depot
 * Modelling solutions:
 * * next[i] is the next point of the point i, next[i] \in {1,...,N}, \forall i = 1,...,N
 * * prev[i] is the previous point of the point i, prev[i]\in {1,...,N}, \forall i=1,...,N
 * * route[i] is the route index of the point i, route[i]\in {1,...,K}, forall i = 1,...,N
 */
class VarRoutesVR{

    private int[] next;
    private int[] prev;
    private int[] route;
    private int N;
    private int K;
    private int n;

    // store old values of next, prev, route
    private int[] old_next;
    private int[] old_prev;
    private int[] old_route;

    private int[] index;

    private PointType[] pointType;
    private ArrayList<Point> startingPoints;
    private ArrayList<Point> terminatingPoints;
    private ArrayList<Point> clientPoints;
    private ArrayList<Point> allPoints;
    private HashMap<Point, Integer> mPoint2Index;
    private int maxNbPoints;
    private VRManager mgr;

    private final int MAXP = 1000;

    public VarRoutesVR(VRManager mgr){
        maxNbPoints = MAXP;

        clientPoints = new ArrayList<Point>();
        startingPoints = new ArrayList<Point>();
        terminatingPoints = new ArrayList<Point>();
        allPoints = new ArrayList<Point>();
        N = 0;
        K = 0; n = 0;
        next = new int[maxNbPoints];
        prev = new int[maxNbPoints];
        route = new int[maxNbPoints];

        old_next = new int[maxNbPoints];
        old_prev = new int[maxNbPoints];
        old_route = new int[maxNbPoints];

        index = new int[maxNbPoints];
        pointType = new PointType[maxNbPoints];

        mPoint2Index = new HashMap<Point, Integer>();

        this.mgr = mgr;
        mgr.post(this);
    }

    private void scaleUp() {
        maxNbPoints += MAXP;
        int[] _next = new int[maxNbPoints];
        int[] _prev = new int[maxNbPoints];
        int[] _route = new int[maxNbPoints];
        int[] _index = new int[maxNbPoints];
        int[] _old_next = new int[maxNbPoints];
        int[] _old_prev = new int[maxNbPoints];
        int[] _old_route = new int[maxNbPoints];
        PointType[] _pointType = new PointType[maxNbPoints];
        System.arraycopy(next, 0, _next, 0, next.length);
        System.arraycopy(prev, 0, _prev, 0, next.length);
        System.arraycopy(route, 0, _route, 0, next.length);
        System.arraycopy(index, 0, _index, 0, next.length);
        System.arraycopy(old_next, 0, _old_next, 0, next.length);
        System.arraycopy(old_prev, 0, _old_prev, 0, next.length);
        System.arraycopy(old_route, 0, _old_route, 0, next.length);
        System.arraycopy(pointType, 0, _pointType, 0, pointType.length);
        next = _next;
        prev = _prev;
        route = _route;
        index = _index;
        old_next = _old_next;
        old_prev = _old_prev;
        old_route = _old_route;
        pointType = _pointType;
    }

    public void addRoute(Point sp, Point tp){
        if (N + 2 > maxNbPoints) {
            scaleUp();
        }

        K++;
        allPoints.add(sp);
        startingPoints.add(sp);
        mPoint2Index.put(sp, N++);
        pointType[N - 1] = PointType.STARTING_ROUTE;

        allPoints.add(tp);
        terminatingPoints.add(tp);
        mPoint2Index.put(tp, N++);
        pointType[N - 1] = PointType.TERMINATING_ROUTE;

        next[N - 2] = N - 1;
        prev[N - 1] = N - 2;
        prev[N - 2] = next[N - 1] = Constants.NULL_POINT;
        route[N - 2] = route[N - 1] = K;
        old_next[N - 2] = old_prev[N - 2] = old_route[N - 2] = Constants.NULL_POINT;
        old_next[N - 1] = old_prev[N - 1] = old_route[N - 1] = Constants.NULL_POINT;
        update(K);
    }

    public void addClientPoint(Point p){
        if(mPoint2Index.get(p) != null) return;
        if (N + 1 > maxNbPoints) {
            scaleUp();
        }
        allPoints.add(p);
        clientPoints.add(p);
        mPoint2Index.put(p, N++);
        pointType[N - 1] = PointType.CLIENT;
        n++;

        next[N - 1] = prev[N - 1] = index[N - 1] = route[N - 1] = Constants.NULL_POINT;
        old_next[N - 1] = old_prev[N - 1] = old_route[N - 1] = Constants.NULL_POINT;
    }

    public ArrayList<Point> getAllPoints(){
        return allPoints;
    }

    public ArrayList<Point> getClientPoints() {
        return clientPoints;
    }

    public ArrayList<Point> getStartingPoints() {
        return startingPoints;
    }

    public ArrayList<Point> getTerminatingPoints() {
        return terminatingPoints;
    }

    public void setValue(ValueRoutesVR val){
        copySolution();
        for (Point p : allPoints) {
            int x = getIndex(p);
            if (val.next(p) != null) {
                next[x] = getIndex(val.next(p));
            }
            if (val.prev(p) != null) {
                prev[x] = getIndex(val.prev(p));
            }
            route[x] = val.route(p);
        }
        for(int k= 1; k <= getNbRoutes(); k++){
            update(k);
        }

        mgr.initPropagation();
    }

    public String toString(){
        String s = "";
        for(int k = 1; k <= K; k++){
            s += "route[" + k + "] = ";
            Point x = getStartingPointOfRoute(k);
            while(x != getTerminatingPointOfRoute(k)){
                s = s + x.getID() + " " + " -> ";
                x = next(x);
            }
            s = s + x.getID() + "\n";
        }
        return s;
    }
    public String routeString(int k){
        String s = "";
        for(Point p = startPoint(k); p != endPoint(k); p = next(p)){
            s += p.ID + " -> ";
        }
        s += endPoint(k).ID;
        return s;
    }
    // return the number of points
    public int getTotalNbPoints(){
        return N;
    }
    public int getNbClients(){
        return n;
    }
    public int getNbRoutes(){
        return K;
    }

    public int getIndex(Point p) {
        if( mPoint2Index.get(p) != null) return mPoint2Index.get(p);
        return Constants.NULL_POINT;
    }
    public Point startPoint(int k){
        return getStartingPointOfRoute(k);
    }
    public Point endPoint(int k){
        return getTerminatingPointOfRoute(k);
    }
    public Point getStartingPointOfRoute(int k){
        return (k <= 0 || k > K) ? null : startingPoints.get(k-1);
    }

    public Point getTerminatingPointOfRoute(int k){
        return (k <= 0 || k > K) ? null : terminatingPoints.get(k-1);
    }

    public VRManager getVRManager(){
        return this.mgr;
    }

    // add the point o to the end of the route k
    private void addPoint2Route(int k, int u) {
        next[prev[getIndex(getTerminatingPointOfRoute(k))]] = u;
        prev[u] = prev[getIndex(getTerminatingPointOfRoute(k))];
        next[u] = getIndex(getTerminatingPointOfRoute(k));
        prev[getIndex(getTerminatingPointOfRoute(k))] = u;
        route[u] = k;
    }

    // remove the point u from its current route
    private void removePointFromRoute(int u) {
        next[prev[u]] = next[u];
        prev[next[u]] = prev[u];
    }

    // reverse the direction of path from s to t on their route
    private void reverse(int s, int t) {
        while (s != t) {
            int tmp = next[s];
            next[s] = prev[s];
            prev[s] = tmp;
            s = next[s];
        }
        int tmp = next[s];
        next[s] = prev[s];
        prev[s] = tmp;
    }

    private void update(int k) {
        int s = getIndex(getStartingPointOfRoute(k));
        int t = getIndex(getTerminatingPointOfRoute(k));
        index[s] = 0;
        for (int x = s; x != t; x = next[x]) {
            index[next[x]] = index[x] + 1;
        }
    }

    public Point next(Point x) {
        int idx = getIndex(x);
        if(idx == Constants.NULL_POINT) return null;
        return (next[idx] == Constants.NULL_POINT) ? null : allPoints.get(next[getIndex(x)]);
    }

    public Point prev(Point x) {
        int idx = getIndex(x);
        if(idx == Constants.NULL_POINT) return null;
        return (prev[idx] == Constants.NULL_POINT) ? null : allPoints.get(prev[getIndex(x)]);
    }

    public int route(Point x) {
        //System.out.println(name() + "::route of point " + x.ID);
        if(getIndex(x) == Constants.NULL_POINT) return Constants.NULL_POINT;
        return route[getIndex(x)];
    }

    public int index(Point x) {
        if(getIndex(x) == Constants.NULL_POINT) return Constants.NULL_POINT;
        return index[getIndex(x)];
    }

    public Point oldNext(Point x) {
        int idx = getIndex(x);
        return (old_next[idx] == Constants.NULL_POINT) ? null : allPoints.get(old_next[getIndex(x)]);
    }

    public Point oldPrev(Point x) {
        int idx = getIndex(x);
        return (old_prev[idx] == Constants.NULL_POINT) ? null : allPoints.get(old_prev[getIndex(x)]);
    }

    public int oldRoute(Point x) {
        if(getIndex(x) == Constants.NULL_POINT) return Constants.NULL_POINT;
        return old_route[getIndex(x)];
    }

    public String name(){
        return "VarRoutesVR";
    }

    public boolean isBefore(Point x, Point y) {
        int idx = getIndex(x);
        int idy = getIndex(y);
        return route[idx] == route[idy] && index[idx] < index[idy];
    }
    public ArrayList<Point> collectCurrentClientPointsOnRoute(){
        ArrayList<Point> L = new ArrayList<Point>();
        for(int k = 1; k <= this.getNbRoutes(); k++){
            for(Point p = next(startPoint(k)); p != endPoint(k); p = next(p)){
                L.add(p);
            }
        }
        return L;
    }
    public ArrayList<Point> collectCurrentClientAndStartPointsOnRoute(){
        ArrayList<Point> L = new ArrayList<Point>();
        for(int k = 1; k <= this.getNbRoutes(); k++){
            for(Point p = startPoint(k); p != endPoint(k); p = next(p)){
                L.add(p);
            }
        }
        return L;
    }
    public ArrayList<Point> collectCurrentPointsOnRoute(){
        ArrayList<Point> L = new ArrayList<Point>();
        for(int k = 1; k <= this.getNbRoutes(); k++){
            for(Point p = startPoint(k); p != endPoint(k); p = next(p)){
                L.add(p);
            }
            L.add(endPoint(k));
        }
        return L;
    }
    private void initRandom(){

        initStartingTerminatingPoints();

        //System.out.println(name() + "::setRandom, add points to a random route");
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            addPoint2Route(rand.nextInt(K) + 1, getIndex(clientPoints.get(i)));
        }
        copySolution();

        //System.out.println(name() + "::setRandom, update route");

        for (int i = 1; i <= K; i++) {
            update(i);
        }
//		Random rand = new Random();
//		int k = rand.nextInt(10) + 1;
//		for (int i = 0; i < k; i++) {
//			int idx = rand.nextInt(N);
//			int idy = rand.nextInt(N);
//			while (!checkPerformTwoPointsMove(allPoints.get(idx), allPoints.get(idy))) {
//				idx = rand.nextInt(N);
//				idy = rand.nextInt(N);
//			}
//			mgr.performTwoPointsMove(allPoints.get(idx), allPoints.get(idy));
//		}
    }

    private void initStartingTerminatingPoints(){
        for (int i = 1; i <= K; i++) {
            int ids = getIndex(getStartingPointOfRoute(i));
            int idt = getIndex(getTerminatingPointOfRoute(i));
            next[ids] = idt;
            prev[idt] = ids;
            prev[ids] = next[idt] = Constants.NULL_POINT;
            route[ids] = route[idt] = i;
        }
    }

    public void initSequential(){
        initStartingTerminatingPoints();
        Random rand = new Random();
        int nbClientsPerRoute = n/K;
        int client = 0;
        for(int k = 1; k < K; k++){
            for(int j = 1; j <= nbClientsPerRoute; j++) {
                addPoint2Route(k, getIndex(clientPoints.get(client++)));
            }
        }
        while(client < n){
            addPoint2Route(K, getIndex(clientPoints.get(client++)));
        }

        copySolution();

        for (int i = 1; i <= K; i++) {
            update(i);
        }
        mgr.initPropagation();
    }


    public void setRandom(){
        initRandom();
        mgr.initPropagation();
    }
    public void initTimeWindowRandom(HashMap<Point,Point> clientpair){

        initStartingTerminatingPoints();

        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            Point p = clientPoints.get(i);
            if(clientpair.containsKey(p))
            {
                int k = rand.nextInt(K) + 1;
                addPoint2Route(k, getIndex(p));
                addPoint2Route(k, getIndex(clientpair.get(p)));
            }

        }
        copySolution();
        for (int i = 1; i <= K; i++) {
            update(i);
        }
    }
    public void setTimeWindow(HashMap<Point,Point>clientpair)
    {
        initTimeWindowRandom(clientpair);
        mgr.initPropagation();
    }

    private void copySolution() {
        System.arraycopy(next, 0, old_next, 0, next.length);
        System.arraycopy(prev, 0, old_prev, 0, prev.length);
        System.arraycopy(route, 0, old_route, 0, route.length);
    }

    public boolean isStartingPoint(Point p){
        int v = getIndex(p);
        return v >= 0 && pointType[v] == PointType.STARTING_ROUTE;
    }

    public boolean isTerminatingPoint(Point p){
        int v = getIndex(p);
        return v >= 0 && pointType[v] == PointType.TERMINATING_ROUTE;
    }

    public boolean isClientPoint(Point p){
        int v = getIndex(p);
        return v >= 0 && pointType[v] == PointType.CLIENT;
    }

    public boolean checkPerformTwoOptMoveOneRoute(Point x, Point y){
        // x and y are in the same route, x is before y
        // remove (x,next[x]) and (y,next[y])
        // add (x,y) and (next[x],next[y]), reverse path from y to next[x]
        int idx = getIndex(x);
        int idy = getIndex(y);
        //if(idx != idy) return false;
        if(!isBefore(x, y)) return false;
        if(y == endPoint(route(y))) return false;
        return true;

    }
    public void performTwoOptMoveOneRoute(Point x, Point y){
        // x and y are in the same route, x is before y
        // remove (x,next[x]) and (y,next[y])
        // add (x,y) and (next[x],next[y]), reverse path from y to next[x]
        if(!checkPerformTwoOptMoveOneRoute(x,y)){
            System.out.println(name() + ":: Error performTwoOptMoveOneRoute: " + x + " " + y + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        performTwoOptMoveOneRoute(idx, idy);
    }
    private void performTwoOptMoveOneRoute(int x, int y){
        // x and y are in the same route, x is before y
        // remove (x,next[x]) and (y,next[y])
        // add (x,y) and (next[x],next[y]), reverse path from y to next[x]
        copySolution();
        int nx = next[x];
        int ny = next[y];
        reverse(y,nx);
        next[x] = y;
        prev[y] = x;
        next[nx] = ny;
        prev[ny] = nx;
        int rX = route[x];
        update(rX);
    }


    // move of type a [Groer et al., 2010]
    // move customer x to from route of x to route of y; insert x into the position between y and next[y]
    // x and y are not the depot
    public boolean checkPerformOnePointMove(Point x, Point y) {
        int idx = getIndex(x);
        int idy = getIndex(y);
        boolean ok1 = isClientPoint(x);
        boolean ok2 = (isStartingPoint(y) || isClientPoint(y));
        boolean ok3 =  x != y;
        boolean ok4 = route[idx] != Constants.NULL_POINT && route[idy] != Constants.NULL_POINT && next(y)!= x;
        return ok1 && ok2 && ok3 && ok4;
    }

    public void performOnePointMove(Point x, Point y){
        if (!checkPerformOnePointMove(x, y)) {
            System.out.println(name() + ":: Error performOnePointMove: " + x + " " + y + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        performOnePointMove(idx, idy);
    }

    private void performOnePointMove(int x, int y){
        copySolution();
        move(x, y);
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(old_route[x]);
        oldR.add(old_route[y]);
        for (int r : oldR) {
            update(r);
        }
    }
    // move of type b [Groer et al., 2010]
    // x and y are on the same route and are not the depots, y locates before x on the route
    // remove (prev[x],x) and (x,next[x]) and (prev[y], y) and (y, next(y)
    // insert (x,prev[y]) and (next[y],x) and (next[x],y) and (y, prev[x])
    public boolean checkPerformTwoPointsMove(Point x, Point y) {
        int idx = getIndex(x);
        int idy = getIndex(y);
        return (isClientPoint(x) && isClientPoint(y) && x != y && route[idx] != Constants.NULL_POINT && route[idy] != Constants.NULL_POINT);
    }

    public void performTwoPointsMove(Point x, Point y){
        if (!checkPerformTwoPointsMove(x, y)) {
            System.out.println(name() + ":: Error performTwoPointsMove: " + x + " " + y + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        performTwoPointsMove(idx, idy);
    }

    private void performTwoPointsMove(int x, int y){
        if (next[x] == y) {
            performTwoPointsMove(y, x, prev[x], prev[x]);
        } else if (next[y] == x) {
            performTwoPointsMove(x, y, prev[y], prev[y]);
        } else {
            performTwoPointsMove(x, y, prev[y], prev[x]);
        }
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,y) and (next[x],next(y))
    public boolean checkPerformTwoOptMove(Point x, Point y) {
        int idx = getIndex(x);
        int idy = getIndex(y);
        return (isClientPoint(x) && isClientPoint(y) && route[idx] != route[idy] && route[idx] != Constants.NULL_POINT && route[idy] != Constants.NULL_POINT);
        //return (isClientPoint(x) && isClientPoint(y) && route[idx] != Constants.NULL_POINT && route[idy] != Constants.NULL_POINT);
    }

    public void performTwoOptMove1(Point x, Point y){
        if (!checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error performTwoOptMove1: " + x + " " + y + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        performTwoOptMove1(idx, idy);
    }

    private void performTwoOptMove1(int x, int y){
        copySolution();

        int nextX = next[x];
        int nextY = next[y];
        int startRX = getIndex(getStartingPointOfRoute(route[x]));
        int startRY = getIndex(getStartingPointOfRoute(route[y]));
        int endRX = getIndex(getTerminatingPointOfRoute(route[x]));
        int endRY = getIndex(getTerminatingPointOfRoute(route[y]));

        reverse(y, startRY);
        reverse(endRX, nextX);
        next[nextX] = nextY;
        prev[nextY] = nextX;
        next[x] = y;
        prev[y] = x;

        next[startRY] = next[endRX];
        prev[next[endRX]] = startRY;
        prev[endRX] = prev[startRY];
        next[prev[startRY]] = endRX;
        next[endRX] = prev[startRY] = Constants.NULL_POINT;

        int rX = route[x];
        int rY = route[y];
        for (int u = getIndex(getStartingPointOfRoute(rX)); u != getIndex(getTerminatingPointOfRoute(rX)); u = next[u]) {
            route[u] = rX;
        }
        for (int u = getIndex(getStartingPointOfRoute(rY)); u != getIndex(getTerminatingPointOfRoute(rY)); u = next[u]) {
            route[u] = rY;
        }
        update(rX);
        update(rY);
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (y,x) and (next[x],next(y))
    public void performTwoOptMove2(Point x, Point y){
        if (!checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error performTwoOptMove2: " + x + " " + y + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        performTwoOptMove2(idx, idy);
    }

    private void performTwoOptMove2(int x, int y){
        copySolution();

        int nextX = next[x];
        int nextY = next[y];
        int startRX = getIndex(getStartingPointOfRoute(route[x]));
        int startRY = getIndex(getStartingPointOfRoute(route[y]));
        int endRX = getIndex(getTerminatingPointOfRoute(route[x]));
        int endRY = getIndex(getTerminatingPointOfRoute(route[y]));

        reverse(x, startRX);
        reverse(endRX, nextX);
        next[nextX] = nextY;
        prev[nextY] = nextX;
        next[y] = x;
        prev[x] = y;

        next[startRX] = next[startRY];
        prev[next[startRY]] = startRX;
        prev[endRX] = prev[startRX];
        next[prev[startRX]] = endRX;
        next[startRY] = next[endRX];
        prev[next[endRX]] = startRY;
        prev[startRX] = next[endRX] = Constants.NULL_POINT;

        int rX = route[x];
        int rY = route[y];
        for (int u = getIndex(getStartingPointOfRoute(rX)); u != getIndex(getTerminatingPointOfRoute(rX)); u = next[u]) {
            route[u] = rX;
        }
        for (int u = getIndex(getStartingPointOfRoute(rY)); u != getIndex(getTerminatingPointOfRoute(rY)); u = next[u]) {
            route[u] = rY;
        }
        update(rX);
        update(rY);
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,y) and (next[y],next(x))
    public void performTwoOptMove3(Point x, Point y){
        if (!checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error performTwoOptMove3: " + x + " " + y + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        performTwoOptMove3(idx, idy);
    }

    public void performTwoOptMove3(int x, int y){
        copySolution();

        int nextX = next[x];
        int nextY = next[y];
        int startRX = getIndex(getStartingPointOfRoute(route[x]));
        int startRY = getIndex(getStartingPointOfRoute(route[y]));
        int endRX = getIndex(getTerminatingPointOfRoute(route[x]));
        int endRY = getIndex(getTerminatingPointOfRoute(route[y]));

        reverse(y, startRY);
        reverse(endRY, nextY);
        next[nextY] = nextX;
        prev[nextX] = nextY;
        next[x] = y;
        prev[y] = x;

        prev[endRY] = prev[endRX];
        next[prev[endRX]] = endRY;
        prev[endRX] = prev[startRY];
        next[prev[startRY]] = endRX;
        next[startRY] = next[endRY];
        prev[next[endRY]] = startRY;
        prev[startRY] = next[endRY] = Constants.NULL_POINT;

        int rX = route[x];
        int rY = route[y];
        for (int u = getIndex(getStartingPointOfRoute(rX)); u != getIndex(getTerminatingPointOfRoute(rX)); u = next[u]) {
            route[u] = rX;
        }
        for (int u = getIndex(getStartingPointOfRoute(rY)); u != getIndex(getTerminatingPointOfRoute(rY)); u = next[u]) {
            route[u] = rY;
        }
        update(rX);
        update(rY);
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (y,x) and (next[y],next(x))
    public void performTwoOptMove4(Point x, Point y){
        if (!checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error performTwoOptMove4: " + x + " " + y + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        performTwoOptMove4(idx, idy);
    }

    private void performTwoOptMove4(int x, int y){
        copySolution();

        int nextX = next[x];
        int nextY = next[y];
        int startRX = getIndex(getStartingPointOfRoute(route[x]));
        int startRY = getIndex(getStartingPointOfRoute(route[y]));
        int endRX = getIndex(getTerminatingPointOfRoute(route[x]));
        int endRY = getIndex(getTerminatingPointOfRoute(route[y]));

        reverse(x, startRX);
        reverse(endRY, nextY);
        next[nextY] = nextX;
        prev[nextX] = nextY;
        next[y] = x;
        prev[x] = y;

        prev[endRY] = prev[endRX];
        next[prev[endRX]] = endRY;
        next[startRX] = next[startRY];
        prev[next[startRY]] = startRX;
        prev[endRX] = prev[startRX];
        next[prev[startRX]] = endRX;
        next[startRY] = next[endRY];
        prev[next[endRY]] = startRY;
        prev[startRX] = next[endRY] = Constants.NULL_POINT;

        int rX = route[x];
        int rY = route[y];
        for (int u = getIndex(getStartingPointOfRoute(rX)); u != getIndex(getTerminatingPointOfRoute(rX)); u = next[u]) {
            route[u] = rX;
        }
        for (int u = getIndex(getStartingPointOfRoute(rY)); u != getIndex(getTerminatingPointOfRoute(rY)); u = next[u]) {
            route[u] = rY;
        }
        update(rX);
        update(rY);
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,next[y]) and (y,next[x])
    public void performTwoOptMove5(Point x, Point y){
        if (!checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error performTwoOptMove5: " + x + " " + y + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        performTwoOptMove5(idx, idy);
    }

    private void performTwoOptMove5(int x, int y){
        copySolution();

        int nextX = next[x];
        int nextY = next[y];
        int endRX = getIndex(getTerminatingPointOfRoute(route[x]));
        int endRY = getIndex(getTerminatingPointOfRoute(route[y]));

        next[x] = nextY;
        prev[nextY] = x;
        next[y] = nextX;
        prev[nextX] = y;

        int tmp = prev[endRX];
        prev[endRX] = prev[endRY];
        prev[endRY] = tmp;
        next[prev[endRX]] = endRX;
        next[prev[endRY]] = endRY;

        int rX = route[x];
        int rY = route[y];
        for (int u = getIndex(getStartingPointOfRoute(rX)); u != getIndex(getTerminatingPointOfRoute(rX)); u = next[u]) {
            route[u] = rX;
        }
        for (int u = getIndex(getStartingPointOfRoute(rY)); u != getIndex(getTerminatingPointOfRoute(rY)); u = next[u]) {
            route[u] = rY;
        }
        update(rX);
        update(rY);
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (next[y],x) and (y,next[x])
    public void performTwoOptMove6(Point x, Point y){
        if (!checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error performTwoOptMove6: " + x + " " + y + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        performTwoOptMove6(idx, idy);
    }

    private void performTwoOptMove6(int x, int y){
        copySolution();

        int nextX = next[x];
        int nextY = next[y];
        int startRX = getIndex(getStartingPointOfRoute(route[x]));
        int startRY = getIndex(getStartingPointOfRoute(route[y]));
        int endRX = getIndex(getTerminatingPointOfRoute(route[x]));
        int endRY = getIndex(getTerminatingPointOfRoute(route[y]));

        reverse(x, startRX);
        reverse(endRY, nextY);
        next[y] = nextX;
        prev[nextX] = y;
        next[nextY] = x;
        prev[x] = nextY;

        prev[endRY] = prev[endRX];
        next[prev[endRX]] = endRY;
        next[startRX] = next[endRY];
        prev[next[endRY]] = startRX;
        prev[endRX] = prev[startRX];
        next[prev[startRX]] = endRX;
        next[endRY] = prev[startRX] = Constants.NULL_POINT;

        int rX = route[x];
        int rY = route[y];
        for (int u = getIndex(getStartingPointOfRoute(rX)); u != getIndex(getTerminatingPointOfRoute(rX)); u = next[u]) {
            route[u] = rX;
        }
        for (int u = getIndex(getStartingPointOfRoute(rY)); u != getIndex(getTerminatingPointOfRoute(rY)); u = next[u]) {
            route[u] = rY;
        }
        update(rX);
        update(rY);
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,next[y]) and (next[x],y)
    public void performTwoOptMove7(Point x, Point y){
        if (!checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error performTwoOptMove7: " + x + " " + y + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        performTwoOptMove7(idx, idy);
    }

    private void performTwoOptMove7(int x, int y){
        copySolution();

        int nextX = next[x];
        int nextY = next[y];
        int startRX = getIndex(getStartingPointOfRoute(route[x]));
        int startRY = getIndex(getStartingPointOfRoute(route[y]));
        int endRX = getIndex(getTerminatingPointOfRoute(route[x]));
        int endRY = getIndex(getTerminatingPointOfRoute(route[y]));

        reverse(endRX, nextX);
        reverse(y, startRY);
        next[x] = nextY;
        prev[nextY] = x;
        next[nextX] = y;
        prev[y] = nextX;

        prev[endRX] = prev[endRY];
        next[prev[endRY]] = endRX;
        next[startRY] = next[endRX];
        prev[next[endRX]] = startRY;
        prev[endRY] = prev[startRY];
        next[prev[startRY]] = endRY;
        next[endRX] = prev[startRY] = Constants.NULL_POINT;

        int rX = route[x];
        int rY = route[y];
        for (int u = getIndex(getStartingPointOfRoute(rX)); u != getIndex(getTerminatingPointOfRoute(rX)); u = next[u]) {
            route[u] = rX;
        }
        for (int u = getIndex(getStartingPointOfRoute(rY)); u != getIndex(getTerminatingPointOfRoute(rY)); u = next[u]) {
            route[u] = rY;
        }
        update(rX);
        update(rY);
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (next[y],x) and (next[x],y)
    public void performTwoOptMove8(Point x, Point y){
        if (!checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error performTwoOptMove8: " + x + " " + y + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        performTwoOptMove8(idx, idy);
    }

    private void performTwoOptMove8(int x, int y){
        copySolution();

        int nextX = next[x];
        int nextY = next[y];
        int startRX = getIndex(getStartingPointOfRoute(route[x]));
        int startRY = getIndex(getStartingPointOfRoute(route[y]));
        int endRX = getIndex(getTerminatingPointOfRoute(route[x]));
        int endRY = getIndex(getTerminatingPointOfRoute(route[y]));

        reverse(endRX, startRX);
        reverse(endRY, startRY);
        next[nextX] = y;
        prev[y] = nextX;
        next[nextY] = x;
        prev[x] = nextY;

        next[startRX] = next[endRY];
        prev[next[endRY]] = startRX;
        next[startRY] = next[endRX];
        prev[next[endRX]] = startRY;
        prev[endRX] = prev[startRX];
        next[prev[startRX]] = endRX;
        prev[endRY] = prev[startRY];
        next[prev[startRY]] = endRY;
        next[endRX] = next[endRY] = Constants.NULL_POINT;
        prev[startRX] = prev[startRY] = Constants.NULL_POINT;

        int rX = route[x];
        int rY = route[y];
        for (int u = getIndex(getStartingPointOfRoute(rX)); u != getIndex(getTerminatingPointOfRoute(rX)); u = next[u]) {
            route[u] = rX;
        }
        for (int u = getIndex(getStartingPointOfRoute(rY)); u != getIndex(getTerminatingPointOfRoute(rY)); u = next[u]) {
            route[u] = rY;
        }
        update(rX);
        update(rY);
    }

    // move of type d [Groer et al., 2010]
    // move the sequence <x1,next[x1],..., prev[x2], x2> of length len to the route containing y
    // remove (prev[x1],x1) and (x2,next[x2]), and (y,next[y])
    // add (y, x1) and (x2, next[y]) and (prev[x1], next[x2])
    public boolean checkPerformOrOptMove(Point x1, Point x2, Point y) {
        int idx1 = getIndex(x1);
        int idx2 = getIndex(x2);
        int idy = getIndex(y);
        if (!isClientPoint(x1) || route[idx1] == Constants.NULL_POINT) {
            return false;
        }
        if (!isClientPoint(x2) || route[idx2] == Constants.NULL_POINT) {
            return false;
        }
        if (isTerminatingPoint(y) || route[idy] == Constants.NULL_POINT) {
            return false;
        }
        return (route[idx1] == route[idx2] && index[idx1] < index[idx2] && route[idx1] != route[idy]);
    }

    public void performOrOptMove1(Point x1, Point x2, Point y){
        if (!checkPerformOrOptMove(x1, x2, y)) {
            System.out.println(name() + ":: Error performOrOptMove1: " + x1 + " " + x2 + " " + y + "\n" + toString());
            System.exit(-1);
        }
        int idx1 = getIndex(x1);
        int idx2 = getIndex(x2);
        int idy = getIndex(y);
        performOrOptMove1(idx1, idx2, idy);
    }

    private void performOrOptMove1(int x1, int x2, int y){
        copySolution();

        int prevX1 = prev[x1];
        int nextX2 = next[x2];
        int nextY = next[y];

        next[prevX1] = nextX2;
        prev[nextX2] = prevX1;
        next[x2] = nextY;
        prev[nextY] = x2;
        next[y] = x1;
        prev[x1] = y;

        int rX = route[x1];
        int rY = route[y];
        for (int u = getIndex(getStartingPointOfRoute(rX)); u != getIndex(getTerminatingPointOfRoute(rX)); u = next[u]) {
            route[u] = rX;
        }
        for (int u = getIndex(getStartingPointOfRoute(rY)); u != getIndex(getTerminatingPointOfRoute(rY)); u = next[u]) {
            route[u] = rY;
        }
        update(rX);
        update(rY);
    }

    // move of type d [Groer et al., 2010]
    // move the sequence <x1,next[x1],..., prev[x2], x2> of length len to the route containing y
    // remove (prev[x1],x1) and (x2,next[x2]), and (y,next[y])
    // add (y, x2) and (x1, next[y]) and (prev[x1], next[x2])
    public void performOrOptMove2(Point x1, Point x2, Point y){
        if (!checkPerformOrOptMove(x1, x2, y)) {
            System.out.println(name() + ":: Error performOrOptMove2: " + x1 + " " + x2 + " " + y + "\n" + toString());
            System.exit(-1);
        }
        int idx1 = getIndex(x1);
        int idx2 = getIndex(x2);
        int idy = getIndex(y);
        performOrOptMove2(idx1, idx2, idy);
    }

    private void performOrOptMove2(int x1, int x2, int y){
        copySolution();

        int prevX1 = prev[x1];
        int nextX2 = next[x2];
        int nextY = next[y];

        reverse(x2, x1);
        next[prevX1] = nextX2;
        prev[nextX2] = prevX1;
        next[x1] = nextY;
        prev[nextY] = x1;
        next[y] = x2;
        prev[x2] = y;

        int rX = route[x1];
        int rY = route[y];
        for (int u = getIndex(getStartingPointOfRoute(rX)); u != getIndex(getTerminatingPointOfRoute(rX)); u = next[u]) {
            route[u] = rX;
        }
        for (int u = getIndex(getStartingPointOfRoute(rY)); u != getIndex(getTerminatingPointOfRoute(rY)); u = next[u]) {
            route[u] = rY;
        }
        update(rX);
        update(rY);
    }


    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,z) and (next[y], next[x]) and(y, next[z])
    public boolean checkPerformThreeOptMove(Point x, Point y, Point z) {
        int idx = getIndex(x);
        int idy = getIndex(y);
        int idz = getIndex(z);
        if (!isClientPoint(x)) {
            return false;
        }
        if (!isClientPoint(z)) {
            return false;
        }
        if (!isClientPoint(y)) {
            return false;
        }
        //System.out.println(route[x] + " " + route[y] + " " + route[z] + " " + index[x] + " " + index[y] + " " + index[z]);
        return route[idx] != Constants.NULL_POINT && route[idx] == route[idy] && route[idx] == route[idz] && index[idx] < index[idy] && index[idy] < index[idz];
    }

    public void performThreeOptMove1(Point x, Point y, Point z){
        if (!checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error performThreeOptMove1: " + x + " " + y + " " + z + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        int idz = getIndex(z);
        performThreeOptMove1(idx, idy, idz);
    }

    private void performThreeOptMove1(int x, int y, int z){
        copySolution();

        int nextX = next[x];
        int nextY = next[y];
        int nextZ = next[z];

        reverse(z, nextY);
        next[x] = z;
        prev[z] = x;
        next[nextY] = nextX;
        prev[nextX] = nextY;
        next[y] = nextZ;
        prev[nextZ] = y;

        update(route[x]);
    }

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (z,x) and (next[x], next[y]) and(next[z],y)
    public void performThreeOptMove2(Point x, Point y, Point z){
        if (!checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error performThreeOptMove2: " + x + " " + y + " " + z + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        int idz = getIndex(z);
        performThreeOptMove2(idx, idy, idz);
    }

    private void performThreeOptMove2(int x, int y, int z){
        copySolution();

        int nextX = next[x];
        int nextY = next[y];
        int nextZ = next[z];
        int startR = getIndex(getStartingPointOfRoute(route[x]));
        int endR = getIndex(getTerminatingPointOfRoute(route[x]));

        reverse(endR, nextZ);
        reverse(x, startR);
        reverse(y, nextX);

        next[nextZ] = y;
        prev[y] = nextZ;
        next[nextX] = nextY;
        prev[nextY] = nextX;
        next[z] = x;
        prev[x] = z;
        next[startR] = next[endR];
        prev[next[endR]] = startR;
        prev[endR] = prev[startR];
        next[prev[startR]] = endR;
        next[endR] = prev[startR] = Constants.NULL_POINT;

        update(route[x]);
    }

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,y) and (next[x], z) and(next[y], next[z])
    public void performThreeOptMove3(Point x, Point y, Point z){
        if (!checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error performThreeOptMove3: " + x + " " + y + " " + z + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        int idz = getIndex(z);
        performThreeOptMove3(idx, idy, idz);
    }

    private void performThreeOptMove3(int x, int y, int z){
        copySolution();

        int nextX = next[x];
        int nextY = next[y];
        int nextZ = next[z];

        reverse(y, nextX);
        reverse(z, nextY);

        next[x] = y;
        prev[y] = x;
        next[nextX] = z;
        prev[z] = nextX;
        next[nextY] = nextZ;
        prev[nextZ] = nextY;

        update(route[x]);
    }

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (y,x) and (z,next[x]) and(next[z], next[y])
    public void performThreeOptMove4(Point x, Point y, Point z){
        if (!checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error performThreeOptMove4: " + x + " " + y + " " + z + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        int idz = getIndex(z);
        performThreeOptMove4(idx, idy, idz);
    }

    private void performThreeOptMove4(int x, int y, int z){
        copySolution();

        int nextX = next[x];
        int nextY = next[y];
        int nextZ = next[z];
        int startR = getIndex(getStartingPointOfRoute(route[x]));
        int endR = getIndex(getTerminatingPointOfRoute(route[x]));

        reverse(endR, nextZ);
        reverse(x, startR);

        next[y] = x;
        prev[x] = y;
        next[z] = nextX;
        prev[nextX] = z;
        next[nextZ] = nextY;
        prev[nextY] = nextZ;
        next[startR] = next[endR];
        prev[next[endR]] = startR;
        prev[endR] = prev[startR];
        next[prev[startR]] = endR;
        next[endR] = prev[startR] = Constants.NULL_POINT;

        update(route[x]);
    }

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,next[y]) and (z,next[x]) and(y, next[z])
    public void performThreeOptMove5(Point x, Point y, Point z){
        if (!checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error performThreeOptMove5: " + x + " " + y + " " + z + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        int idz = getIndex(z);
        performThreeOptMove5(idx, idy, idz);
    }

    private void performThreeOptMove5(int x, int y, int z){
        copySolution();

        int nextX = next[x];
        int nextY = next[y];
        int nextZ = next[z];

        next[x] = nextY;
        prev[nextY] = x;
        next[z] = nextX;
        prev[nextX] = z;
        next[y] = nextZ;
        prev[nextZ] = y;

        update(route[x]);
    }

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (next[y],x) and (next[x],z) and(next[z],y)
    public void performThreeOptMove6(Point x, Point y, Point z){
        if (!checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error performThreeOptMove6: " + x + " " + y + " " + z + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        int idz = getIndex(z);
        performThreeOptMove6(idx, idy, idz);
    }

    private void performThreeOptMove6(int x, int y, int z){
        copySolution();

        int nextX = next[x];
        int nextY = next[y];
        int nextZ = next[z];
        int startR = getIndex(getStartingPointOfRoute(route[x]));
        int endR = getIndex(getTerminatingPointOfRoute(route[x]));

        reverse(endR, nextZ);
        reverse(y, nextX);
        reverse(z, nextY);
        reverse(x, startR);

        next[nextY] = x;
        prev[x] = nextY;
        next[nextX] = z;
        prev[z] = nextX;
        next[nextZ] = y;
        prev[y] = nextZ;
        next[startR] = next[endR];
        prev[next[endR]] = startR;
        prev[endR] = prev[startR];
        next[prev[startR]] = endR;
        next[endR] = prev[startR] = Constants.NULL_POINT;

        update(route[x]);
    }

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,next[y]) and (z,y) and(next[x], next[z])
    public void performThreeOptMove7(Point x, Point y, Point z){
        if (!checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error performThreeOptMove7: " + x + " " + y + " " + z + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        int idz = getIndex(z);
        performThreeOptMove7(idx, idy, idz);
    }

    private void performThreeOptMove7(int x, int y, int z){
        copySolution();

        int nextX = next[x];
        int nextY = next[y];
        int nextZ = next[z];

        reverse(y, nextX);

        next[x] = nextY;
        prev[nextY] = x;
        next[z] = y;
        prev[y] = z;
        next[nextX] = nextZ;
        prev[nextZ] = nextX;

        update(route[x]);
    }

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (next[y],x) and (y,z) and(next[z], next[x])
    public void performThreeOptMove8(Point x, Point y, Point z){
        if (!checkPerformThreeOptMove(x, y, z)) {
            System.out.println(name() + ":: Error performThreeOptMove8: " + x + " " + y + " " + z + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        int idz = getIndex(z);
        performThreeOptMove8(idx, idy, idz);
    }

    private void performThreeOptMove8(int x, int y, int z){
        copySolution();

        int nextX = next[x];
        int nextY = next[y];
        int nextZ = next[z];
        int startR = getIndex(getStartingPointOfRoute(route[x]));
        int endR = getIndex(getTerminatingPointOfRoute(route[x]));

        reverse(endR, nextZ);
        reverse(z, nextY);
        reverse(x, startR);

        next[nextY] = x;
        prev[x] = nextY;
        next[y] = z;
        prev[z] = y;
        next[nextZ] = nextX;
        prev[nextX] = nextZ;
        next[startR] = next[endR];
        prev[next[endR]] = startR;
        prev[endR] = prev[startR];
        next[prev[startR]] = endR;
        next[endR] = prev[startR] = Constants.NULL_POINT;

        update(route[x]);
    }


    // move of type g [Groer et al., 2010]
    // x1 and y1 are on the same route, x1 is before y1
    // x2 and y2 are on the same route, x2 is before y2
    // remove (x1,next[x1]) and (y1, next[y1])
    // remove (x2, next[x2]) and (y2, next[y2])
    // insert (x1, next[x2]) and (y2, next[y1])
    // insert (x2, next[x1]) and (y1, next[y2])
    public boolean checkPerformCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        int idx1 = getIndex(x1);
        int idy1 = getIndex(y1);
        int idx2 = getIndex(x2);
        int idy2 = getIndex(y2);
        if (!isClientPoint(y1)) {
            return false;
        }
        if (!isClientPoint(y2)) {
            return false;
        }
        if (route[idx1] == route[idx2] || route[idx1] == Constants.NULL_POINT || route[idx2] == Constants.NULL_POINT) {
            return false;
        }
        return (route[idx1] == route[idy1] && route[idx2] == route[idy2] && index[idx1] < index[idy1] && index[idx2] < index[idy2]);
    }

    public void performCrossExchangeMove(Point x1, Point y1, Point x2, Point y2){
        if (!checkPerformCrossExchangeMove(x1, y1, x2, y2)) {
            System.out.println(name() + ":: Error performCrossExchangeMove: " + x1 + " " + y1 + " " + x2 + " " + y2 + "\n" + toString());
            System.exit(-1);
        }
        int idx1 = getIndex(x1);
        int idy1 = getIndex(y1);
        int idx2 = getIndex(x2);
        int idy2 = getIndex(y2);
        performCrossExchangeMove(idx1, idy1, idx2, idy2);
    }

    private void performCrossExchangeMove(int x1, int y1, int x2, int y2){
        copySolution();

        int nextX1 = next[x1];
        int nextY1 = next[y1];
        int nextX2 = next[x2];
        int nextY2 = next[y2];

        next[x1] = nextX2;
        prev[nextX2] = x1;
        next[x2] = nextX1;
        prev[nextX1] = x2;
        next[y1] = nextY2;
        prev[nextY2] = y1;
        next[y2] = nextY1;
        prev[nextY1] = y2;

        int rX = route[x1];
        int rY = route[x2];
        for (int u = getIndex(getStartingPointOfRoute(rX)); u != getIndex(getTerminatingPointOfRoute(rX)); u = next[u]) {
            route[u] = rX;
        }
        for (int u = getIndex(getStartingPointOfRoute(rY)); u != getIndex(getTerminatingPointOfRoute(rY)); u = next[u]) {
            route[u] = rY;
        }

        update(rX);
        update(rY);
    }

    public boolean checkPerformTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        Point[] x = {x1, x2};
        Point[] y = {y1, y2};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (x[i] == y[j]) {
                    return false;
                }
            }
            if (!isClientPoint(x[i]) || route[getIndex(x[i])] == Constants.NULL_POINT) {
                return false;
            }
            if ((!isClientPoint(y[i]) && !isStartingPoint(y[i])) || route[getIndex(y[i])] == Constants.NULL_POINT) {
                return false;
            }
        }
        return x1 != x2;
    }

    public boolean checkPerformThreePointsMove(Point x1, Point x2, Point x3, Point y1, Point y2, Point y3) {
        Point[] x = {x1, x2, x3};
        Point[] y = {y1, y2, y3};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (x[i] == y[j]) {
                    return false;
                }
            }
            for (int j = i + 1; j < 3; j++) {
                if (x[i] == x[j]) {
                    return false;
                }
            }
            if (!isClientPoint(x[i]) || route[getIndex(x[i])] == Constants.NULL_POINT) {
                return false;
            }
            if ((!isClientPoint(y[i]) && !isStartingPoint(y[i])) || route[getIndex(y[i])] == Constants.NULL_POINT) {
                return false;
            }
        }
        return true;
    }

    public boolean checkPerformFourPointsMove(Point x1, Point x2, Point x3, Point x4, Point y1, Point y2, Point y3, Point y4) {
        Point[] x = {x1, x2, x3, x4};
        Point[] y = {y1, y2, y3, y4};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (x[i] == y[j]) {
                    return false;
                }
            }
            for (int j = i + 1; j < 4; j++) {
                if (x[i] == x[j]) {
                    return false;
                }
            }
            if (!isClientPoint(x[i]) || route[getIndex(x[i])] == Constants.NULL_POINT) {
                return false;
            }
            if ((!isClientPoint(y[i]) && !isStartingPoint(y[i])) || route[getIndex(y[i])] == Constants.NULL_POINT) {
                return false;
            }
        }
        return true;
    }

    private void move(int x, int y) {
        if (route[x] != Constants.NULL_POINT) {
            next[prev[x]] = next[x];
            prev[next[x]] = prev[x];
        }
        route[x] = route[y];
        next[x] = next[y];
        prev[next[y]] = x;
        prev[x] = y;
        next[y] = x;
    }

    // remove x1, x2 from their current routes
    // re-insert x1 between y1 and next[y1]
    // re-insert x2 between y2 and next[y2]
    public void performTwoPointsMove(Point x1, Point x2, Point y1, Point y2){
        if (!checkPerformTwoPointsMove(x1, x2, y1, y2)) {
            System.out.println(name() + ":: Error performTwoPointsMove: " + x1 + " " + y1 + " " + x2 + " " + y2 + "\n" + toString());
            System.exit(-1);
        }
        int idx1 = getIndex(x1);
        int idy1 = getIndex(y1);
        int idx2 = getIndex(x2);
        int idy2 = getIndex(y2);
        performTwoPointsMove(idx1, idx2, idy1, idy2);
    }

    private void performTwoPointsMove(int x1, int x2, int y1, int y2){
        copySolution();
        move(x2, y2);
        move(x1, y1);
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(old_route[x1]);
        oldR.add(old_route[y1]);
        oldR.add(old_route[x2]);
        oldR.add(old_route[y2]);
        for (int r : oldR) {
            update(r);
        }
    }

    // remove x1, x2, x3 from their current routes
    // re-insert x1 between y1 and next[y1]
    // re-insert x2 between y2 and next[y2]
    // re-insert x3 between y3 and next[y3]
    public void performThreePointsMove (Point x1, Point x2, Point x3, Point y1, Point y2, Point y3){
        if (!checkPerformThreePointsMove(x1, x2, x3, y1, y2, y3)) {
            System.out.println(name() + ":: Error performThreePointsMove: " + x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3 + "\n" + toString());
            System.exit(-1);
        }
        int idx1 = getIndex(x1);
        int idy1 = getIndex(y1);
        int idx2 = getIndex(x2);
        int idy2 = getIndex(y2);
        int idx3 = getIndex(x3);
        int idy3 = getIndex(y3);
        performThreePointsMove(idx1, idx2, idx3, idy1, idy2, idy3);
    }

    private void performThreePointsMove(int x1, int x2, int x3, int y1, int y2, int y3){
        copySolution();
        move(x3, y3);
        move(x2, y2);
        move(x1, y1);
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(old_route[x1]);
        oldR.add(old_route[y1]);
        oldR.add(old_route[x2]);
        oldR.add(old_route[y2]);
        oldR.add(old_route[x3]);
        oldR.add(old_route[y3]);
        for (int r : oldR) {
            update(r);
        }
    }

    // remove x1, x2, x3, x4 from their current routes
    // re-insert x1 between y1 and next[y1]
    // re-insert x2 between y2 and next[y2]
    // re-insert x3 between y3 and next[y3]
    // re-insert x4 between y4 and next[y4]
    public void performFourPointsMove(Point x1, Point x2, Point x3, Point x4, Point y1, Point y2, Point y3, Point y4){
        if (!checkPerformFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4)) {
            System.out.println(name() + ":: Error performFourPointsMove: " + x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3 + " " + x4 + " " + y4 + "\n" + toString());
            System.exit(-1);
        }
        int idx1 = getIndex(x1);
        int idy1 = getIndex(y1);
        int idx2 = getIndex(x2);
        int idy2 = getIndex(y2);
        int idx3 = getIndex(x3);
        int idy3 = getIndex(y3);
        int idx4 = getIndex(x4);
        int idy4 = getIndex(y4);
        performFourPointsMove(idx1, idx2, idx3, idx4, idy1, idy2, idy3, idy4);
    }

    private void performFourPointsMove(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4){
        copySolution();
        move(x4, y4);
        move(x3, y3);
        move(x2, y2);
        move(x1, y1);
        HashSet<Integer> oldR = new HashSet<Integer>();
        oldR.add(old_route[x1]);
        oldR.add(old_route[y1]);
        oldR.add(old_route[x2]);
        oldR.add(old_route[y2]);
        oldR.add(old_route[x3]);
        oldR.add(old_route[y3]);
        oldR.add(old_route[x4]);
        oldR.add(old_route[y4]);
        for (int r : oldR) {
            update(r);
        }
    }
    public boolean contains(Point x){
        boolean ok = getIndex(x) != Constants.NULL_POINT;
        if(!ok) return ok;
        return route[getIndex(x)] != Constants.NULL_POINT;
    }
    public boolean checkPerformAddOnePoint(Point x, Point y) {
        return (route[getIndex(x)] == Constants.NULL_POINT && isClientPoint(x) && (isClientPoint(y) ||
                isStartingPoint(y)) && route[getIndex(y)] != Constants.NULL_POINT);
    }

    public boolean checkPerformAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        return (route[getIndex(x1)] == Constants.NULL_POINT && isClientPoint(x1) && (isClientPoint(y1) ||
                isStartingPoint(y1)) && route[getIndex(y1)] != Constants.NULL_POINT
                && route[getIndex(x2)] == Constants.NULL_POINT && isClientPoint(x2) && (isClientPoint(y2) ||
                isStartingPoint(y2)) && route[getIndex(y2)] != Constants.NULL_POINT
                && route[getIndex(y1)] == route[getIndex(y2)] && index[getIndex(y1)] <= index[getIndex(y2)]);
    }

    public void performAddOnePoint(Point x, Point y){
        // add point x between y and next[y]
        if (!checkPerformAddOnePoint(x, y)) {
            System.out.println(name() + ":: Error performAddOneMove: " + x + " " + y + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        performAddOnePoint(idx, idy);
    }

    private void performAddOnePoint(int x, int y){
        copySolution();
        prev[next[y]] = x;
        next[x] = next[y];
        prev[x] = y;
        next[y] = x;
        route[x] = route[y];
        update(route[x]);
    }

    private void performAddTwoPoint(int x1, int y1, int x2, int y2){
        copySolution();
        if(y1 != y2){
            prev[next[y1]] = x1;
            next[x1] = next[y1];
            prev[x1] = y1;
            next[y1] = x1;
            route[x1] = route[y1];

            prev[next[y2]] = x2;
            next[x2] = next[y2];
            prev[x2] = y2;
            next[y2] = x2;
            route[x2] = route[y2];
        }
        else{
            prev[next[y1]] = x2;
            next[x2] = next[y1];
            prev[x2] = x1;
            next[x1] = x2;
            prev[x1] = y1;
            next[y1] = x1;
            route[x1] = route[y1];
            route[x2] = route[y1];
        }
        update(route[x1]);
    }

    public void performAddTwoPoints(Point x1, Point y1, Point x2, Point y2){
        if (!checkPerformAddTwoPoints(x1, y1, x2, y2)) {
            System.out.println(name() + ":: Error performAddTwoPoints: " + x1 + " " + y1 + " " + x2 + " " + y2 + "\n" + toString());
            System.exit(-1);
        }
        int idx1 = getIndex(x1);
        int idy1 = getIndex(y1);
        int idx2 = getIndex(x2);
        int idy2 = getIndex(y2);
        performAddTwoPoint(idx1, idy1, idx2, idy2);
    }

    public boolean checkPerformRemoveOnePoint(Point x) {
        if(route[getIndex(x)] == Constants.NULL_POINT){
            System.out.println("Null point");
        }
        if(!isClientPoint(x)){
            System.out.println("not client point");
        }
        return (route[getIndex(x)] != Constants.NULL_POINT && isClientPoint(x));
    }

    public boolean checkPerformRemoveTwoPoints(Point x1, Point x2) {
        return (route[getIndex(x1)] != Constants.NULL_POINT && isClientPoint(x1)
                && route[getIndex(x2)] != Constants.NULL_POINT && isClientPoint(x2)
                && index[getIndex(x1)] < index[getIndex(x2)]);
    }

    public void performRemoveOnePoint(Point x){
        // remove x from its current route
        if (!checkPerformRemoveOnePoint(x)) {
            System.out.println(name() + ":: Error performRemoveOneMove: " + x + "\n" + toString());
            System.exit(-1);
        }
        int idx = getIndex(x);
        copySolution();
        next[prev[idx]] = next[idx];
        prev[next[idx]] = prev[idx];
        next[idx] = prev[idx] = route[idx] = Constants.NULL_POINT;
        update(old_route[idx]);
        index[idx] = Constants.NULL_POINT;
    }

    public void performRemoveTwoPoints(Point x1, Point x2){
        // remove x from its current route
        if (!checkPerformRemoveTwoPoints(x1, x2)) {
            System.out.println(name() + ":: Error performRemoveTwoPoints: " + x1 + " " + x2 + "\n" + toString());
            System.exit(-1);
        }
        int idx1 = getIndex(x1);
        int idx2 = getIndex(x2);
        copySolution();
        next[prev[idx1]] = next[idx1];
        prev[next[idx1]] = prev[idx1];
        next[idx1] = prev[idx1] = route[idx1] = Constants.NULL_POINT;
        update(old_route[idx1]);
        index[idx1] = Constants.NULL_POINT;

        next[prev[idx2]] = next[idx2];
        prev[next[idx2]] = prev[idx2];
        next[idx2] = prev[idx2] = route[idx2] = Constants.NULL_POINT;
        update(old_route[idx2]);
        index[idx2] = Constants.NULL_POINT;
    }

    public boolean checkPerformAddRemovePoints(Point x, Point y, Point z){
        // x is not starting, or terminating points
        // z is not a terminating point
        int idx = getIndex(x);
        int idy = getIndex(y);
        int idz = getIndex(z);
        if (route[idx] == Constants.NULL_POINT || isStartingPoint(x) || isTerminatingPoint(x)) {
            return false;
        }
        if (route[idy] != Constants.NULL_POINT || route[idz] == Constants.NULL_POINT || isTerminatingPoint(z)) {
            return false;
        }
        return x != z;
    }

    public void performAddRemovePoints(Point x, Point y, Point z){
        //remove x from its current route
        // add y between z and next[z]
        //TODO by HoangNT
        if(!checkPerformAddRemovePoints(x, y, z)){
            System.out.println(name() + "::performAddRemovePoints(" + x + "," + y + "," + z + ") -> Error, ");
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        int idz = getIndex(z);
        performAddRemovePoints(idx, idy, idz);
    }

    private void performAddRemovePoints(int x, int y, int z){
        copySolution();
        if (prev[x] == z) {
            next[y] = next[x];
            prev[y] = prev[x];
            next[z] = y;
            prev[next[x]] = y;
            route[y] = route[x];
            update(route[z]);
        } else {
            next[prev[x]] = next[x];
            prev[next[x]] = prev[x];
            next[y] = next[z];
            prev[next[y]] = y;
            prev[y] = z;
            next[z] = y;
            route[y] = route[z];
            update(route[z]);
            if (route[x] != route[z]) {
                update(route[x]);
            }
        }
        index[x] = next[x] = prev[x] = route[x] = Constants.NULL_POINT;
    }

    public boolean checkPerformRemoveSequencePoints(Point x, Point y){
        int idx = getIndex(x);
        int idy = getIndex(y);
        if (index[idx] == Constants.NULL_POINT || index[idy] == Constants.NULL_POINT) {
            return false;
        }
        return isBefore(x,y);
    }

    public void performRemoveSequencePoints(Point x, Point y){
        // remove points from next[x] to prev[y]
        // set next[x] = y
        if(!checkPerformRemoveSequencePoints(x, y)){
            System.out.println(name() + "::performRemoveSequecePoints(" + x + "," + y + ") -> Error, " + x + " is not before " + y);
            System.exit(-1);
        }
        int idx = getIndex(x);
        int idy = getIndex(y);
        for(int v = next[idx]; v != idy; v = next[v]){
            index[v] = Constants.NULL_POINT;
        }
        copySolution();
        next[idx] = idy;
        prev[idy] = idx;
        update(route[idx]);
    }

    public boolean checkPerformKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        if (x.size() != y.size()) {
            return false;
        }
        //HashSet<Point> s = new HashSet<Point>(x);
        //if (x.size() != s.size()) {
        //return false;
        //}

        for (Point p : y) {
            if (p != CBLSVR.NULL_POINT && (route[getIndex(p)] == Constants.NULL_POINT || isTerminatingPoint(p))) {
                return false;
            }
        }
        HashSet<Point> set = new HashSet<Point>(y);
        for (Point p : x) {
            if ((!isClientPoint(p)) || set.contains(p)) {
                return false;
            }
        }
        for(int i = 0; i < x.size(); i++){
            Point px = x.get(i);
            Point py = y.get(i);
            int ix = getIndex(px);
            int iy = getIndex(py);
            if(ix == Constants.NULL_POINT && iy == Constants.NULL_POINT) return false;
            if(next(py) == px) return false;

            //if(route[ix] == Constants.NULL_POINT && route[iy] == Constants.NULL_POINT) return false;
        }
        return true;
    }

    public void performKPointsMove(ArrayList<Point> x, ArrayList<Point> y){
        // remove x[0...x.size()-1] from current routes
        // re-insert x[i] right-after y[i], forall i = 0,...,x.size()-1
        // application: Large Neighborhood Search
        // if y[i] = CBLSVR.NULL_POINT, then x[i] is removed from current routes
        // if y[i1] = y[i2] = ...= y[ik], then re-insert x[i1], x[i2], ..., x[ik] in that order right-after y[i1]
        if (!checkPerformKPointsMove(x, y)) {
            System.out.println(name() + "::performKPointsMove -> Error");
            System.exit(-1);
        }
        copySolution();
        HashSet<Integer> oldR = new HashSet<Integer>();
        for (int i = x.size() - 1; i >= 0; i--) {
            Point p = x.get(i);
            Point q = y.get(i);
            if (q != CBLSVR.NULL_POINT) {
                oldR.add(oldRoute(q));
                oldR.add(oldRoute(p));
                int idx = getIndex(p);
                int idy = getIndex(q);
                move(idx, idy);
            } else {
                oldR.add(oldRoute(p));
                int idx = getIndex(p);
                if (route[idx] != Constants.NULL_POINT) {
                    prev[next[idx]] = prev[idx];
                    next[prev[idx]] = next[idx];
                }
                index[idx] = next[idx] = prev[idx] = route[idx] = Constants.NULL_POINT;
            }
        }
        for (int r : oldR) {
            if (r != Constants.NULL_POINT) {
                update(r);
            }
        }
    }


    public ArrayList<Point> collectClientPointsOnRoutes(){
        ArrayList<Point> L = new ArrayList<Point>();
        for(Point p: clientPoints){
            if(contains(p))
                L.add(p);
        }
        return L;
    }

    public int getNbClientPointsOnRoutes(){
        int sz = 0;
        for(Point p: clientPoints){
            if(contains(p))
                sz++;
        }
        return sz;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        VRManager mgr = new VRManager();
        VarRoutesVR XR = new VarRoutesVR(mgr);
        Point s1 = new Point(1);
        Point t1 = new Point(2);
        Point s2 = new Point(3);
        Point t2 = new Point(4);

        ArrayList<Point> points = new ArrayList<Point>();
        XR.addRoute(s1, t1);
        XR.addRoute(s2, t2);
        for(int i = 5; i <= 12; i++){
            Point p = new Point(i);
            points.add(p);
            XR.addClientPoint(p);
        }
        mgr.close();
        Point p5 = points.get(0);
        Point p6 = points.get(1);
        Point p7 = points.get(2);
        Point p8 = points.get(3);
        Point p9 = points.get(4);
        Point p10 = points.get(5);
        Point p11 = points.get(6);
        Point p12 = points.get(7);

        System.out.println(XR.toString());
        mgr.performAddOnePoint(points.get(0), s1);
        mgr.performAddOnePoint(points.get(1), points.get(0));
        mgr.performAddOnePoint(points.get(2), points.get(1));
        mgr.performAddOnePoint(points.get(3), s2);
        mgr.performAddOnePoint(points.get(4), points.get(3));
        mgr.performAddOnePoint(points.get(5), points.get(4));
        mgr.performAddOnePoint(p11, p7);
        mgr.performAddOnePoint(p12, p10);

        System.out.println(XR.toString());

        mgr.performTwoOptMove5(p6, p9);
        System.out.println(XR.toString());
    }

}

class ConstraintSystemVR implements IConstraintVR {

    private ArrayList<IConstraintVR> _constraints;
    private int _violations;
    private VRManager _mgr;

    public ConstraintSystemVR(VRManager mgr){
        _constraints = new ArrayList<IConstraintVR>();
        this._mgr = mgr;
        mgr.postConstraintSystemVR(this);
    }
    public void post(IConstraintVR f){
        _constraints.add(f);
    }
    //@Override
    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return _mgr;
    }

    //@Override
    public int violations() {
        // TODO Auto-generated method stub
        return _violations;
    }

    //@Override
    public int evaluateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateOnePointMove(x, y);
        return eval;
    }

    //@Override
    public int evaluateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateTwoPointsMove(x, y);
        return eval;
    }

    //@Override
    public int evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateTwoOptMove1(x, y);
        return eval;
    }

    //@Override
    public int evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateTwoOptMove2(x, y);
        return eval;
    }

    //@Override
    public int evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateTwoOptMove3(x, y);
        return eval;
    }

    //@Override
    public int evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateTwoOptMove4(x, y);
        return eval;

    }

    //@Override
    public int evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateTwoOptMove5(x, y);
        return eval;
    }

    //@Override
    public int evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateTwoOptMove6(x, y);
        return eval;
    }

    //@Override
    public int evaluateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateTwoOptMove7(x, y);
        return eval;
    }

    //@Override
    public int evaluateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) {
            eval += f.evaluateTwoOptMove8(x, y);
        }
        return eval;
    }

    //@Override
    public int evaluateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateOrOptMove1(x1, x2, y);
        return eval;
    }

    //@Override
    public int evaluateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateOrOptMove1(x1, x2, y);
        return eval;
    }

    //@Override
    public int evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateThreeOptMove1(x,y,z);
        return eval;
    }

    //@Override
    public int evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateThreeOptMove2(x,y,z);
        return eval;
    }

    //@Override
    public int evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateThreeOptMove3(x,y,z);
        return eval;
    }

    //@Override
    public int evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateThreeOptMove4(x,y,z);
        return eval;
    }

    //@Override
    public int evaluateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateThreeOptMove5(x,y,z);
        return eval;
    }

    //@Override
    public int evaluateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateThreeOptMove6(x,y,z);
        return eval;
    }

    //@Override
    public int evaluateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateThreeOptMove7(x,y,z);
        return eval;
    }

    //@Override
    public int evaluateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateThreeOptMove8(x,y,z);
        return eval;
    }

    //@Override
    public int evaluateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateCrossExchangeMove(x1,y1,x2,y2);
        return eval;
    }

    //@Override
    public void initPropagation() {
        // TODO Auto-generated method stub
        _violations = 0;
        for(IConstraintVR f : _constraints) _violations += f.violations();
        //System.out.println(name() + "::initPropagation, violations = " + _violations);
    }

    //@Override
    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public String name(){
        return "ConstraintSystemVR";
    }

    //@Override
    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }
    //@Override
    public void propagateThreePointsMove(Point x1, Point x2, Point x3, Point y1, Point y2,
                                         Point y3) {
        // TODO Auto-generated method stub
        initPropagation();
    }
    //@Override
    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4, Point y1,
                                        Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        initPropagation();
    }
    //@Override
    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        initPropagation();
    }
    //@Override
    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        initPropagation();
    }
    //@Override
    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        initPropagation();
    }

    //@Override
    public int evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateTwoPointsMove(x1, x2, y1, y2);
        return eval;
    }
    //@Override
    public int evaluateThreePointsMove(Point x1, Point x2, Point x3, Point y1, Point y2,
                                       Point y3) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateThreePointsMove(x1, x2, x3, y1, y2, y3);
        return eval;
    }
    //@Override
    public int evaluateFourPointsMove(Point x1, Point x2, Point x3, Point x4, Point y1,
                                      Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4);
        return eval;
    }
    //@Override
    public int evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateAddOnePoint(x, y);
        return eval;
    }
    //@Override
    public int evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateRemoveOnePoint(x);
        return eval;
    }

    //@Override
    public int evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateAddTwoPoints(x1, y1, x2, y2);
        return eval;
    }
    //@Override
    public int evaluateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) eval += f.evaluateRemoveTwoPoints(x1, x2);
        return eval;
    }

    //@Override
    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        initPropagation();
    }
    //@Override
    public int evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) {
            //System.out.println(f.name() + " " + f.evaluateAddRemovePoints(x, y, z));
            eval += f.evaluateAddRemovePoints(x, y, z);
        }
        return eval;
    }
    //@Override
    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        initPropagation();
    }
    //@Override
    public int evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        int eval = 0;
        for(IConstraintVR f : _constraints) {
            eval += f.evaluateKPointsMove(x, y);
        }
        return eval;
    }
    @Override
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        // TODO Auto-generated method stub

    }
}

interface IConstraintVR extends InvariantVR {
    /*
     * return the value of the function
     */
    public int violations();

    /*
     * query the evaluation of different moves
     */

    // move of type a [Groer et al., 2010]
    // move customer x to from route of x to route of y; insert x into the position between y and next[y]
    // x and y are not depot
    // remove (prev[x],x), (x, next[x]), (y,next[y])
    // insert (prev[x], next[x]), (y,x), (x, next[y])
    public int evaluateOnePointMove(Point x, Point y);

    // move of type b [Groer et al., 2010]
    // x and y are on the same route and are not the depot, y locates before x on the route
    // remove (prev[x],x) and (x,next[x]) and (prev[y], y) and (y, next[y])
    // insert (x,prev[y]) and (next[y],x) and (next[x],y) and (y, prev[x])
    public int evaluateTwoPointsMove(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not the depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,y) and (next[x],next[y])
    public int evaluateTwoOptMove1(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not the depots
    // remove (x,next[x]) and (y,next[y])
    // insert (y,x) and (next[x],next[y])
    public int evaluateTwoOptMove2(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not the depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,y) and (next[y],next[x])
    public int evaluateTwoOptMove3(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not the depots
    // remove (x,next[x]) and (y,next[y])
    // insert (y,x) and (next[y],next[x])
    public int evaluateTwoOptMove4(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not the depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,next[y]) and (y,next[x])
    public int evaluateTwoOptMove5(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not the depots
    // remove (x,next[x]) and (y,next[y])
    // insert (next[y],x) and (y,next[x])
    public int evaluateTwoOptMove6(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not the depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,next[y]) and (next[x],y)
    public int evaluateTwoOptMove7(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not the depots
    // remove (x,next[x]) and (y,next[y])
    // insert (next[y],x) and (next[x],y)
    public int evaluateTwoOptMove8(Point x, Point y);

    // move of type d [Groer et al., 2010]
    // move the sequence <x1,next[x1],..., prev[x2], x2> of length len to the route containing y
    // remove (prev[x1],x1) and (x2,next[x2]), and (y,next[y])
    // add (y, x1) and (x2, next[y]) and (prev[x1], next[x2])
    public int evaluateOrOptMove1(Point x1, Point x2, Point y);

    // move of type d [Groer et al., 2010]
    // move the sequence <x1,next[x1],..., prev[x2], x2> of length len to the route containing y
    // remove (prev[x1],x1) and (x2,next[x2]), and (y,next[y])
    // add (y, x2) and (x1, next[y]) and (prev[x1], next[x2])
    public int evaluateOrOptMove2(Point x1, Point x2, Point y);


    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,z) and (next[y], next[x]) and(y, next[z])
    public int evaluateThreeOptMove1(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (z,x) and (next[x], next[y]) and(next[z],y)
    public int evaluateThreeOptMove2(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,y) and (next[x], z) and(next[y], next[z])
    public int evaluateThreeOptMove3(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (y,x) and (z,next[x]) and(next[z], next[y])
    public int evaluateThreeOptMove4(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,next[y]) and (z,next[x]) and(y, next[z])
    public int evaluateThreeOptMove5(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (next[y],x) and (next[x],z) and(next[z],y)
    public int evaluateThreeOptMove6(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,next[y]) and (z,y) and(next[x], next[z])
    public int evaluateThreeOptMove7(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (next[y],x) and (y,z) and(next[z], next[x])
    public int evaluateThreeOptMove8(Point x, Point y, Point z);


    // move of type g [Groer et al., 2010]
    // x1 and y1 are on the same route, x1 is before y1
    // x2 and y2 are on the same route, x2 is before y2
    // remove (x1,next[x1]) and (y1, next[y1])
    // remove (x2, next[x2]) and (y2, next[y2])
    // insert (x1, next[x2]) and (y2, next[y1])
    // insert (x2, next[x1]) and (y1, next[y2])
    public int evaluateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2);
    /*
        public int evaluateTwoPointsDifferentRouteMove(int x1, int y1, int x2, int y2);

        public int evaluateTwoPointsExchangeMove(int x1, int y1, int x2, int y2, int z1, int t1, int z2, int t2);
    */
    // remove x1, x2 from their current routes
    // re-insert x1 between y1 and next[y1]
    // re-insert x2 between y2 and next[y2]
    public int evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2);

    // remove x1, x2, x3 from their current routes
    // re-insert x1 between y1 and next[y1]
    // re-insert x2 between y2 and next[y2]
    // re-insert x3 between y3 and next[y3]
    public int evaluateThreePointsMove (Point x1, Point x2, Point x3, Point y1, Point y2, Point y3);


    // remove x1, x2, x3, x4 from their current routes
    // re-insert x1 between y1 and next[y1]
    // re-insert x2 between y2 and next[y2]
    // re-insert x3 between y3 and next[y3]
    // re-insert x4 between y4 and next[y4]
    public int evaluateFourPointsMove(Point x1, Point x2, Point x3, Point x4, Point y1, Point y2, Point y3, Point y4);

    // remove x[0...x.size()-1] from current routes
    // re-insert x[i] right-after y[i], forall i = 0,...,x.size()-1
    // application: Large Neighborhood Search
    // if y[i] = CBLSVR.NULL_POINT, then x[i] is removed from current routes
    int evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y);

    // add the point x between y and next[y]
    int evaluateAddOnePoint(Point x, Point y);

    // remove the point x from its current route
    int evaluateRemoveOnePoint(Point x);

    // add the point x1 between y1 and next[y1]
    // add the point x2 between y2 and next[y2]
    // y1 and y2 are on the same route and index[y1] < index[y2]
    // if y1 == y2, the Point x2 is added right-after the Point x1.
    public int evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2);

    // remove two points x1 and x2 from its current route
    // x1 and x2 are on the same route and index[x1] < index[x2]
    public int evaluateRemoveTwoPoints(Point x1, Point x2);

    int evaluateAddRemovePoints(Point x, Point y, Point z);
}
interface IFunctionVR extends InvariantVR{

    /*
     * return the value of the function
     */
    double getValue();

    /*
     * query the evaluation of different moves
     */

    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    double evaluateTwoOptMoveOneRoute(Point x, Point y);


    // move of type a [Groer et al., 2010]
    // move customer x to from route of x to route of y; insert x into the position between y and next[y]
    // x and y are not depot
    // remove (prev[x],x), (x, next[x]), (y,next[y])
    // insert (prev[x], next[x]), (y,x), (x, next[y])
    double evaluateOnePointMove(Point x, Point y);

    // move of type b [Groer et al., 2010]
    // x and y are on the same route and are not the depot, y locates before x on the route
    // remove (prev[x],x) and (x,next[x]) and (prev[y], y) and (y, next[y])
    // insert (x,prev[y]) and (next[y],x) and (next[x],y) and (y, prev[x])
    double evaluateTwoPointsMove(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not the depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,y) and (next[x],next[y])
    double evaluateTwoOptMove1(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not the depots
    // remove (x,next[x]) and (y,next[y])
    // insert (y,x) and (next[x],next[y])
    double evaluateTwoOptMove2(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not the depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,y) and (next[y],next[x])
    double evaluateTwoOptMove3(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not the depots
    // remove (x,next[x]) and (y,next[y])
    // insert (y,x) and (next[y],next[x])
    double evaluateTwoOptMove4(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not the depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,next[y]) and (y,next[x])
    double evaluateTwoOptMove5(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not the depots
    // remove (x,next[x]) and (y,next[y])
    // insert (next[y],x) and (y,next[x])
    double evaluateTwoOptMove6(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not the depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,next[y]) and (next[x],y)
    double evaluateTwoOptMove7(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not the depots
    // remove (x,next[x]) and (y,next[y])
    // insert (next[y],x) and (next[x],y)
    double evaluateTwoOptMove8(Point x, Point y);

    // move of type d [Groer et al., 2010]
    // move the sequence <x1,next[x1],..., prev[x2], x2> of length len to the route containing y
    // remove (prev[x1],x1) and (x2,next[x2]), and (y,next[y])
    // add (y, x1) and (x2, next[y]) and (prev[x1], next[x2])
    double evaluateOrOptMove1(Point x1, Point x2, Point y);

    // move of type d [Groer et al., 2010]
    // move the sequence <x1,next[x1],..., prev[x2], x2> of length len to the route containing y
    // remove (prev[x1],x1) and (x2,next[x2]), and (y,next[y])
    // add (y, x2) and (x1, next[y]) and (prev[x1], next[x2])
    double evaluateOrOptMove2(Point x1, Point x2, Point y);


    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,z) and (next[y], next[x]) and(y, next[z])
    double evaluateThreeOptMove1(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (z,x) and (next[x], next[y]) and(next[z],y)
    double evaluateThreeOptMove2(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,y) and (next[x], z) and(next[y], next[z])
    double evaluateThreeOptMove3(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (y,x) and (z,next[x]) and(next[z], next[y])
    double evaluateThreeOptMove4(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,next[y]) and (z,next[x]) and(y, next[z])
    double evaluateThreeOptMove5(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (next[y],x) and (next[x],z) and(next[z],y)
    double evaluateThreeOptMove6(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,next[y]) and (z,y) and(next[x], next[z])
    double evaluateThreeOptMove7(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (next[y],x) and (y,z) and(next[z], next[x])
    double evaluateThreeOptMove8(Point x, Point y, Point z);


    // move of type g [Groer et al., 2010]
    // x1 and y1 are on the same route, x1 is before y1
    // x2 and y2 are on the same route, x2 is before y2
    // remove (x1,next[x1]) and (y1, next[y1])
    // remove (x2, next[x2]) and (y2, next[y2])
    // insert (x1, next[x2]) and (y2, next[y1])
    // insert (x2, next[x1]) and (y1, next[y2])
    double evaluateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2);
    /*
        double evaluateTwoPointsDifferentRouteMove(int x1, int y1, int x2, int y2);

        double evaluateTwoPointsExchangeMove(int x1, int y1, int x2, int y2, int z1, int t1, int z2, int t2);
    */
    // remove x1, x2 from their current routes
    // re-insert x1 between y1 and next[y1]
    // re-insert x2 between y2 and next[y2]
    double evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2);

    // remove x1, x2, x3 from their current routes
    // re-insert x1 between y1 and next[y1]
    // re-insert x2 between y2 and next[y2]
    // re-insert x3 between y3 and next[y3]
    double evaluateThreePointsMove (Point x1, Point x2, Point x3, Point y1, Point y2, Point y3);


    // remove x1, x2, x3, x4 from their current routes
    // re-insert x1 between y1 and next[y1]
    // re-insert x2 between y2 and next[y2]
    // re-insert x3 between y3 and next[y3]
    // re-insert x4 between y4 and next[y4]
    double evaluateFourPointsMove(Point x1, Point x2, Point x3, Point x4, Point y1, Point y2, Point y3, Point y4);

    // remove x[0...x.size()-1] from current routes
    // re-insert x[i] right-after y[i], forall i = 0,...,x.size()-1
    // application: Large Neighborhood Search
    // if y[i] = CBLSVR.NULL_POINT, then x[i] is removed from current routes
    double evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y);

    // add the point x between y and next[y]
    double evaluateAddOnePoint(Point x, Point y);

    // remove the point x from its current route
    double evaluateRemoveOnePoint(Point x);

    // add the point x1 between y1 and next[y1]
    // add the point x2 between y2 and next[y2]
    // y1 and y2 are on the same route and index[y1] < index[y2]
    // if y1 == y2, the Point x2 is added right-after the Point x1.
    double evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2);

    // remove two points x1 and x2 from its current route
    // x1 and x2 are on the same route and index[x1] < index[x2]
    double evaluateRemoveTwoPoints(Point x1, Point x2);

    double evaluateAddRemovePoints(Point x, Point y, Point z);

    /*
     * Perform moves and propagate impact
     */

    /*
     * this method is called when the manager is closed
     * implementing classes implement this method for initializing the data structure maintained
     */
    /*
	public void initPropagation();


    // move of type a [Groer et al., 2010]
    // move customer x to from route of x to route of y; insert x into the position between y and next[y]
    // x and y are not the depot
    void propagateOnePointMove(int x, int y);

    // move of type b [Groer et al., 2010]
    // x and y are on the same route and are not the depots, y locates before x on the route
    // remove (prev[x],x) and (x,next[x]) and (prev[y], y) and (y, next(y)
    // insert (x,prev[y]) and (next[y],x) and (next[x],y) and (y, prev[x])
    void propagateTwoPointsMove(int x, int y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,y) and (next[x],next(y))
    void propagateTwoOptMove1(int x, int y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (y,x) and (next[x],next(y))
    void propagateTwoOptMove2(int x, int y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,y) and (next[y],next(x))
    void propagateTwoOptMove3(int x, int y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (y,x) and (next[y],next(x))
    void propagateTwoOptMove4(int x, int y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,next[y]) and (y,next[x])
    void propagateTwoOptMove5(int x, int y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (next[y],x) and (y,next[x])
    void propagateTwoOptMove6(int x, int y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,next[y]) and (next[x],y)
    void propagateTwoOptMove7(int x, int y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (next[y],x) and (next[x],y)
    void propagateTwoOptMove8(int x, int y);

    // move of type d [Groer et al., 2010]
    // move the sequence <x1,next[x1],..., prev[x2], x2> of length len to the route containing y
    // remove (prev[x1],x1) and (x2,next[x2]), and (y,next[y])
    // add (y, x1) and (x2, next[y]) and (prev[x1], next[x2])
    void propagateOrOptMove1(int x1, int x2, int y);

    // move of type d [Groer et al., 2010]
    // move the sequence <x1,next[x1],..., prev[x2], x2> of length len to the route containing y
    // remove (prev[x1],x1) and (x2,next[x2]), and (y,next[y])
    // add (y, x2) and (x1, next[y]) and (prev[x1], next[x2])
    void propagateOrOptMove2(int x1, int x2, int y);


    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,z) and (next[y], next[x]) and(y, next[z])
    void propagateThreeOptMove1(int x, int y, int z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (z,x) and (next[x], next[y]) and(next[z],y)
    void propagateThreeOptMove2(int x, int y, int z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,y) and (next[x], z) and(next[y], next[z])
    void propagateThreeOptMove3(int x, int y, int z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (y,x) and (z,next[x]) and(next[z], next[y])
    void propagateThreeOptMove4(int x, int y, int z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,next[y]) and (z,next[x]) and(y, next[z])
    void propagateThreeOptMove5(int x, int y, int z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (next[y],x) and (next[x],z) and(next[z],y)
    void propagateThreeOptMove6(int x, int y, int z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,next[y]) and (z,y) and(next[x], next[z])
    void propagateThreeOptMove7(int x, int y, int z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (next[y],x) and (y,z) and(next[z], next[x])
    void propagateThreeOptMove8(int x, int y, int z);


    // move of type g [Groer et al., 2010]
    // x1 and y1 are on the same route, x1 is before y1
    // x2 and y2 are on the same route, x2 is before y2
    // remove (x1,next[x1]) and (y1, next[y1])
    // remove (x2, next[x2]) and (y2, next[y2])
    // insert (x1, next[x2]) and (y2, next[y1])
    // insert (x2, next[x1]) and (y1, next[y2])
    void propagateCrossExchangeMove(int x1, int y1, int x2, int y2);
	*/
}

class VRManager {

    private ArrayList<InvariantVR> invariants;
    private VarRoutesVR X;
    private ArrayList<ConstraintSystemVR> constraintSystem;

    public VRManager() {
        invariants = new ArrayList<InvariantVR>();
        X = null;
        constraintSystem = new ArrayList<ConstraintSystemVR>();
    }

    public void postConstraintSystemVR(ConstraintSystemVR S) {
        constraintSystem.add(S);
    }

    public void printInvariants() {
        for (InvariantVR I : invariants) {
            System.out.println(I.name());
        }
    }

    public VarRoutesVR getVarRoutesVR() {
        return X;
    }

    public void post(InvariantVR f) {
        // System.out.println("***** " + f.name());
        invariants.add(f);
    }

    public void post(VarRoutesVR XR) {
        if (X != null) {
            System.out
                    .println(name()
                            + "::post(VarRoutesVR X),  EXCEPTION, another VarRoutesVR is already posted");
            System.out.println(X.toString());
            exit(-1);
        }
        // System.out.println(name() + "::post(VarRoutesVR)");
        this.X = XR;
    }

    public void initPropagation() {
        for (InvariantVR f : invariants) {
            // System.out.println(f.name());
            f.initPropagation();
        }
    }

    public void close() {
        for (ConstraintSystemVR S : constraintSystem)
            invariants.add(S);

        // System.out.println(name() + "::close, invariants = ");
        // printInvariants();

        initPropagation();

    }
    public void performTwoOptMoveOneRoute(Point x, Point y){
        // x and y are in the same route, x is before y
        // remove (x,next[x]) and (y,next[y])
        // add (x,y) and (next[x],next[y]), reverse path from y to next[x]
        X.performTwoOptMoveOneRoute(x, y);
        for (InvariantVR f : invariants) {
            f.propagateTwoOptMoveOneRoute(x, y);
        }


    }

    public void performRemoveAllClientPoints() {
        for (int k = 1; k <= X.getNbRoutes(); k++) {
            Point p = X.next(X.startPoint(k));
            while (p != X.endPoint(k)) {
                performRemoveOnePoint(p);
                //System.out.println(name() + "::performRemoveOnePoint(" + p.ID
                //		+ " on route " + k + "), XR = " + X.toString());
                p = X.next(X.startPoint(k));
            }
        }
    }

    // move of type a [Groer et al., 2010]
    // move customer x to from route of x to route of y; insert x into the
    // position between y and next[y]
    // x and y are not the depot
    public void performOnePointMove(Point x, Point y) {
        X.performOnePointMove(x, y);
        for (InvariantVR f : invariants) {
            f.propagateOnePointMove(x, y);
        }
    }

    // move of type b [Groer et al., 2010]
    // x and y are on the same route and are not the depots, y locates before x
    // on the route
    // remove (prev[x],x) and (x,next[x]) and (prev[y], y) and (y, next(y)
    // insert (x,prev[y]) and (next[y],x) and (next[x],y) and (y, prev[x])
    public void performTwoPointsMove(Point x, Point y) {
        X.performTwoPointsMove(x, y);
        Iterator<InvariantVR> it = invariants.iterator();
        for (InvariantVR f : invariants) {
            f.propagateTwoPointsMove(x, y);
        }
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,y) and (next[x],next(y))
    public void performTwoOptMove1(Point x, Point y) {
        X.performTwoOptMove1(x, y);
        for (InvariantVR f : invariants) {
            f.propagateTwoOptMove1(x, y);
        }
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (y,x) and (next[x],next(y))
    public void performTwoOptMove2(Point x, Point y) {
        X.performTwoOptMove2(x, y);
        for (InvariantVR f : invariants) {
            f.propagateTwoOptMove2(x, y);
        }
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,y) and (next[y],next(x))
    public void performTwoOptMove3(Point x, Point y) {
        X.performTwoOptMove3(x, y);
        for (InvariantVR f : invariants) {
            f.propagateTwoOptMove3(x, y);
        }
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (y,x) and (next[y],next(x))
    public void performTwoOptMove4(Point x, Point y) {
        X.performTwoOptMove4(x, y);
        for (InvariantVR f : invariants) {
            f.propagateTwoOptMove4(x, y);
        }
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,next[y]) and (y,next[x])
    public void performTwoOptMove5(Point x, Point y) {
        X.performTwoOptMove5(x, y);
        for (InvariantVR f : invariants) {
            f.propagateTwoOptMove5(x, y);
        }
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (next[y],x) and (y,next[x])
    public void performTwoOptMove6(Point x, Point y) {
        X.performTwoOptMove6(x, y);
        for (InvariantVR f : invariants) {
            f.propagateTwoOptMove6(x, y);
        }
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,next[y]) and (next[x],y)
    public void performTwoOptMove7(Point x, Point y) {
        X.performTwoOptMove7(x, y);
        for (InvariantVR f : invariants) {
            f.propagateTwoOptMove7(x, y);
        }
    }

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (next[y],x) and (next[x],y)
    public void performTwoOptMove8(Point x, Point y) {
        X.performTwoOptMove8(x, y);
        for (InvariantVR f : invariants) {
            f.propagateTwoOptMove8(x, y);
        }
    }

    // move of type d [Groer et al., 2010]
    // move the sequence <x1,next[x1],..., prev[x2], x2> of length len to the
    // route containing y
    // remove (prev[x1],x1) and (x2,next[x2]), and (y,next[y])
    // add (y, x1) and (x2, next[y]) and (prev[x1], next[x2])
    public void performOrOptMove1(Point x1, Point x2, Point y) {
        X.performOrOptMove1(x1, x2, y);
        for (InvariantVR f : invariants) {
            f.propagateOrOptMove1(x1, x2, y);
        }
    }

    // move of type d [Groer et al., 2010]
    // move the sequence <x1,next[x1],..., prev[x2], x2> of length len to the
    // route containing y
    // remove (prev[x1],x1) and (x2,next[x2]), and (y,next[y])
    // add (y, x2) and (x1, next[y]) and (prev[x1], next[x2])
    public void performOrOptMove2(Point x1, Point x2, Point y) {
        X.performOrOptMove2(x1, x2, y);
        for (InvariantVR f : invariants) {
            f.propagateOrOptMove2(x1, x2, y);
        }
    }

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before
    // z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,z) and (next[y], next[x]) and(y, next[z])
    public void performThreeOptMove1(Point x, Point y, Point z) {
        X.performThreeOptMove1(x, y, z);
        for (InvariantVR f : invariants) {
            f.propagateThreeOptMove1(x, y, z);
        }
    }

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before
    // z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (z,x) and (next[x], next[y]) and(next[z],y)
    public void performThreeOptMove2(Point x, Point y, Point z) {
        X.performThreeOptMove2(x, y, z);
        for (InvariantVR f : invariants) {
            f.propagateThreeOptMove2(x, y, z);
        }
    }

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before
    // z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,y) and (next[x], z) and(next[y], next[z])
    public void performThreeOptMove3(Point x, Point y, Point z) {
        X.performThreeOptMove3(x, y, z);
        for (InvariantVR f : invariants) {
            f.propagateThreeOptMove3(x, y, z);
        }
    }

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before
    // z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (y,x) and (z,next[x]) and(next[z], next[y])
    public void performThreeOptMove4(Point x, Point y, Point z) {
        X.performThreeOptMove4(x, y, z);
        for (InvariantVR f : invariants) {
            f.propagateThreeOptMove4(x, y, z);
        }
    }

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before
    // z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,next[y]) and (z,next[x]) and(y, next[z])
    public void performThreeOptMove5(Point x, Point y, Point z) {
        X.performThreeOptMove5(x, y, z);
        for (InvariantVR f : invariants) {
            f.propagateThreeOptMove5(x, y, z);
        }
    }

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before
    // z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (next[y],x) and (next[x],z) and(next[z],y)
    public void performThreeOptMove6(Point x, Point y, Point z) {
        X.performThreeOptMove6(x, y, z);
        for (InvariantVR f : invariants) {
            f.propagateThreeOptMove6(x, y, z);
        }
    }

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before
    // z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,next[y]) and (z,y) and(next[x], next[z])
    public void performThreeOptMove7(Point x, Point y, Point z) {
        X.performThreeOptMove7(x, y, z);
        for (InvariantVR f : invariants) {
            f.propagateThreeOptMove7(x, y, z);
        }
    }

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before
    // z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (next[y],x) and (y,z) and(next[z], next[x])
    public void performThreeOptMove8(Point x, Point y, Point z) {
        X.performThreeOptMove8(x, y, z);
        for (InvariantVR f : invariants) {
            f.propagateThreeOptMove8(x, y, z);
        }
    }

    // move of type g [Groer et al., 2010]
    // x1 and y1 are on the same route, x1 is before y1
    // x2 and y2 are on the same route, x2 is before y2
    // remove (x1,next[x1]) and (y1, next[y1])
    // remove (x2, next[x2]) and (y2, next[y2])
    // insert (x1, next[x2]) and (y2, next[y1])
    // insert (x2, next[x1]) and (y1, next[y2])
    public void performCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        X.performCrossExchangeMove(x1, y1, x2, y2);
        for (InvariantVR f : invariants) {
            f.propagateCrossExchangeMove(x1, y1, x2, y2);
        }
    }

    public void performTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        X.performTwoPointsMove(x1, x2, y1, y2);
        ;
        for (InvariantVR f : invariants) {
            f.propagateTwoPointsMove(x1, x2, y1, y2);
            ;
        }
    }

    public void performThreePointsMove(Point x1, Point x2, Point x3, Point y1,
                                       Point y2, Point y3) {
        X.performThreePointsMove(x1, x2, x3, y1, y2, y3);
        ;
        for (InvariantVR f : invariants) {
            f.propagateThreePointsMove(x1, x2, x3, y1, y2, y3);
        }
    }

    public void performFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                      Point y1, Point y2, Point y3, Point y4) {
        X.performFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4);
        for (InvariantVR f : invariants) {
            f.propagateFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4);
        }
    }

    public void performAddOnePoint(Point x, Point y) {
        X.performAddOnePoint(x, y);
        for (InvariantVR f : invariants) {
            f.propagateAddOnePoint(x, y);
        }
    }

    public void performRemoveOnePoint(Point x) {
        X.performRemoveOnePoint(x);
        for (InvariantVR f : invariants) {
            f.propagateRemoveOnePoint(x);
        }
    }

    public void performAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        X.performAddTwoPoints(x1, y1, x2, y2);
        for (InvariantVR f : invariants) {
            f.propagateAddTwoPoints(x1, y1, x2, y2);
        }
    }

    public void performRemoveTwoPoints(Point x1, Point x2) {
        X.performRemoveTwoPoints(x1, x2);
        for (InvariantVR f : invariants) {
            f.propagateRemoveTwoPoints(x1, x2);
        }
    }

    public void performAddRemovePoints(Point x, Point y, Point z) {
        X.performAddRemovePoints(x, y, z);
        for (InvariantVR f : invariants) {
            f.propagateAddRemovePoints(x, y, z);
        }
    }

    public void performKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        X.performKPointsMove(x, y);
        for (InvariantVR f : invariants) {
            f.propagateKPointsMove(x, y);
        }
    }

    public String name() {
        return "VRManager";
    }

    public void exit(int code) {
        System.out.println(name() + "::exit(" + code + ")");
        System.exit(code);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}

class Point {
    public int ID;
    double x, y;
    String locationCode;
    //ArrayList<Integer> bucketIDs;
    public Point(int ID, double x, double y){
        this.ID = ID;
        this.x = x; this.y = y;
        //this.bucketIDs = new ArrayList<Integer>();
    }
    public Point(){
        this.ID = 0;this.x = 0;this.y = 0;
    }
    public Point(int ID){
        this.ID = ID; this.x = 0; this.y = 0;
    }

    public Point(int ID, String locationCode){
        this.ID = ID;
        this.locationCode = locationCode;
        this.x = 0;
        this.y = 0;
    }

    public String getLocationCode() {
        return locationCode;
    }
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }
    public void setID(int iD) {
        ID = iD;
    }

    public int getID() {
        return ID;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

   public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    double degrees(Point p) {
        double X = p.x - x;
        double Y = p.y - y;
        double d = Math.toDegrees(Math.atan2(Y, X));
        if (d < 0) d += 360;
        return d;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
        //this.bucketIDs = new ArrayList<Integer>();
    }

    public double distance(Point p) {
        return Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y));
    }
    public double mahattanDistance(Point p){
        Point p1 = new Point(x,p.y);
        return distance(p1) + p1.distance(p);
    }
    public Point clone(){
        return new Point(ID,x,y);
    }
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.00");
        return ID + " (" + df.format(x) + "," + df.format(y) + ")";
    }
    public static void main(String[] argn) {
        System.out.print(Math.toDegrees(Math.atan2(-0.5, 1)));
    }
}


interface InvariantVR {
    /*
     * return the VRPManager
     */
    public VRManager getVRManager();

    /*
     * Perform moves and propagate impact
     */

    /*
     * this method is called when the manager is closed implementing classes
     * implement this method for initializing the data structure maPointained
     */
    public void initPropagation();

    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    void propagateTwoOptMoveOneRoute(Point x, Point y);

    // move of type a [Groer et al., 2010]
    // move customer x to from route of x to route of y; insert x Pointo the
    // position between y and next[y]
    // x and y are not the depot
    void propagateOnePointMove(Point x, Point y);

    // move of type b [Groer et al., 2010]
    // x and y are on the same route and are not the depots, y locates before x
    // on the route
    // remove (prev[x],x) and (x,next[x]) and (prev[y], y) and (y, next(y)
    // insert (x,prev[y]) and (next[y],x) and (next[x],y) and (y, prev[x])
    void propagateTwoPointsMove(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,y) and (next[x],next(y))
    void propagateTwoOptMove1(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (y,x) and (next[x],next(y))
    void propagateTwoOptMove2(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,y) and (next[y],next(x))
    void propagateTwoOptMove3(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (y,x) and (next[y],next(x))
    void propagateTwoOptMove4(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,next[y]) and (y,next[x])
    void propagateTwoOptMove5(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (next[y],x) and (y,next[x])
    void propagateTwoOptMove6(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (x,next[y]) and (next[x],y)
    void propagateTwoOptMove7(Point x, Point y);

    // move of type c [Groer et al., 2010]
    // x and y are on different routes and are not depots
    // remove (x,next[x]) and (y,next[y])
    // insert (next[y],x) and (next[x],y)
    void propagateTwoOptMove8(Point x, Point y);

    // move of type d [Groer et al., 2010]
    // move the sequence <x1,next[x1],..., prev[x2], x2> of length len to the
    // route containing y
    // remove (prev[x1],x1) and (x2,next[x2]), and (y,next[y])
    // add (y, x1) and (x2, next[y]) and (prev[x1], next[x2])
    void propagateOrOptMove1(Point x1, Point x2, Point y);

    // move of type d [Groer et al., 2010]
    // move the sequence <x1,next[x1],..., prev[x2], x2> of length len to the
    // route containing y
    // remove (prev[x1],x1) and (x2,next[x2]), and (y,next[y])
    // add (y, x2) and (x1, next[y]) and (prev[x1], next[x2])
    void propagateOrOptMove2(Point x1, Point x2, Point y);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before
    // z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,z) and (next[y], next[x]) and(y, next[z])
    void propagateThreeOptMove1(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before
    // z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (z,x) and (next[x], next[y]) and(next[z],y)
    void propagateThreeOptMove2(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before
    // z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,y) and (next[x], z) and(next[y], next[z])
    void propagateThreeOptMove3(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before
    // z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (y,x) and (z,next[x]) and(next[z], next[y])
    void propagateThreeOptMove4(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before
    // z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,next[y]) and (z,next[x]) and(y, next[z])
    void propagateThreeOptMove5(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before
    // z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (next[y],x) and (next[x],z) and(next[z],y)
    void propagateThreeOptMove6(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before
    // z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (x,next[y]) and (z,y) and(next[x], next[z])
    void propagateThreeOptMove7(Point x, Point y, Point z);

    // move of type e [Groer et al., 2010]
    // x, y, z are on the same route in that order (x is before y, y is before
    // z)
    // remove (x, next[x]), (y, next[y]), and (z, next[z])
    // insert (next[y],x) and (y,z) and(next[z], next[x])
    void propagateThreeOptMove8(Point x, Point y, Point z);

    // move of type g [Groer et al., 2010]
    // x1 and y1 are on the same route, x1 is before y1
    // x2 and y2 are on the same route, x2 is before y2
    // remove (x1,next[x1]) and (y1, next[y1])
    // remove (x2, next[x2]) and (y2, next[y2])
    // insert (x1, next[x2]) and (y2, next[y1])
    // insert (x2, next[x1]) and (y1, next[y2])
    void propagateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2);

    /*
     * // new proposed moves // x1, y1 are on route k1, x1 is before y1 // x2,
     * y2 are on route k2 (k2 != k1), x2 is before y2 // remove x1, y1 from
     * route k1 // insert x1 between x2 and next[x2] // insert y1 between y2 and
     * next[y2]
     *
     * void propagateTwoPoPointsDifferentRouteMove(Point x1, Point y1, Point x2,
     * Point y2);
     *
     * // new proposed moves // x1, y1, z1, t1 are on route k1 // x2, y2, z2, t2
     * are on route k2 // k1 != k2 // x1, y1, x2, y2, z1, t1, z2, t2 are
     * alldifferent // remove x1, y1 from route k1 // remove x2, y2 from route
     * k2 // insert x1 between z2 and next[z2] // insert y1 between t2 and
     * next[t2] // insert x2 between z1 and next[z1] // insert y2 between t1 and
     * next[t1]
     *
     * void propagateTwoPoPointsExchangeMove(Point x1, Point y1, Point x2, Point
     * y2, Point z1, Point t1, Point z2, Point t2);
     */
    // remove x1, x2 from their current routes
    // re-insert x1 between y1 and next[y1]
    // re-insert x2 between y2 and next[y2]
    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2);

    // remove x1, x2, x3 from their current routes
    // re-insert x1 between y1 and next[y1]
    // re-insert x2 between y2 and next[y2]
    // re-insert x3 between y3 and next[y3]
    public void propagateThreePointsMove(Point x1, Point x2, Point x3,
                                         Point y1, Point y2, Point y3);

    // remove x1, x2, x3, x4 from their current routes
    // re-insert x1 between y1 and next[y1]
    // re-insert x2 between y2 and next[y2]
    // re-insert x3 between y3 and next[y3]
    // re-insert x4 between y4 and next[y4]
    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                        Point y1, Point y2, Point y3, Point y4);

    // remove x[0...x.size()-1] from current routes
    // re-insert x[i] right-after y[i], forall i = 0,...,x.size()-1
    // application: Large Neighborhood Search
    // if y[i] = CBLSVR.NULL_POINT, then x[i] is removed from current routes
    void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y);

    // add the Point x between y and next[y]
    public void propagateAddOnePoint(Point x, Point y);

    // remove the Point x from its current route
    public void propagateRemoveOnePoint(Point x);

    // add the Point x1 between y1 and next[y1]
    // add the Point x2 between y2 and next[y2]
    // y1 and y2 are on the same route and index[y1] < index[y2]
    // if y1 == y2, the Point x2 is added right-after the Point x1.
    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2);

    // remove two points x1 and x2 from its current route
    // x1 and x2 are on the same route and index[x1] < index[x2]
    public void propagateRemoveTwoPoints(Point x1, Point x2);

    public void propagateAddRemovePoints(Point x, Point y, Point z);



    public String name();
}
class LexMultiValues {
    private ArrayList<Double> values;
    public LexMultiValues(){
        values = new ArrayList<Double>();
    }
    public LexMultiValues(LexMultiValues V){
        values = new ArrayList<Double>();
        for(int i = 0; i < V.size(); i++)
            values.add(V.get(i));
    }
    public LexMultiValues(ArrayList<Double> values){
        this.values = values;
    }
    public LexMultiValues(double v){
        values = new ArrayList<Double>();
        values.add(v);
    }
    public LexMultiValues(double v1, double v2){
        values = new ArrayList<Double>();
        values.add(v1);
        values.add(v2);
    }
    public void fill(int sz, double v){
        values.clear();
        for(int i = 0; i < sz; i++)
            values.add(v);
    }
    public int size(){
        return values.size();
    }
    public void clear(){
        values.clear();
    }
    public void add(double v){
        values.add(v);
    }
    public double get(int i){
        return values.get(i);
    }
    public LexMultiValues plus(LexMultiValues mv){
        ArrayList<Double> A = new ArrayList<Double>();
        for(int i = 0; i < size(); i++)
            A.add(get(i) + mv.get(i));
        return new LexMultiValues(A);
    }
    public boolean lt(LexMultiValues V){
        for(int i = 0; i < values.size(); i++){
            double x = values.get(i);
            double y = V.get(i);
            if (!CBLSVR.equal(x, y)) {
                return x < y;
            }
        }
        return false;
    }
    public boolean lt(double v){
        for(int i = 0; i < values.size(); i++){
            double x = values.get(i);
            if (!CBLSVR.equal(x, v)) {
                return x < v;
            }
        }
        return false;
    }

    public boolean leq(LexMultiValues V){
        for(int i = 0; i < values.size(); i++){
            double x = values.get(i);
            double y = V.get(i);
            if (!CBLSVR.equal(x, y)) {
                return x < y;
            }
        }
        return true;
    }

    public boolean eq(LexMultiValues V){
        for(int i = 0; i < values.size(); i++){
            double x = values.get(i);
            double y = V.get(i);
            if (!CBLSVR.equal(x, y)) {
                return false;
            }
        }
        return true;
    }
    public void set(LexMultiValues v){
        values.clear();
        for(int i = 0; i < v.size(); i++){
            values.add(v.get(i));
        }
    }
    public String toString(){
        String s = "";
        for(int i = 0; i < values.size(); i++)
            s = s + values.get(i) + ", ";
        return s;
    }
}

class Constants {
    public static final int NULL_POINT = -1;
    public static final int MAX_INT = 2147483647;
}
class LexMultiFunctions {
    private ArrayList<IFunctionVR> functions;

    public LexMultiFunctions(){
        functions = new ArrayList<IFunctionVR>();
    }
    public void add(IFunctionVR f){
        functions.add(f);
    }
    public void add(IConstraintVR c){
        functions.add(new ConstraintViolationsVR(c));
    }
    public LexMultiValues evaluateTwoOptMoveOneRoute(Point x, Point y){
        LexMultiValues eval = new LexMultiValues();
        for(int i = 0; i < functions.size(); i++)
            eval.add(functions.get(i).evaluateTwoOptMoveOneRoute(x, y));
        return eval;
    }

    public LexMultiValues evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y){
        LexMultiValues eval = new LexMultiValues();
        for(int i = 0; i < functions.size(); i++)
            eval.add(functions.get(i).evaluateKPointsMove(x, y));
        return eval;
    }

    public LexMultiValues evaluateOnePointMove(Point x, Point y){
        LexMultiValues eval = new LexMultiValues();
        for(int i = 0; i < functions.size(); i++)
            eval.add(functions.get(i).evaluateOnePointMove(x, y));
        return eval;
    }

    public LexMultiValues evaluateTwoPointsMove(Point x, Point y){
        LexMultiValues eval = new LexMultiValues();
        for(int i = 0; i < functions.size(); i++)
            eval.add(functions.get(i).evaluateTwoPointsMove(x, y));
        return eval;
    }

    public LexMultiValues evaluateTwoOptMove1(Point x, Point y) {
        LexMultiValues eval = new LexMultiValues();
        for(IFunctionVR f : functions) {
            eval.add(f.evaluateTwoOptMove1(x, y));
        }
        return eval;
    }

    public LexMultiValues evaluateTwoOptMove2(Point x, Point y) {
        LexMultiValues eval = new LexMultiValues();
        for(IFunctionVR f : functions) {
            eval.add(f.evaluateTwoOptMove2(x, y));
        }
        return eval;
    }

    public LexMultiValues evaluateTwoOptMove3(Point x, Point y) {
        LexMultiValues eval = new LexMultiValues();
        for(IFunctionVR f : functions) {
            eval.add(f.evaluateTwoOptMove3(x, y));
        }
        return eval;
    }

    public LexMultiValues evaluateTwoOptMove4(Point x, Point y) {
        LexMultiValues eval = new LexMultiValues();
        for(IFunctionVR f : functions) {
            eval.add(f.evaluateTwoOptMove4(x, y));
        }
        return eval;
    }

    public LexMultiValues evaluateTwoOptMove5(Point x, Point y) {
        LexMultiValues eval = new LexMultiValues();
        for(IFunctionVR f : functions) {
            eval.add(f.evaluateTwoOptMove5(x, y));
        }
        return eval;
    }

    public LexMultiValues evaluateTwoOptMove6(Point x, Point y) {
        LexMultiValues eval = new LexMultiValues();
        for(IFunctionVR f : functions) {
            eval.add(f.evaluateTwoOptMove6(x, y));
        }
        return eval;
    }

    public LexMultiValues evaluateTwoOptMove7(Point x, Point y) {
        LexMultiValues eval = new LexMultiValues();
        for(IFunctionVR f : functions) {
            eval.add(f.evaluateTwoOptMove7(x, y));
        }
        return eval;
    }

    public LexMultiValues evaluateTwoOptMove8(Point x, Point y) {
        LexMultiValues eval = new LexMultiValues();
        for(IFunctionVR f : functions) {
            eval.add(f.evaluateTwoOptMove8(x, y));
        }
        return eval;
    }

    public LexMultiValues evaluateOrOptMove1(Point x1, Point x2, Point y) {
        LexMultiValues eval = new LexMultiValues();
        for(IFunctionVR f : functions) {
            eval.add(f.evaluateOrOptMove1(x1, x2, y));
        }
        return eval;
    }

    public LexMultiValues evaluateOrOptMove2(Point x1, Point x2, Point y) {
        LexMultiValues eval = new LexMultiValues();
        for(IFunctionVR f : functions) {
            eval.add(f.evaluateOrOptMove2(x1, x2, y));
        }
        return eval;
    }

    public LexMultiValues evaluateThreeOptMove1(Point x, Point y, Point z) {
        LexMultiValues eval = new LexMultiValues();
        for(IFunctionVR f : functions) {
            eval.add(f.evaluateThreeOptMove1(x, y, z));
        }
        return eval;
    }

    public LexMultiValues evaluateThreeOptMove2(Point x, Point y, Point z) {
        LexMultiValues eval = new LexMultiValues();
        for(IFunctionVR f : functions) {
            eval.add(f.evaluateThreeOptMove2(x, y, z));
        }
        return eval;
    }

    public LexMultiValues evaluateThreeOptMove3(Point x, Point y, Point z) {
        LexMultiValues eval = new LexMultiValues();
        for(IFunctionVR f : functions) {
            eval.add(f.evaluateThreeOptMove3(x, y, z));
        }
        return eval;
    }

    public LexMultiValues evaluateThreeOptMove4(Point x, Point y, Point z) {
        LexMultiValues eval = new LexMultiValues();
        for(IFunctionVR f : functions) {
            eval.add(f.evaluateThreeOptMove4(x, y, z));
        }
        return eval;
    }

    public LexMultiValues evaluateThreeOptMove5(Point x, Point y, Point z) {
        LexMultiValues eval = new LexMultiValues();
        for(IFunctionVR f : functions) {
            eval.add(f.evaluateThreeOptMove5(x, y, z));
        }
        return eval;
    }

    public LexMultiValues evaluateThreeOptMove6(Point x, Point y, Point z) {
        LexMultiValues eval = new LexMultiValues();
        for(IFunctionVR f : functions) {
            eval.add(f.evaluateThreeOptMove6(x, y, z));
        }
        return eval;
    }

    public LexMultiValues evaluateThreeOptMove7(Point x, Point y, Point z) {
        LexMultiValues eval = new LexMultiValues();
        for(IFunctionVR f : functions) {
            eval.add(f.evaluateThreeOptMove7(x, y, z));
        }
        return eval;
    }

    public LexMultiValues evaluateThreeOptMove8(Point x, Point y, Point z) {
        LexMultiValues eval = new LexMultiValues();
        for(IFunctionVR f : functions) {
            eval.add(f.evaluateThreeOptMove8(x, y, z));
        }
        return eval;
    }

    public LexMultiValues evaluateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2){
        LexMultiValues eval = new LexMultiValues();
        for(int i = 0; i < functions.size(); i++)
            eval.add(functions.get(i).evaluateCrossExchangeMove(x1, y1, x2, y2));
        return eval;
    }

    public LexMultiValues evaluateAddOnePoint(Point x, Point y) {
        LexMultiValues eval = new LexMultiValues();
        for(int i = 0; i < functions.size(); i++)
            eval.add(functions.get(i).evaluateAddOnePoint(x, y));
        return eval;
    }

    public LexMultiValues evaluateRemoveOnePoint(Point x) {
        LexMultiValues eval = new LexMultiValues();
        for(int i = 0; i < functions.size(); i++)
            eval.add(functions.get(i).evaluateRemoveOnePoint(x));
        return eval;
    }

    public LexMultiValues evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        LexMultiValues eval = new LexMultiValues();
        for(int i = 0; i < functions.size(); i++)
            eval.add(functions.get(i).evaluateAddTwoPoints(x1, y1, x2, y2));
        return eval;
    }

    public LexMultiValues evaluateRemoveTwoPoints(Point x1, Point x2) {
        LexMultiValues eval = new LexMultiValues();
        for(int i = 0; i < functions.size(); i++)
            eval.add(functions.get(i).evaluateRemoveTwoPoints(x1, x2));
        return eval;
    }

    public LexMultiValues evaluateAddRemovePoints(Point x, Point y, Point z) {
        LexMultiValues eval = new LexMultiValues();
        for(int i = 0; i < functions.size(); i++)
            eval.add(functions.get(i).evaluateAddRemovePoints(x, y, z));
        return eval;
    }

    public LexMultiValues getValues(){
        LexMultiValues V = new LexMultiValues();
        for(int i = 0; i < functions.size(); i++)
            V.add(functions.get(i).getValue());
        return V;
    }
    public int size(){
        return functions.size();
    }

    public static void main(String[] args){
        String s = "0123456";
        for(int i = 0; i < s.length(); i++){
            System.out.println(i + ":" + s.charAt(i));
        }
    }
}
class RouteIndex implements IFunctionVR {

    private Point v;
    private VarRoutesVR XR;
    private VRManager mgr;

    public RouteIndex(VarRoutesVR XR, Point v){
        // semantic: index of route containing point v
        this.XR = XR;
        this.v = v;
        post();
    }

    private void post() {
        mgr = XR.getVRManager();
        mgr.post(this);
    }


    public void initPropagation() {
        // TODO Auto-generated method stub

    }


    public void propagateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub

    }


    public void propagateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub

    }


    public void propagateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub

    }


    public void propagateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub

    }


    public void propagateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub

    }


    public void propagateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub

    }


    public void propagateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub

    }


    public void propagateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub

    }


    public void propagateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub

    }


    public void propagateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub

    }


    public void propagateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub

    }


    public void propagateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub

    }


    public void propagateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }


    public void propagateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }


    public void propagateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }


    public void propagateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }


    public void propagateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }


    public void propagateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }


    public void propagateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }


    public void propagateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }


    public void propagateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub

    }


    public void propagateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub

    }


    public void propagateThreePointsMove(Point x1, Point x2, Point x3, Point y1,
                                         Point y2, Point y3) {
        // TODO Auto-generated method stub

    }


    public void propagateFourPointsMove(Point x1, Point x2, Point x3, Point x4, Point y1,
                                        Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub

    }


    public void propagateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub

    }


    public void propagateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub

    }

    public void propagateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        System.out.println("RouteIndex::propagateAddTwoPoints HAS NOT BEEN IMPLEMENTED YET");
        System.exit(-1);
    }


    public void propagateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        System.out.println("RouteIndex::propagateRemoveTwoPoints HAS NOT BEEN IMPLEMENTED YET");
        System.exit(-1);
    }

    public String name() {
        // TODO Auto-generated method stub
        return "RouteIndex";
    }


    public VRManager getVRManager() {
        // TODO Auto-generated method stub
        return mgr;
    }


    public double getValue() {
        // TODO Auto-generated method stub
        return XR.route(v);
    }

    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    public double evaluateTwoOptMoveOneRoute(Point x, Point y) {
        System.out.println(name() + "::evaluateTwoOptMoveOneRoute NOT IMPEMENTED YET");
        System.exit(-1);
        return 0;
    }

    public double evaluateOnePointMove(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformOnePointMove(x, y)) {
            System.out.println(name() + ":: Error evaluateOnePointMove: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (x == v) {
            return XR.route(y) - XR.route(x);
        }
        return 0;
    }


    public double evaluateTwoPointsMove(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoPointsMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoPointsMove: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (x == v) {
            return XR.route(y) - XR.route(v);
        }
        if (y == v) {
            return XR.route(x) - XR.route(v);
        }
        return 0;
    }


    public double evaluateTwoOptMove1(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove1: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }

        if (XR.isBefore(x, v) && v != XR.getTerminatingPointOfRoute(XR.route(x))) {
            return XR.route(y) - XR.route(v);
        }
        if (XR.isBefore(v, XR.next(y)) && v != XR.getStartingPointOfRoute(XR.route(y))) {
            return XR.route(x) - XR.route(v);
        }
        return 0;
    }


    public double evaluateTwoOptMove2(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove2: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.isBefore(x, v) && v != XR.getTerminatingPointOfRoute(XR.route(x))) {
            return XR.route(y) - XR.route(v);
        }
        if (XR.isBefore(v, XR.next(y)) && v != XR.getStartingPointOfRoute(XR.route(y))) {
            return XR.route(x) - XR.route(v);
        }
        return 0;
    }


    public double evaluateTwoOptMove3(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove3: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.isBefore(x, v) && v != XR.getTerminatingPointOfRoute(XR.route(x))) {
            return XR.route(y) - XR.route(v);
        }
        if (XR.isBefore(v, XR.next(y)) && v != XR.getStartingPointOfRoute(XR.route(y))) {
            return XR.route(x) - XR.route(v);
        }
        return 0;
    }


    public double evaluateTwoOptMove4(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove4: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.isBefore(x, v) && v != XR.getTerminatingPointOfRoute(XR.route(x))) {
            return XR.route(y) - XR.route(v);
        }
        if (XR.isBefore(v, XR.next(y)) && v != XR.getStartingPointOfRoute(XR.route(y))) {
            return XR.route(x) - XR.route(v);
        }
        return 0;
    }


    public double evaluateTwoOptMove5(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove5: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.isBefore(x, v) && v != XR.getTerminatingPointOfRoute(XR.route(x))) {
            return XR.route(y) - XR.route(v);
        }
        if (XR.isBefore(y, v) && v != XR.getTerminatingPointOfRoute(XR.route(y))) {
            return XR.route(x) - XR.route(v);
        }
        return 0;
    }


    public double evaluateTwoOptMove6(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove6: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.isBefore(x, v) && v != XR.getTerminatingPointOfRoute(XR.route(x))) {
            return XR.route(y) - XR.route(v);
        }
        if (XR.isBefore(y, v) && v != XR.getTerminatingPointOfRoute(XR.route(y))) {
            return XR.route(x) - XR.route(v);
        }
        return 0;
    }


    public double evaluateTwoOptMove7(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove7: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.isBefore(x, v) && v != XR.getTerminatingPointOfRoute(XR.route(x))) {
            return XR.route(y) - XR.route(v);
        }
        if (XR.isBefore(y, v) && v != XR.getTerminatingPointOfRoute(XR.route(y))) {
            return XR.route(x) - XR.route(v);
        }
        return 0;
    }


    public double evaluateTwoOptMove8(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoOptMove(x, y)) {
            System.out.println(name() + ":: Error evaluateTwoOptMove8: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.isBefore(x, v) && v != XR.getTerminatingPointOfRoute(XR.route(x))) {
            return XR.route(y) - XR.route(v);
        }
        if (XR.isBefore(y, v) && v != XR.getTerminatingPointOfRoute(XR.route(y))) {
            return XR.route(x) - XR.route(v);
        }
        return 0;
    }


    public double evaluateOrOptMove1(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformOrOptMove(x1, x2, y)) {
            System.out.println(name() + ":: Error evaluateOrOptMove1: " + x1 + " " + x2 + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.route(x1) == XR.route(v) && XR.index(x1) <= XR.index(v) && XR.index(v) <= XR.index(x2)) {
            return XR.route(y) - XR.route(v);
        }
        return 0;
    }


    public double evaluateOrOptMove2(Point x1, Point x2, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformOrOptMove(x1, x2, y)) {
            System.out.println(name() + ":: Error evaluateOrOptMove2: " + x1 + " " + x2 + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.route(x1) == XR.route(v) && XR.index(x1) <= XR.index(v) && XR.index(v) <= XR.index(x2)) {
            return XR.route(y) - XR.route(v);
        }
        return 0;
    }


    public double evaluateThreeOptMove1(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return 0;
    }


    public double evaluateThreeOptMove2(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return 0;
    }


    public double evaluateThreeOptMove3(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return 0;
    }


    public double evaluateThreeOptMove4(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return 0;
    }


    public double evaluateThreeOptMove5(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return 0;
    }


    public double evaluateThreeOptMove6(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return 0;
    }


    public double evaluateThreeOptMove7(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return 0;
    }


    public double evaluateThreeOptMove8(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        return 0;
    }


    public double evaluateCrossExchangeMove(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformCrossExchangeMove(x1, y1, x2, y2)) {
            System.out.println(name() + ":: Error evaluateCrossExchangeMove: " + x1 + " " + y1 + " " + x2 + " " + y2  + "\n" + XR.toString());
            System.exit(-1);
        }
        if (XR.isBefore(x1, v) && XR.isBefore(v, XR.next(y1))) {
            return XR.route(x2) - XR.route(x1);
        }
        if (XR.isBefore(x2, v) && XR.isBefore(v, XR.next(y2))) {
            return XR.route(x1) - XR.route(x2);
        }
        return 0;
    }


    public double evaluateTwoPointsMove(Point x1, Point x2, Point y1, Point y2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformTwoPointsMove(x1, x2, y1, y2)) {
            System.out.println(name() + ":: Error evaluateTwoPointsMove: " + x1 + " " + y1 + " " + x2 + " " + y2  + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 2;
        Point[] x = {x1, x2};
        Point[] y = {y1, y2};
        for (int i = 0; i < n; i++) {
            if (v == x[i]) {
                return XR.route(y[i]) - XR.route(v);
            }
        }
        return 0;
    }


    public double evaluateThreePointsMove(Point x1, Point x2, Point x3, Point y1,
                                          Point y2, Point y3) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformThreePointsMove(x1, x2, x3, y1, y2, y3)) {
            System.out.println(name() + ":: Error evaluateThreePointsMove: " + x1 + " " + y1 + " " + x2 + " " + y2  + " " + x3 + " " + y3 + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 3;
        Point[] x = {x1, x2, x3};
        Point[] y = {y1, y2, y3};
        for (int i = 0; i < n; i++) {
            if (v == x[i]) {
                return XR.route(y[i]) - XR.route(v);
            }
        }
        return 0;
    }


    public double evaluateFourPointsMove(Point x1, Point x2, Point x3, Point x4,
                                         Point y1, Point y2, Point y3, Point y4) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformFourPointsMove(x1, x2, x3, x4, y1, y2, y3, y4)) {
            System.out.println(name() + ":: Error evaluateFourPointsMove: " + x1 + " " + y1 + " " + x2 + " " + y2  + " " + x3 + " " + y3 + " " + x4 + " " + y4 + "\n" + XR.toString());
            System.exit(-1);
        }
        int n = 4;
        Point[] x = {x1, x2, x3, x4};
        Point[] y = {y1, y2, y3, y4};
        for (int i = 0; i < n; i++) {
            if (v == x[i]) {
                return XR.route(y[i]) - XR.route(v);
            }
        }
        return 0;
    }


    public double evaluateAddOnePoint(Point x, Point y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformAddOnePoint(x, y)) {
            System.out.println(name() + ":: Error evaluateAddOnePoint: " + x + " " + y + "\n" + XR.toString());
            System.exit(-1);
        }
        if (x == v) {
            return XR.route(y) - XR.route(x);
        }
        return 0;
    }

    public double evaluateRemoveOnePoint(Point x) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformRemoveOnePoint(x)) {
            System.out.println(name() + ":: Error evaluateRemoveOnePoint: " + x + "\n" + XR.toString());
            System.exit(-1);
        }
        if (x == v) {
            return Constants.NULL_POINT - XR.route(x);
        }
        return 0;
    }

    // x is before y on the same route
    // remove (x, next[x]) and (y,next[y])
    // add (x,y) and (next[x],next[y])
    public void propagateTwoOptMoveOneRoute(Point x, Point y) {
        System.out.println(name() + "::propagateTwoOptMoveOneRoute NOT IMPLEMENTED YET");
        System.exit(-1);
    }

    public double evaluateAddTwoPoints(Point x1, Point y1, Point x2, Point y2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformAddTwoPoints(x1, y1, x2, y2)) {
            System.out.println(name() + ":: Error evaluateAddTwoPoints: " + x1 + " " + y1 + " " + x2 + " " + y2 + "\n" + XR.toString());
            System.exit(-1);
        }
        if (x1 == v) {
            return XR.route(y1) - XR.route(x1);
        }
        if (x2 == v) {
            return XR.route(y2) - XR.route(x2);
        }
        return 0;
    }

    public double evaluateRemoveTwoPoints(Point x1, Point x2) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformRemoveTwoPoints(x1, x2)) {
            System.out.println(name() + ":: Error evaluateRemoveTwoPoints: " + x1 + " " + x2 + "\n" + XR.toString());
            System.exit(-1);
        }
        if (x1 == v || x2 == v) {
            return Constants.NULL_POINT - XR.route(x1);
        }
        return 0;
    }

    public void propagateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub

    }


    public double evaluateAddRemovePoints(Point x, Point y, Point z) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformAddRemovePoints(x, y, z)) {
            System.out.println(name() + ":: Error evaluateAddRemovePoints: " + x + " " + y + " " + z + "\n" + XR.toString());
            System.exit(-1);
        }
        if (v == x) {
            return Constants.NULL_POINT - XR.route(x);
        }
        if (v == y) {
            return XR.route(z) - XR.route(y);
        }
        return 0;
    }


    public void propagateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub

    }


    public double evaluateKPointsMove(ArrayList<Point> x, ArrayList<Point> y) {
        // TODO Auto-generated method stub
        if (!XR.checkPerformKPointsMove(x, y)) {
            System.out.println(name() + ":: Error evaluateKPointsMove: \n" + XR.toString());
            System.exit(-1);
        }
        for (int i = 0; i < x.size(); i++) {
            Point p = x.get(i);
            Point q = y.get(i);
            if (p == v) {
                if (q != CBLSVR.NULL_POINT) {
                    return XR.route(q) - XR.route(p);
                } else {
                    return Constants.NULL_POINT - XR.route(p);
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = 60;
        int n = 50;
        int K = 5;
        Point[] p = new Point[N];
        SecureRandom rand = new SecureRandom();
        for (int i = 0; i < N; i++) {
            p[i] = new Point(i, rand.nextInt(50), rand.nextInt(50));
        }
        VRManager mgr = new VRManager();
        VarRoutesVR XR = new VarRoutesVR(mgr);
        for (int i = 0; i < n; i++) {
            XR.addClientPoint(p[i]);
        }
        for (int i = n; i < N - K; i++) {
            XR.addRoute(p[i], p[i + K]);
        }
        XR.initSequential();
        NodeWeightsManager nwm = new NodeWeightsManager(XR.getAllPoints());
        for (int i = 0; i < p.length; i++) {
            nwm.setWeight(p[i], rand.nextInt(50));
        }
        AccumulatedWeightNodesVR accWN = new AccumulatedWeightNodesVR(XR, nwm);
        IFunctionVR[] f = new IFunctionVR[N];
        for (int i = 0; i < f.length; i++) {
            f[i] = new RouteIndex(XR, p[i]);
        }

        mgr.close();
        mgr.performRemoveOnePoint(p[0]);

        int iter = 0;
        double[] oldV = new double[N];
        double[] newV = new double[N];
        double[] delta = new double[N];
        while (iter < 10000) {
            System.out.println(iter++ + "\n" + XR + "\n" + accWN);
            for (int i = 0; i < N; i++) {
                oldV[i] = f[i].getValue();
            }
//			int x1 = rand.nextInt(N);
//			int x2 = rand.nextInt(N);
//			int y1 = rand.nextInt(N);
//			int y2 = rand.nextInt(N);
//			int x3 = rand.nextInt(N);
//			int y3 = rand.nextInt(N);
//			int x4 = rand.nextInt(N);
//			int y4 = rand.nextInt(N);
//			while (!XR.checkPerformAddRemovePoints(p[x1], p[x2], p[x3])) {
//				x1 = rand.nextInt(N);
//				y1 = rand.nextInt(N);
//				x2 = rand.nextInt(N);
//				y2 = rand.nextInt(N);
//				x3 = rand.nextInt(N);
//				y3 = rand.nextInt(N);
//				x4 = rand.nextInt(N);
//				y4 = rand.nextInt(N);
//			}
//
//			System.out.println(x1 + " " + y1);
//			for (int i = 0; i < N; i++) {
//				delta[i] = f[i].evaluateAddRemovePoints(p[x1], p[x2], p[x3]);
//			}
//			mgr.performAddRemovePoints(p[x1], p[x2], p[x3]);
//			for (int i = 0; i < N; i++) {
//				newV[i] = f[i].getValue();
//			}
            ArrayList<Point> x = new ArrayList<Point>();
            ArrayList<Point> y = new ArrayList<Point>();
            int count = rand.nextInt(5) + 5;
            for (int i = 0; i < count; i++) {
                x.add(p[rand.nextInt(N)]);
                if (rand.nextInt(5) == 0) {
                    y.add(CBLSVR.NULL_POINT);
                } else {
                    y.add(p[rand.nextInt(N)]);
                }
            }
            while (!XR.checkPerformKPointsMove(x, y)) {
                x.clear();
                y.clear();
                count = rand.nextInt(5) + 5;
                for (int i = 0; i < count; i++) {
                    x.add(p[rand.nextInt(N)]);
                    if (rand.nextInt(5) == 0) {
                        y.add(CBLSVR.NULL_POINT);
                    } else {
                        y.add(p[rand.nextInt(N)]);
                    }
                }
            }
            System.out.println(count);
            for (int i = 0; i < count; i++) {
                System.out.println(x.get(i) + " " + y.get(i));
            }
            for (int i = 0; i < N; i++) {
                delta[i] = f[i].evaluateKPointsMove(x, y);
            }
            mgr.performKPointsMove(x, y);
            for (int i = 0; i < N; i++) {
                newV[i] = f[i].getValue();
            }
            System.out.println(XR + "\n" + accWN);
            for (int i = 0; i < N; i++) {
                if (Math.abs(oldV[i] + delta[i] - newV[i]) > 1e-6) {
                    System.out.println("WTFFFFFFFFFFFFFFFFFFF " + i + " "
                            + oldV[i] + " " + delta[i] + " " + newV[i]);
                    System.exit(-1);
                }
            }
        }
        System.out.println("Okkkkkkkkkkkkkk");
    }


}
interface INeighborhoodExplorer {
    public void exploreNeighborhood(Neighborhood N, LexMultiValues bestEval);
    public void performMove(IVRMove m);
    public String name();
}
interface IVRMove {
    public void move();
    public LexMultiValues evaluation();
    public INeighborhoodExplorer getNeighborhoodExplorer();
    public String name();
}
class Neighborhood {
    private VRManager mgr;
    private ArrayList<IVRMove> moves;
    private Random R;
    private LexMultiValues eval;
    public Neighborhood(VRManager mgr){
        this.mgr = mgr;
        moves = new ArrayList<IVRMove>();
        R = new Random();
    }
    public void add(IVRMove m){
        moves.add(m);
        if(eval == null) eval = m.evaluation();
        else if(m.evaluation().lt(eval)){
            eval = m.evaluation();
        }
    }
    public ArrayList<IVRMove> getMoves(){
        return moves;
    }
    public void clear(){
        moves.clear();
        eval = null;
    }
    public boolean hasImprovement(){
        if(eval == null) return false;
        return eval.lt(0);
    }
    public int size(){
        return moves.size();
    }
    public boolean hasMove(){
        return moves.size() > 0;
    }
    public IVRMove getAMove(){
        return moves.get(R.nextInt(moves.size()));
    }
}
interface ISearch {
    public LexMultiValues getIncumbentValue();
    public int getCurrentIteration();
    public ValueRoutesVR getIncumbent();
    public void search(int maxIter, int timeLimit);
}
class NeighbohoodExplorerManager {
    public ArrayList<INeighborhoodExplorer> neighborhoodExplorers;
    private HashMap<INeighborhoodExplorer, Integer> mNeighborhood2Index;
    private HashMap<INeighborhoodExplorer, Integer> lastIterationUsed;// lastIterationUsed.get(ne) is the last iteration that
    // neighborhoodExplorer ne has been used
    private HashMap<INeighborhoodExplorer, Boolean> active;// active[i] = true, INeighborhoodExplorer[i] is active
    //private ArrayList<INeighborhoodExplorer> selected;// selected[i] = J means that neighborhood J is selected at iteration i
    private Random R = new Random();

    public NeighbohoodExplorerManager(){
        neighborhoodExplorers = new ArrayList<INeighborhoodExplorer>();
        //selected = new ArrayList<INeighborhoodExplorer>();
        active = new HashMap<INeighborhoodExplorer, Boolean>();
        mNeighborhood2Index =new HashMap<INeighborhoodExplorer, Integer>();
        lastIterationUsed = new HashMap<INeighborhoodExplorer, Integer>();
        for(int i = 0; i < neighborhoodExplorers.size(); i++){
            mNeighborhood2Index.put(neighborhoodExplorers.get(i), i);
            lastIterationUsed.put(neighborhoodExplorers.get(i), 0);
        }
    }
    public NeighbohoodExplorerManager(ArrayList<INeighborhoodExplorer> neighborhoodExplorers){
        this.neighborhoodExplorers = neighborhoodExplorers;
        //selected = new ArrayList<INeighborhoodExplorer>();
        active = new HashMap<INeighborhoodExplorer, Boolean>();
        for(INeighborhoodExplorer NE: neighborhoodExplorers)
            active.put(NE, true);
        mNeighborhood2Index = new HashMap<INeighborhoodExplorer, Integer>();
        lastIterationUsed = new HashMap<INeighborhoodExplorer, Integer>();

        for(int i = 0; i < neighborhoodExplorers.size(); i++){
            mNeighborhood2Index.put(neighborhoodExplorers.get(i), i);
            lastIterationUsed.put(neighborhoodExplorers.get(i), 0);
        }


    }
    public void setNeighborhoodExplorers(ArrayList<INeighborhoodExplorer> neighborhoodExplorers){
        this.neighborhoodExplorers = neighborhoodExplorers;
        //selected = new ArrayList<INeighborhoodExplorer>();
        active = new HashMap<INeighborhoodExplorer, Boolean>();
        for(INeighborhoodExplorer NE: neighborhoodExplorers)
            active.put(NE, true);
        mNeighborhood2Index = new HashMap<INeighborhoodExplorer, Integer>();
        for(int i = 0; i < neighborhoodExplorers.size(); i++){
            mNeighborhood2Index.put(neighborhoodExplorers.get(i), i);
            lastIterationUsed.put(neighborhoodExplorers.get(i), 0);
        }
    }

    public void restart(int currentIteration){
        int actives = getNbActiveNeighborhoods();
        //System.out.println(name() + "::restart, #active neighborhoods = " + getNbActiveNeighborhoods());
        for(INeighborhoodExplorer ne: neighborhoodExplorers){
            enable(ne);
            lastIterationUsed.put(ne, currentIteration);
        }
        //selected.clear();
        //System.out.println(name() + "::restart, #active neighborhoods = " + getNbActiveNeighborhoods());
        //if(getNbActiveNeighborhoods() > actives) System.exit(-1);
    }

    public void perturb(){
        INeighborhoodExplorer[] a = new INeighborhoodExplorer[neighborhoodExplorers.size()];
        for(int i = 0;i < neighborhoodExplorers.size(); i++)
            a[i] = neighborhoodExplorers.get(i);
        for(int step = 0; step < a.length; step++){
            int i = R.nextInt(a.length);
            int j = R.nextInt(a.length);
            INeighborhoodExplorer tmp = a[i]; a[i] = a[j]; a[j] = tmp;
        }
        neighborhoodExplorers.clear();
        mNeighborhood2Index.clear();
        for(int i = 0; i < a.length; i++){
            neighborhoodExplorers.add(a[i]);
            mNeighborhood2Index.put(a[i], i);
        }

    }
    public void add(INeighborhoodExplorer ne){
        neighborhoodExplorers.add(ne);
        active.put(ne, true);

        mNeighborhood2Index.put(ne, neighborhoodExplorers.size()-1);
    }
    public void disable(INeighborhoodExplorer ne){
        active.put(ne, false);
    }
    public void enable(INeighborhoodExplorer ne){
        active.put(ne, true);
    }
    public int getNbActiveNeighborhoods(){
        int countActives = 0;
        for(INeighborhoodExplorer NI: neighborhoodExplorers)
            if(active.get(NI)){
                countActives++;
            }
        return countActives;
    }
    public void exploreNeighborhoodsFirstImprovement(Neighborhood N, LexMultiValues bestEval, int currentIteration){
        int countActives = getNbActiveNeighborhoods();


        for(INeighborhoodExplorer NI: neighborhoodExplorers)
            if(active.get(NI)){
                NI.exploreNeighborhood(N, bestEval);
                if(N.hasImprovement()){
                    //selected.add(NI);
                    break;
                }
            }
        System.out.println(name() + "::exploreNeighborhoodFirstImprovement, countActives = " + countActives + ", moves.sz = " + N.getMoves().size());
        for(IVRMove m: N.getMoves()){
            INeighborhoodExplorer ne = m.getNeighborhoodExplorer();
            lastIterationUsed.put(ne, currentIteration);
        }
    }
    public String name(){
        return "NeighborhoodExplorerManager";
    }
    public void adaptNeighborhoods(int len, int currentIteration){
        //int[] lastVisited = new int[neighborhoodExplorers.size()];
        String lastVisited = "";
        for(INeighborhoodExplorer ne: neighborhoodExplorers){
            int lastIter = lastIterationUsed.get(ne);
            //lastVisited[mNeighborhood2Index.get(ne)] = lastIter;
            lastVisited += lastIter + " ";
            if(lastIter + len < currentIteration){
                disable(ne);
            }
        }

        System.out.println(name() + "::adaptNeighborhoods, len = " + len + ", curentIter = " + currentIteration + ", actives = " +
                getNbActiveNeighborhoods() + ", lastVisited = " + lastVisited);

		/*
		System.out.println(name() + "::adaptNeighborhoods, selected.sz = " + selected.size() + ", len = " + len);
		if(selected.size() <= len) return;

		int[] count = new int[neighborhoodExplorers.size()];
		int sz = selected.size();
		Arrays.fill(count, 0);
		for(int i = sz-1; i >= sz - len; i--){
			INeighborhoodExplorer ne = selected.get(i);
			count[mNeighborhood2Index.get(ne)]++;
		}
		for(int i = 0; i < count.length; i++){
			if(count[i] == 0){
				disable(neighborhoodExplorers.get(i));
				System.out.println(name() + "::adaptNeighborhoods, disable " + neighborhoodExplorers.get(i).name());
			}
		}

		System.out.println(name() + "::adaptNeighborhoods, selected.sz = " + selected.size() + ", actives = " + getNbActiveNeighborhoods());
		*/
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub


    }

}

class GenericLocalSearch implements ISearch {

    protected VRManager mgr;
    protected VarRoutesVR XR;
    protected LexMultiValues bestValue;
    protected LexMultiValues knownOptimal = null;
    protected ValueRoutesVR bestSolution;
    protected int currentIter;
    protected LexMultiFunctions F;
    //protected ArrayList<INeighborhoodExplorer> neighborhoodExplorer;
    protected NeighbohoodExplorerManager NEM;
    protected int maxStable;
    protected int nic;
    //protected HashMap<INeighborhoodExplorer, Integer> mN2ID;
    protected double time_to_best;
    protected double time;
    protected double t0;
    protected double t;
    private Random R = new Random();

    // parameters
    public boolean noMoveBreak = false;
    public boolean verbose = true;
    public boolean pertubationNeighborhood = true;
    public boolean adaptNeighborhood = true;
    public int lenAdaptNeighborhood = 10;

    public GenericLocalSearch(VRManager mgr, LexMultiFunctions F, ArrayList<INeighborhoodExplorer> neighborhoodExplorer){
        this.mgr = mgr;
        this.XR = mgr.getVarRoutesVR();
        this.F = F;
        //this.neighborhoodExplorer = neighborhoodExplorer;
        NEM = new NeighbohoodExplorerManager(neighborhoodExplorer);
        this.maxStable = 100;

		/*
		mN2ID = new HashMap<INeighborhoodExplorer, Integer>();
		for(int i = 0; i < neighborhoodExplorer.size(); i++){
			INeighborhoodExplorer in = neighborhoodExplorer.get(i);
			mN2ID.put(in, i);
		}
		*/

    }
    public GenericLocalSearch(VRManager mgr){
        this.mgr = mgr;
        this.XR = mgr.getVarRoutesVR();
        this.maxStable = 100;
        NEM = new NeighbohoodExplorerManager();
    }
    public void setKnownOptimal(LexMultiValues o){
        this.knownOptimal = o;
    }

    public void perturbNeighborhoodExplorer(){
        NEM.perturb();
		/*
		INeighborhoodExplorer[] a = new INeighborhoodExplorer[neighborhoodExplorer.size()];
		for(int i = 0;i < neighborhoodExplorer.size(); i++)
			a[i] = neighborhoodExplorer.get(i);
		for(int step = 0; step < a.length; step++){
			int i = R.nextInt(a.length);
			int j = R.nextInt(a.length);
			INeighborhoodExplorer tmp = a[i]; a[i] = a[j]; a[j] = tmp;
		}
		neighborhoodExplorer.clear();
		mN2ID.clear();
		for(int i = 0; i < a.length; i++){
			neighborhoodExplorer.add(a[i]);
			mN2ID.put(a[i], i);
		}
		*/
    }
    public void setObjectiveFunction(LexMultiFunctions F){
        this.F = F;
    }
    public void setNeighborhoodExplorer(ArrayList<INeighborhoodExplorer> NE){
        NEM.setNeighborhoodExplorers(NE);
		/*
		this.neighborhoodExplorer = NE;

		mN2ID = new HashMap<INeighborhoodExplorer, Integer>();
		for(int i = 0; i < neighborhoodExplorer.size(); i++){
			INeighborhoodExplorer in = neighborhoodExplorer.get(i);
			mN2ID.put(in, i);
		}
		*/
    }
    public void updateBest() {
        bestValue.set(F.getValues());
        bestSolution.store();
        nic = 0;
    }

    public void setMaxStable(int maxStable){
        this.maxStable = maxStable;
    }
    public double getTimeToBest(){
        return time_to_best;
    }
    public void restart(int currentIter){
        if(verbose) System.out.println(name() + "::restart............");
        //XR.setRandom();
        //generateInitialSolution();
        perturb(XR.getNbClients());
        if(F.getValues().lt(bestValue)){
            updateBest();
        }
        nic = 0;
        NEM.restart(currentIter);
    }

    public void generateInitialSolution(){
        XR.setRandom();
    }

    public void processNeighbor(){
        if(F.getValues().lt(bestValue)){
            updateBest();
            time_to_best = System.currentTimeMillis() - t0;
            time_to_best = time_to_best * 0.001;

            if(knownOptimal != null){
                if(F.getValues().leq(knownOptimal)){
                    if(verbose) System.out.println(name() + "::search, step " + currentIter + ", time " + t + ", F = " + F.getValues().toString() +
                            ", best = " + bestValue.toString() + ", time_to_best = " + time_to_best +
                            ", REACH KNOWN OPTIMAL --> BREAK");
                    //break;
                }
            }
        }else{
            nic++;
            if(nic > maxStable){
                restart(currentIter);
            }
        }

    }
    public void endOfAnIteration(){
        // to be overridden in extended classes
    }
    public void search(int maxIter, int timeLimit){
        bestSolution = new ValueRoutesVR(XR);
        currentIter = 0;
        generateInitialSolution();
        if(verbose) System.out.println(name() + "::search, initial solution = " + XR.toString());
        nic = 0;
        Neighborhood N = new Neighborhood(mgr);
        bestValue = new LexMultiValues(F.getValues());
        updateBest();
        t0 = System.currentTimeMillis();
        if(verbose) System.out.println(name() + "::search, init bestValue = " + bestValue.toString());
        //System.exit(-1);
        if(verbose) System.out.println(XR.toString());
        while (currentIter < maxIter) {
            t = System.currentTimeMillis() - t0;
            t = t * 0.001;
            if (t  > timeLimit)
                break;
            N.clear();

            LexMultiValues bestEval = new LexMultiValues();
            //bestEval.fill(F.size(), CBLSVR.MAX_INT);
            bestEval.fill(F.size(), 0);

            if(pertubationNeighborhood) perturbNeighborhoodExplorer();

            NEM.exploreNeighborhoodsFirstImprovement(N, bestEval, currentIter);

            //System.out.println("adaptNeighborhood = " + adaptNeighborhood); System.exit(-1);
            if(adaptNeighborhood) NEM.adaptNeighborhoods(lenAdaptNeighborhood,currentIter);

            if (N.hasMove()) {
                IVRMove m = N.getAMove();
                m.move();

                if(verbose) System.out.println(name() + "::search, step " + currentIter + ", time " + t + ", F = " + F.getValues().toString() +
                        ", best = " + bestValue.toString() + ", time_to_best = " + time_to_best +
                        ", nic/maxStable = " + nic + "/" + maxStable);

                processNeighbor();

                if(knownOptimal != null){
                    if(F.getValues().leq(knownOptimal)){
                        if(verbose) System.out.println(name() + "::search, step " + currentIter + ", time " + t + ", F = " + F.getValues().toString() +
                                ", best = " + bestValue.toString() + ", time_to_best = " + time_to_best +
                                ", REACH KNOWN OPTIMAL --> BREAK");
                        break;
                    }
                }
				/*
				if(F.getValues().lt(bestValue)){
					updateBest();
					time_to_best = System.currentTimeMillis() - t0;
					time_to_best = time_to_best * 0.001;

					if(knownOptimal != null){
						if(F.getValues().leq(knownOptimal)){
							if(verbose) System.out.println(name() + "::search, step " + currentIter + ", time " + t + ", F = " + F.getValues().toString() +
									", best = " + bestValue.toString() + ", time_to_best = " + time_to_best +
									", REACH KNOWN OPTIMAL --> BREAK");
							break;
						}
					}
				}else{
					nic++;
					if(nic > maxStable){
						restart(currentIter);
					}
				}
				*/
            } else {
                if(verbose) System.out.println(name()
                        + "::search --> no move available, break");

                if(noMoveBreak) break;
                else restart(currentIter);
            }
            // System.out.println(obj.toString());

            endOfAnIteration();

            currentIter++;

        }

        XR.setValue(bestSolution);

        if(verbose) System.out.println("Best = " + F.getValues().toString());
        if(verbose) System.out.println("bestValues = " + bestValue.toString());

    }
    public void perturb(int nbSteps){
        for(int k = 1; k <= nbSteps; k++){
            ArrayList<Point> P = XR.collectClientPointsOnRoutes();
            if(P.size() >= 2){
                for(int i = 1; i <= 10; i++){
                    Point x = P.get(R.nextInt(P.size()));
                    Point y = P.get(R.nextInt(P.size()));

                    if(x != y && XR.checkPerformOnePointMove(x, y)){
                        mgr.performOnePointMove(x, y);
                        break;
                    }

                }
            }
        }
    }
    public void searchImprove(int maxIter, int timeLimit){
        bestSolution = new ValueRoutesVR(XR);
        currentIter = 0;
        //XR.setRandom();
        nic = 0;
        Neighborhood N = new Neighborhood(mgr);
        bestValue = new LexMultiValues(F.getValues());
        updateBest();
        double t0 = System.currentTimeMillis();
        System.out.println(name() + "::search, init bestValue = " + bestValue.toString());
        //System.exit(-1);
        System.out.println(XR.toString());
        while (currentIter < maxIter) {
            double t = System.currentTimeMillis() - t0;
            if (t  > timeLimit)
                break;
            N.clear();

            LexMultiValues bestEval = new LexMultiValues();
            bestEval.fill(F.size(), CBLSVR.MAX_INT);

            NEM.exploreNeighborhoodsFirstImprovement(N, bestEval,currentIter);
			/*
			for(INeighborhoodExplorer NI: neighborhoodExplorer){
				NI.exploreNeighborhood(N, bestEval);
			}
			*/

            if (N.hasMove()) {
                IVRMove m = N.getAMove();
                m.move();

                System.out.println(name() + "::search, step " + currentIter + ", F = " + F.getValues().toString() + ", best = " + bestValue.toString());
                if(F.getValues().lt(bestValue)){
                    updateBest();
                }else{
                    nic++;
                    if(nic > maxStable){
                        //restart();
                        nic = 0;
                        perturb(20);
                    }
                }
            } else {
                System.out.println(name()
                        + "::search --> no move available, break");
                break;
            }
            // System.out.println(obj.toString());

            currentIter++;

        }

        XR.setValue(bestSolution);

        System.out.println("Best = " + F.getValues().toString());
        System.out.println("bestValues = " + bestValue.toString());

    }

    public String name(){
        return "GenericLocalSearch";
    }

    public LexMultiValues getIncumbentValue() {
        // TODO Auto-generated method stubValueRoutesVR
        return bestValue;
    }

    public LexMultiFunctions getFunction(){
        return F;
    }
    public int getCurrentIteration() {
        // TODO Auto-generated method stub
        return currentIter;
    }


    public ValueRoutesVR getIncumbent() {
        // TODO Auto-generated method stub
        return bestSolution;
    }

}
class OnePointMove implements IVRMove {
    private VRManager mgr;
    private Point x;
    private Point y;
    private LexMultiValues eval;
    private INeighborhoodExplorer NE;
    public OnePointMove(VRManager mgr, LexMultiValues eval, Point x, Point y, INeighborhoodExplorer NE){
        this.mgr = mgr;
        this.eval = eval;
        this.x = x;
        this.y = y;
        this.NE = NE;
    }
    public OnePointMove(VRManager mgr, LexMultiValues eval, Point x, Point y){
        this.mgr = mgr;
        this.eval = eval;
        this.x = x;
        this.y = y;
        this.NE = null;
    }
    public String name(){
        return "OnePointMove";
    }

    public void move() {
        // TODO Auto-generated method stub
        System.out.println(name() + "::move(" + x + "," + y + ") " + eval);
        mgr.performOnePointMove(x, y);

        if(NE != null) NE.performMove(this);
    }


    public LexMultiValues evaluation() {
        // TODO Auto-generated method stub
        return eval;
    }


    public INeighborhoodExplorer getNeighborhoodExplorer(){
        return NE;
    }

    public Point getX(){
        return x;
    }
    public Point getY(){
        return y;
    }
}

class GreedyOnePointMoveExplorer implements INeighborhoodExplorer {
    private VRManager mgr;
    private VarRoutesVR XR;
    private ISearch search;
    private LexMultiFunctions F;
    private LexMultiValues bestValue;
    private boolean firstImprovement = true;
    public GreedyOnePointMoveExplorer(VarRoutesVR XR, LexMultiFunctions F) {
        this.XR = XR;
        this.F = F;
        this.mgr = XR.getVRManager();
    }
    public GreedyOnePointMoveExplorer(VarRoutesVR XR, LexMultiFunctions F, boolean firstImprovement) {
        this.XR = XR;
        this.F = F;
        this.mgr = XR.getVRManager();
        this.firstImprovement = firstImprovement;
    }

    public GreedyOnePointMoveExplorer(ISearch search, VRManager mgr, LexMultiFunctions F){
        this.search = search;
        this.mgr = mgr;
        this.XR = mgr.getVarRoutesVR();
        this.F = F;
        this.bestValue = search.getIncumbentValue();
    }

    public void exploreNeighborhood(Neighborhood N, LexMultiValues bestEval) {
        // TODO Auto-generated method stub

        if(firstImprovement && N.hasImprovement()){
            System.out.println(name() + "::exploreNeighborhood, has improvement --> RETURN");
            return;
        }

        for (Point x : XR.getClientPoints()) {
            for (Point y : XR.getAllPoints()) {
                //System.out.println(name() + "::exploreNeighborhood, consider (" + x.ID + "," + y.ID + " of route " + XR.route(y) + ", index " + XR.index(y) + ")");
                if (XR.checkPerformOnePointMove(x, y)) {
                    //System.out.println(name() + "::exploreNeighborhood, accept (" + x.ID + "," + y.ID + " of route " + XR.route(y) + ", index " + XR.index(y) + ")");
                    LexMultiValues eval = F.evaluateOnePointMove(x, y);
                    //System.out.println(name() + "::exploreNeighborhood, accept (" + x.ID + "," + y.ID + " of route " + XR.route(y) + ", index " + XR.index(y) + ") eval = " + eval.toString());
                    if(eval.lt(bestEval)){
                        N.clear();
                        N.add(new OnePointMove(mgr, eval, x, y, this));
                        bestEval.set(eval);
                    } else if (eval.eq(bestEval)) {
                        N.add(new OnePointMove(mgr, eval, x, y, this));
                    }
                    if(firstImprovement){
                        if(eval.lt(0)) return;
                    }
                }
            }
        }
        //System.out.println(name() + "::exploreNeighborhood finished");
    }
    public String name(){
        return "GreedyOnePointMoveExplorer";
    }
    public void performMove(IVRMove m){
        // DO NOTHING
    }
}

class DemoVRP {

    int K;// number of routes
    int N;// number of clients
    int capacity;
    int[] demand;
    int[] x;
    int[] y;// (x[i],y[i]) is coordinate of point i

    ArrayList<Point> start;
    ArrayList<Point> end;
    ArrayList<Point> clientPoints;
    ArrayList<Point> allPoints;
    ArcWeightsManager awm;// luu tru trong so tren canh noi giua cac point
    NodeWeightsManager nwm;// luu tru trong so tren cac point

    HashMap<Point, Integer> mapPoint2ID;


    // modelling
    VRManager mgr;
    VarRoutesVR XR;// bien loi giai (luu tap cac route)
    ConstraintSystemVR CS;
    LexMultiFunctions F;
    IFunctionVR obj;
    IFunctionVR[] d;// d[k] la demand cua route k
    IFunctionVR[] cost;// cost[k] la chieu dai cua route thu k

    public void readData(String fn){
        try{
            //Scanner in = new Scanner(new File(fn));
            Scanner in = new Scanner(System.in);

            N = in.nextInt();
            K = in.nextInt();
            capacity = in.nextInt();
            demand = new int[N+1];
            x = new int[N+1];
            y = new int[N+1];

            for(int i = 0; i <= N; i++){
                int id = in.nextInt();
                x[id] = in.nextInt();
                y[id] = in.nextInt();
                demand[id] = in.nextInt();
            }
            in.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public void mapping(){
        // map from raw data to objects
        start = new ArrayList<Point>();
        end = new ArrayList<Point>();
        clientPoints = new ArrayList<Point>();
        allPoints = new ArrayList<Point>();

        mapPoint2ID = new HashMap<Point, Integer>();
        // khoi tao cac diem bat dau va ket thuc cua cac xe (route)
        for(int k = 1; k <= K; k++){
            Point s = new Point(0);
            Point t = new Point(0);
            start.add(s);
            end.add(t);
            allPoints.add(s);
            allPoints.add(t);
            mapPoint2ID.put(s, 0);
            mapPoint2ID.put(t,0);
        }

        // khoi tao cac diem clients
        for(int i = 1; i <= N; i++){
            Point p = new Point(i);
            clientPoints.add(p);
            allPoints.add(p);
            mapPoint2ID.put(p, i);
        }


        // khoi tao object quan ly trong so
        awm = new ArcWeightsManager(allPoints);
        nwm = new NodeWeightsManager(allPoints);

        for(Point p: allPoints){
            for(Point q: allPoints){
                int ip = mapPoint2ID.get(p);
                int iq = mapPoint2ID.get(q);
                double w = Math.sqrt(Math.pow(x[ip]-x[iq],2) + Math.pow(y[ip]-y[iq],2));
                awm.setWeight(p,q, w);
            }
        }
        for(Point p: allPoints)
            nwm.setWeight(p, demand[mapPoint2ID.get(p)]);
    }

    public void stateModel(){
        mgr = new VRManager();
        XR = new VarRoutesVR(mgr);
        for(int i = 0; i < start.size(); i++){
            Point s = start.get(i);
            Point t = end.get(i);
            XR.addRoute(s, t);// them 1 route vao phuong an (s --> t)
        }
        for(Point p: clientPoints)
            XR.addClientPoint(p);// khai bao XR co the se di qua diem p

        // thiet lap rang buoc
        CS = new ConstraintSystemVR(mgr);
        AccumulatedWeightNodesVR accDemand = new AccumulatedWeightNodesVR(XR, nwm);
        AccumulatedWeightEdgesVR accW = new AccumulatedWeightEdgesVR(XR, awm);

        d = new IFunctionVR[K];// demand on routes
        for(int k = 1; k <= K; k++){
            Point tk = XR.endPoint(k);// diem cuoi cung cua route thu k
            d[k-1] = new AccumulatedNodeWeightsOnPathVR(accDemand, tk);
            //CS.post(new Leq(d[k-1],capacity));
        }

        cost = new IFunctionVR[K];
        for(int k =1; k <= K; k++){
            Point tk = XR.endPoint(k);
            cost[k-1] = new AccumulatedEdgeWeightsOnPathVR(accW, tk);
        }


        // demo routeIndex
        Point pickup = clientPoints.get(3);
        Point dropoff = clientPoints.get(4);
        IFunctionVR ip = new RouteIndex(XR, pickup);
        IFunctionVR id = new RouteIndex(XR,dropoff);
        //CS.post(new Eq(ip,id));




        obj = new TotalCostVR(XR, awm);// tong khoang cach di chuyen cua K xe (route)
        F = new LexMultiFunctions();
        //F.add(new ConstraintViolationsVR(CS));
        F.add(obj);
        mgr.close();
    }

    public void print(){
        for(int k = 1; k <= K; k++){
            Point s = XR.startPoint(k);
            System.out.print("Route[" + k + "] = ");
            for(Point p = s; p != XR.endPoint(k); p = XR.next(p)){
                System.out.print(p.ID + " -> ");
            }
            System.out.println(XR.endPoint(k).ID + " d[k] = " + d[k-1].getValue() +
                    ", cost[k] = " + cost[k-1].getValue());
        }
        System.out.println("length = " + obj.getValue());
    }

    public void init(){
        Point s = XR.startPoint(1);
        for(int i = 0; i < clientPoints.size(); i++){
            Point p = clientPoints.get(i);
            mgr.performAddOnePoint(p, s);
            s = p;
        }
    }
    public void step(){

        Point s = XR.startPoint(1);
        mgr.performAddOnePoint(clientPoints.get(2), s);
        mgr.performAddOnePoint(clientPoints.get(1), clientPoints.get(2));

        mgr.performAddOnePoint(clientPoints.get(0), XR.startPoint(2));
        mgr.performAddOnePoint(clientPoints.get(3), clientPoints.get(0));
        Point x = clientPoints.get(0);
        Point y = clientPoints.get(2);

        print();
        double eval = obj.evaluateOnePointMove(x, y);
        mgr.performOnePointMove(x, y);
        System.out.println("eval = " + eval + ", obj = " + obj.getValue());
        print();
    }

    public void search(){
        ArrayList<INeighborhoodExplorer> NE = new ArrayList<INeighborhoodExplorer>();
        NE.add(new GreedyOnePointMoveExplorer(XR, F));
        //NE.add(new GreedyTwoOptMoveOneRouteExplorer(XR, F)); not complete implementation of all functions (except TotalCostVR) for this operator (TwoOptMoveOneRoute)

        GenericLocalSearch se = new GenericLocalSearch(mgr);
        se.setNeighborhoodExplorer(NE);
        se.setObjectiveFunction(F);
        se.setMaxStable(50);

        se.search(10, 3);


    }

    public void run(){
        DemoVRP A = new DemoVRP();
        A.readData("cvrp.txt");
        A.mapping();
        A.stateModel();
        A.print();
        A.step();
        //A.print();
        A.search();
        //A.init();
        //System.out.println("-------------");
        A.print();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DemoVRP A = new DemoVRP();
        A.readData("cvrp.txt");
        A.mapping();
        A.stateModel();
        A.print();
        A.step();
        //A.print();
        A.search();
        //A.init();
        //System.out.println("-------------");
        A.print();
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("Main start...");
        DemoVRP A = new DemoVRP();
        A.run();
    }
}