import Data.List

multiplyMatrix :: Num x => [[x]] -> [[x]] -> [[x]]
multiplyMatrix x y = [ [ sum $ zipWith (*) x_row y_col | y_col <- (transpose y) ] | x_row <- x ]


getMatrix n =
  let rowIndex n k = [x | x <- [1,2..n]]
  in [rowIndex n k | k <- [1,2..n]]

main = do
  let matrix_size = 1000::Int
  let matrix1 = getMatrix matrix_size --得到两个1000*1000的矩阵
  let matrix2 = getMatrix matrix_size

  let product = multiplyMatrix matrix1 matrix2
  print product
