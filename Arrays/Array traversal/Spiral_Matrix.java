class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix.length == 0 && matrix[0].length == 0){
            return result;
        }

        int rl = 0;
        int ru = matrix.length - 1;
        int cl = 0;
        int cu = matrix[0].length - 1;

        while(rl <= ru && cl <= cu){
            for(int i = cl; i <= cu; i++){
                result.add(matrix[rl][i]);
            }
            rl++;

            for(int i = rl; i<= ru; i++){
                result.add(matrix[i][cu]);
            }
            cu--;

            if(rl > ru || cl > cu){
                break;
            }

            for(int i = cu; i >= cl; i--){
                result.add(matrix[ru][i]);
            }
            ru--;

            for(int i = ru;i >= rl; i--){
                result.add(matrix[i][cl]);
            }
            cl++;
        }
        return result;
    }
}