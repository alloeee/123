#include <iostream>
#include <string>
#include<fstream>

int main() {
    // Flush after every std::cout / std:cerr
    std::cout << std::unitbuf;
    std::cerr << std::unitbuf;


    std::cout << "$ ";

    const char* home=std::getenv("HOME");
    std::string historyPath=std::string(home)+"/.kubsh_history";

    std::string input;
    //std::getline(std::cin, input);
    while (std::getline(std::cin, input))
    {
        std::ofstream history(historyPath,std::ios::app);
        history << input<<"\n";
        std::cout << "$ ";
        if (input == "\\q")
            break;
        if (input.substr(0, 5) == "echo ")
        {
            std::cout << input.substr(5);
        }
        else
        {
            std::cout << input << ": command not found\n";
        }
    }
}
