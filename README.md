# minimumPrice
    Find the minimum price of purchase.

## k-combination of N elements.(all subsets)
    We can generalize this problem into the minimal sum of all possible k-combination of N elements.
    where N >= K, K = [1, ... N]

    For example, In case of purchasing list of product a,b and c there are 5 non empty subsets
    [a, b, c] [ab c] [ac b] [a bc] [a b c] of combination of purchasing. A discount can be applied to bundled items.
    For instance, bundle of purchase 'ab' and 'bc' has discount.

    Here's more concrete example. let a,b,c are 1,2,3$ respectively. We need 1 + 2 + 3 = 6$ for total.
    but 'ab' bundle price is 2.5$, the total is 2.5 + 3 = 5.5$. If 'bc' bundle is 4$, the total is 1 + 4 = 5$.
    Therefore, the minimum cost of purchasing is 'a' + 'bc' 5$.

## implementation.
    There is a table of discount item. When API is called with purchased item list, we can calculate all subsets of
    the purchase. After the calculation, the API queries the table to find bundles price.

    ## limitation
    In real life implementation, there must be another field within item entity to indicate the type of item.
    You can imagine, item 'a' is an apple and 'b' is a banana. Or 'a' and 'b' both are apples.
    