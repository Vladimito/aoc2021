

fn main(){
    //Part 1
    let data: Vec<u32> = include_str!("../input.txt")
    .lines()
    .map(|line| line.parse::<u32>().expect("Not a number!"))
    .collect();
    let mut increment = 0;
    let mut size = 0;
    let mut val = data[0];

    for depth in data.into_iter() {
        size = size + 1;
        if depth > val{
            increment = increment + 1;
        }
        val = depth;
    }
    println!("Number of increases: {}", increment);
}
