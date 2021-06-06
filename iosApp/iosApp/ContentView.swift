import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greeting()
    let usernames = Data().getUserNames()
	var body: some View {
        Text(usernames.joined())
        
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
	ContentView()
	}
}
