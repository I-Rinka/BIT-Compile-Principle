import Data.List

multiplyMatrix :: Num x => [[x]] -> [[x]] -> [[x]]
multiplyMatrix x y = zipWith (zipWith (+)) x y


getMatrix n =
  let rowIndex n k = [x | x <- [1,2..n]]
  in [rowIndex n k | k <- [1,2..n]]

main = do
  let matrix_size = 1500::Int
  let matrix1 = getMatrix matrix_size --得到两个1500*1500的矩阵
  let matrix2 = getMatrix matrix_size

  let product = multiplyMatrix matrix1 matrix2
  print product
