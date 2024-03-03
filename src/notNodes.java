public class Nodes {



    int value1;

    int value2;

    int tempValue3;

    Nodes left;

    Nodes right;

    Nodes middle;

    Nodes middle1;

    Nodes middle2;

    Nodes root;


    Nodes child1;
    Nodes child2;

    Nodes child3;

    Nodes tempChild4;

    Nodes parent;

    Nodes twoNode;

    Nodes threeNode;
    public Nodes(int value1, Nodes child1, Nodes child2){
        this.value1 = value1;
        this.child1 = child1;
        this.child2 = child2;

        child3 = null;
        value2 = 0;

        tempChild4 = null;
        tempValue3 = 0;

    }



    boolean isTwoNode(Nodes node){
        if(value2 == 0 && child3 == null){
            return true;
        } else {
            return false;
        }
    }

    boolean isThreeNode(Nodes node){
        if(value2 != 0 && child3 != null && !isFourNode(node)){
            return true;
        } else {
            return false;
        }
    }

    boolean isFourNode(Nodes node){
        if(tempValue3 !=0 && tempChild4 != null){
            return true;
        } else{
            return false;
        }
    }



    protected boolean malFormed() {
        if (value1 == 0) {
            return true;
        } else {
            if (value2 == 0) {
                //two node
                if (child1 == null && child2 == null && child3 == null) {
                    //leaf node
                    return false;
                } else if (child1 != null && child2 != null & child3 == null) {
                    //interrior node
                    return false;
                } else {
                    return true;
                }

            } else {
                //three node
                if (child1 == null && child2 == null && child3 == null) {
                    //leaf node
                    return false;
                } else if (child1 != null && child2 != null & child3 != null) {
                    //interrior node
                    return false;
                } else {
                    return true;
                }
            }


        }
    }

    //add malinformed to check 4 nodes


    /**
     * has 3 values associated
     */
    protected class innerReturnClass{
        public int value;
        public Nodes left;
        public Nodes right;
    }


    /**
     *calls when it is not the root
     * @return 3 diff values (left, right, & value associated)
     * @throws Exception
     */
    protected innerReturnClass turn4NodeInto2TwoNodes() throws Exception {
        if(value1 == 0 || value2 == 0 || tempValue3 == 0 || malFormed()){
            //throw exception
            throw new Exception();
        }

        Nodes subGraphLeft = new Nodes(value1, child1, child2);
        Nodes subGraphRight = new Nodes(tempValue3, child3, tempChild4);

        innerReturnClass rtn = new innerReturnClass();
        rtn.value = value2;
        rtn.left = subGraphLeft;
        rtn.right = subGraphRight;
        return rtn;
    }



    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }


    public Nodes getChild1() {
        return child1;
    }

    public void setChild1(Nodes child1) {
        this.child1 = child1;
    }

    public Nodes getChild2() {
        return child2;
    }

    public void setChild2(Nodes child2) {
        this.child2 = child2;
    }

    public Nodes getChild3() {
        return child3;
    }

    public void setChild3(Nodes child3) {
        this.child3 = child3;
    }

    public Nodes getTwoNode() {
        return twoNode;
    }

    public void setTwoNode(Nodes twoNode) {
        this.twoNode = twoNode;
    }

    public Nodes getThreeNode() {
        return threeNode;
    }

    public void setThreeNode(Nodes threeNode) {
        this.threeNode = threeNode;
    }
}
