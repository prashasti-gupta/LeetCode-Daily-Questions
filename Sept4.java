class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } }; // four directions
        int x = 0, y = 0; // starting with{0,0}
        int dir = 0; // start with north
        int maxDistance = 0;

        Set<String> obstacle = new HashSet<>();
        for (int[] obs : obstacles) {
            obstacle.add(obs[0] + "," + obs[1]);
        }
        for (int command : commands) {
            if (command == -1) {
                dir = (dir + 1) % 4;
            } else if (command == -2) {
                dir = (dir + 3) % 4;
            } else {
                for (int i = 0; i < command; i++) {
                    int xCoordinate = x + directions[dir][0];
                    int yCoordinate = y + directions[dir][1];

                    if (!obstacle.contains(xCoordinate + "," + yCoordinate)) {
                        x = xCoordinate;
                        y = yCoordinate;

                        maxDistance = Math.max(maxDistance, x * x + y * y);
                    } else { // hits an obstacle;
                        break;
                    }
                }
            }
        }
        return maxDistance;
    }
}